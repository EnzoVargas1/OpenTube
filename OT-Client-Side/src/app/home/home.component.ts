import { Component, Input, OnInit } from '@angular/core';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  public searchInput:string = '';
  public vids: Array<string> = ['Gasoline', 'SAD!', 'Java 101', 'bet', 
  'stuff', 'Before I Forget', 'maladaptive daydreaming', 'Python 101', 'enzo'];
  public results: Array<string> = [];

  constructor() { }

  ngOnInit(): void {
  }

  fetchSeries(value: any):void{
    if(value.length === 1){
      this.results = this.vids.filter((name) => name.substring(0, this.searchInput.length).toLowerCase().trim()
       == this.searchInput.toLowerCase().trim());
      console.log(this.searchInput);
      console.log(this.results);
     }
     else if(value.toLowerCase() === 'backspace'){
      this.searchInput = this.searchInput.substring(0, this.searchInput.length-1);
     }
  }

}
