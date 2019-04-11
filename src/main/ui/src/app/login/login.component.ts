import { Component, OnInit } from '@angular/core';
import {MpApiService} from '../mp-api.service'

export class logRequest {

  constructor(public email: string,
    public password: string){
    
  }
  
}

export class loginResponse {
  firstName: string;
  lastName: string;
  serviceMessage: string;
}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})



export class LoginComponent implements OnInit {

   logreq: logRequest;
   logres: loginResponse;
   isLogin: boolean;

  constructor(private mpapiservice : MpApiService) { }

  ngOnInit() {
  }
  
  model = new logRequest("example@gmail.com","********");

  userLogin(){

    this.logreq=this.model;

    console.log(this.logreq);

     this.mpapiservice.postcall("userLogin",this.logreq).subscribe(

        res => {

          this.logres=res;
          console.log(this.logres);
        }

     )
    
  }
}
