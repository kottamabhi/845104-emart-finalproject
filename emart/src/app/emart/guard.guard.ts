import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { EmartService } from '../emart.service';

@Injectable({
  providedIn: 'root'
})
export class GuardGuard implements CanActivate {
constructor(protected emartService: EmartService,protected router: Router){}
  canActivate(route:ActivatedRouteSnapshot,state:RouterStateSnapshot):boolean
  {
    const userExist = !!this.emartService.existBuyer();
    if(userExist)
    {
      return true;
    }
    else{
      this.router.navigate(['']);
    }
  }
    
  
}
