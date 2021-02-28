import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListAllSessionsComponent } from './list-all-sessions.component';

describe('ListAllSessionsComponent', () => {
  let component: ListAllSessionsComponent;
  let fixture: ComponentFixture<ListAllSessionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListAllSessionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListAllSessionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
