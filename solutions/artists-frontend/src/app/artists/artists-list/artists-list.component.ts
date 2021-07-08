import { Component, OnInit } from '@angular/core';
import { Artist } from '../models/Artist';
import { ArtistsService } from '../services/artists.service';

@Component({
  selector: 'app-artists-list',
  templateUrl: './artists-list.component.html',
  styleUrls: ['./artists-list.component.scss']
})
export class ArtistsListComponent implements OnInit {

  artists: Artist[] = [];

  constructor(private artistsService: ArtistsService) { }

  ngOnInit(): void {

    this.populateArtists();

  }

  populateArtists(){
    
    this.artistsService.
      findAll()
      .subscribe((artists) => {
        this.artists = artists;
      });
    
  }

}
