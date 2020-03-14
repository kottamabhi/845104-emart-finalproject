import { Component, OnInit } from '@angular/core';
import { EmartService } from 'src/app/emart.service';
import { Router } from '@angular/router';
import { Seller } from '../../Seller';

@Component({
  selector: 'app-seller-signup',
  templateUrl: './seller-signup.component.html',
  styleUrls: ['./seller-signup.component.css']
})
export class SellerSignupComponent implements OnInit {
  sellerUsername: string = "";
  sellerPassword: string = "";
  sellerCompany: string = "";
  sellerBrief: string = "";
  sellerGst: number;
  sellerAddress:string = "";
  sellerEmail: string = "";
  sellerContact: number;
  sellerWebsite:string = "";
  seller:any;

  constructor(protected emartService:EmartService,protected router:Router) { }

  ngOnInit(): void {
  }


  addSeller(){
    
    let seller:Seller = {
      sellerId:0,
      sellerUsername:this.sellerUsername,
      sellerPassword:this.sellerPassword,
      sellerCompany:this.sellerCompany,
      sellerBrief:this.sellerBrief,
      sellerGst:this.sellerGst,
      sellerAddress:this.sellerAddress,
      sellerEmail:this.sellerEmail,
      sellerContact:this.sellerContact,
      sellerWebsite:this.sellerWebsite
      
      };
    
    this.emartService.addSeller(seller).subscribe(
      (response: any)=>{
        //this.sellers.push(response);
      }
    );
   /* this.busername = '';
    this.bpassword = '';
    this.bemail='';
    this.bmobile=null,
    this.bdate=null*/

    this.router.navigate(['/']);
  

}
}
