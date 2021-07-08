import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { MatDialog } from '@angular/material/dialog';
import { ArtistDialogComponent } from '../artist-dialog/artist-dialog.component';
import { Artist } from '../models/Artist';

@Component({
  selector: 'app-artist-card',
  templateUrl: './artist-card.component.html',
  styleUrls: ['./artist-card.component.scss']
})
export class ArtistCardComponent implements OnInit {

  @Input() artist: Artist = new Artist();

  constructor(public dialog: MatDialog, private router: Router) { }

  ngOnInit(): void {
  }

  public seePosts(artist: Artist){
    this.router.navigate([`artists/works`, artist.id ]);
  }

  public seeMore(artist: Artist){

    let matDialogDataConfig = {
        data: {
          artist
        }
    };

    this.dialog.open(ArtistDialogComponent, matDialogDataConfig);
  
  }
  
}
