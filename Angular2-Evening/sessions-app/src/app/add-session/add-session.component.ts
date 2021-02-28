import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Session } from '../modal/session';
import { SessionService } from '../services/session.service';
import { MatDialogRef } from '@angular/material/dialog';
import { ListAllSessionsComponent } from '../list-all-sessions/list-all-sessions.component'
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-add-session',
  templateUrl: './add-session.component.html',
  styleUrls: ['./add-session.component.scss']
})
export class AddSessionComponent implements OnInit {


  sessionForm!: FormGroup;
  constructor(private sessionService:SessionService, private dialogRef:MatDialogRef<AppComponent>) { }

  ngOnInit(): void {
    this.sessionForm = new FormGroup({
      title : new FormControl('', Validators.required),
      instructor : new FormControl('', Validators.required),
      description : new FormControl('')
    });
  }

  get title() {
    return this.sessionForm.get('title') as FormControl;
  }

  get instructor() {
    return this.sessionForm.get('instructor') as FormControl;
  }

  get description() {
    return this.sessionForm.get('description') as FormControl;
  }


  addToList() {
    const session:Session = {
      title : this.title.value,
      instructor : this.instructor.value,
      description : this.description.value
    }
    this.sessionService.addSession(session);
    this.dialogRef.close();
  }

}
