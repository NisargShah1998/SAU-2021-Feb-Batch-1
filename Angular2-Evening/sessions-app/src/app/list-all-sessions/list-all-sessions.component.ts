import { Component, OnInit } from '@angular/core';
import { Session } from '../modal/session';
import { MatDialog } from '@angular/material/dialog';
import { SessionService } from '../services/session.service';
import { AddSessionComponent } from '../add-session/add-session.component';
import { EditSessionComponent } from '../edit-session/edit-session.component';

@Component({
  selector: 'app-list-all-sessions',
  templateUrl: './list-all-sessions.component.html',
  styleUrls: ['./list-all-sessions.component.scss']
})
export class ListAllSessionsComponent implements OnInit {

  sessions: Session[] = []

  constructor(private sessionService:SessionService, private dialog:MatDialog) { }

  ngOnInit(): void {
    this.sessions = this.sessionService.getAllSessions();
  }

  deleteSession(session:Session){
    this.sessionService.deleteSession(session);

  }

  editSession(session:Session){
    this.dialog.open(EditSessionComponent,{
      data:{
        session:session
      }
    });
  }
}
