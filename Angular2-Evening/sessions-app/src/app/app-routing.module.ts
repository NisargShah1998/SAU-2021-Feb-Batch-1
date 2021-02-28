import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListAllSessionsComponent } from './list-all-sessions/list-all-sessions.component';

const routes: Routes = [
  {
    path:"**",
    component:ListAllSessionsComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
