import { Component, Inject, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ListAllSessionsComponent } from '../list-all-sessions/list-all-sessions.component';
import { Session } from '../modal/session';
import { SessionService } from '../services/session.service';

@Component({
  selector: 'app-edit-session',
  templateUrl: './edit-session.component.html',
  styleUrls: ['./edit-session.component.scss']
})
export class EditSessionComponent implements OnInit {

  sessionForm!: FormGroup;
  session!: Session;
  constructor(private sessionService:SessionService,@Inject(MAT_DIALOG_DATA) public data: any,private dialogRef:MatDialogRef<ListAllSessionsComponent>) { }

  ngOnInit(): void {
    this.session = this.data.session;
    this.sessionForm = new FormGroup({
      title : new FormControl('', Validators.required),
      instructor : new FormControl('', Validators.required),
      description : new FormControl('')
    });
    this.sessionForm.controls['title'].setValue(this.session.title);
    this.sessionForm.controls['instructor'].setValue(this.session.instructor);
    this.sessionForm.controls['description'].setValue(this.session.description);
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

  editSession() {
    const newSession:Session = {
      title : this.title.value,
      instructor : this.instructor.value,
      description : this.description.value
    }
    this.sessionService.editSession(this.session,newSession);
    this.dialogRef.close();
  }

}
