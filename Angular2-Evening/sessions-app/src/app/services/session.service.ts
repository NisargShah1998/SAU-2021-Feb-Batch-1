import { Injectable } from '@angular/core';
import { Session } from '../modal/session';

@Injectable({
  providedIn: 'root'
})

export class SessionService {
  sessions_list: Session[] = [
    {
      title: 'Kafka',
      instructor: 'Akash Maharana',
      description: ' It is an open-source software platform developed by the Apache Software Foundation written in Scala and Java.',
    },
    {
      title: 'Junit_Mockito',
      instructor: 'Usha Lather',
      description: 'The framework allows the creation of test double objects in automated unit tests for the purpose of test-driven development',
    },
    {
      title: 'Design Principles',
      instructor: 'Nishant Saurabh',
      description: 'Software design principles are concerned with providing means to handle the complexity of the design process effectively.',
    },
  ]

  constructor() { }

  getAllSessions() {
    return this.sessions_list;
  }

  addSession(session:Session) {
    this.sessions_list.push(session);
  }

  editSession(old:Session,newSession:Session){
    const index = this.sessions_list.indexOf(old);
    this.sessions_list[index] = newSession;
  }

  deleteSession(session:Session){
    const index = this.sessions_list.indexOf(session);
    this.sessions_list.splice(index, 1);
  }
}
