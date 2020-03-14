import { Component, OnInit } from '@angular/core';
import { EmartService } from 'src/app/emart.service';
import { Router } from '@angular/router';
import { Item } from '../../Item';

@Component({
  selector: 'app-cart-list',
  templateUrl: './cart-list.component.html',
  styleUrls: ['./cart-list.component.css']
})
export class CartListComponent implements OnInit {
  cartItems: any;
  showCart: boolean;
  isEmpty: boolean;
  
  constructor(protected emartService: EmartService,protected router: Router) { }

  ngOnInit(): void {
    
    this.cartItems = this.emartService.getAllCart();
    if(this.cartItems.length==0){
      this.showCart=false;
    }
    else{
      this.showCart=true;
    }
  }
  deleteCartItem(itemId: number){
    this.cartItems = this.emartService.deleteCartItem(itemId);
    if(this.cartItems.length==0){
      this.isEmpty=false;
    }
    else{
      this.isEmpty=true;
    }
  }
   
}

