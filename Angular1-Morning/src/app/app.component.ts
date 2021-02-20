import { Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  logs : Array<any> = [];
  inputText : string ;

  constructor() { 
    this.inputText = "";
  }

  ngOnInit(): void {
  }

  keypressed(event : any)
  {
    this.inputText = event.target.value;
    this.logs.push({date : new Date() ,text : this.inputText});
  }

}
