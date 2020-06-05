import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CasashowListComponent } from './casashow-list.component';

describe('CasashowListComponent', () => {
  let component: CasashowListComponent;
  let fixture: ComponentFixture<CasashowListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CasashowListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CasashowListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
