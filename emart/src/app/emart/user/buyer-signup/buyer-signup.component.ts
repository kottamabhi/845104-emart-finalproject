import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmartService } from 'src/app/emart.service';
import { Buyer } from '../../Buyer';

@Component({
  selector: 'app-buyer-signup',
  templateUrl: './buyer-signup.component.html',
  styleUrls: ['./buyer-signup.component.css']
})
export class BuyerSignupComponent implements OnInit {
  
  buyerUsername: string = "";
  buyerPassword: string = "";
  buyerEmail: string = "";
  buyerMobile: number;
  buyerDate: Date;
  buyers: any;
  constructor(protected router: Router, protected emartService: EmartService) {

  }

  ngOnInit(): void {

  }
  addBuyer() {
    let buyer: Buyer = {
      buyerId: 0,
      buyerUsername: this.buyerUsername,
      buyerPassword: this.buyerPassword,
      buyerEmail: this.buyerEmail,
      buyerMobile: this.buyerMobile,
      buyerDate: this.buyerDate

    };

    this.emartService.addBuyer(buyer).subscribe(
      (response: any) => {

      }
    );
    
this.router.navigate(['']);

  }
}
