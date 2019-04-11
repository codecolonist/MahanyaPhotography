import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private route:ActivatedRoute) { }

  lastName: string;

  title="Welcome to MahanyaRam Photography ";

  ngOnInit() {

    this.route.paramMap.subscribe(

      params => {

       this.lastName = params.get("lastName");

      }
    )
  }

}
