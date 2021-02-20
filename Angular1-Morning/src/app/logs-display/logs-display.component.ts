import { Input } from '@angular/core';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-logs-display',
  templateUrl: './logs-display.component.html',
  styleUrls: ['./logs-display.component.css']
})
export class LogsDisplayComponent implements OnInit {

  @Input('logs') logs : any ;

  constructor() { }

  ngOnInit(): void {
  }

}
