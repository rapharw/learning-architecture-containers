import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArtistWorksListComponent } from './artist-works-list.component';

describe('ArtistWorksListComponent', () => {
  let component: ArtistWorksListComponent;
  let fixture: ComponentFixture<ArtistWorksListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ArtistWorksListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ArtistWorksListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
