import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { AddSessionComponent } from './add-session/add-session.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  [x: string]: any;
  title = 'sessions-app';

  constructor(private dialog:MatDialog){}

  addSession() {
    this.dialog.open(AddSessionComponent);
  }
}
