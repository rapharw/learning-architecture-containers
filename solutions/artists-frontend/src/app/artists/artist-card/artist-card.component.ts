import { Component, Input, OnInit } from '@angular/core';
import { Artist } from '../models/Artist';

@Component({
  selector: 'app-artist-card',
  templateUrl: './artist-card.component.html',
  styleUrls: ['./artist-card.component.scss']
})
export class ArtistCardComponent implements OnInit {

  @Input() artist: Artist = new Artist();

  constructor() { }

  ngOnInit(): void {
  }

  public seePosts(artist: Artist){
    console.log('see posts artist: ' + artist.name)
  }

  public seeMore(artist: Artist){
    console.log('see more artist: ' + artist.name)
  }

}
