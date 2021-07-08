import { Component, Input, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Inject } from '@angular/core';
import { Artist } from '../models/Artist';

@Component({
  selector: 'app-artist-dialog',
  templateUrl: './artist-dialog.component.html',
  styleUrls: ['./artist-dialog.component.scss']
})
export class ArtistDialogComponent implements OnInit {

  artist: Artist;

  constructor(@Inject(MAT_DIALOG_DATA) private artistConfig: any) {
    this.artist = artistConfig.artist;
  }

  ngOnInit(): void {
  }

}
