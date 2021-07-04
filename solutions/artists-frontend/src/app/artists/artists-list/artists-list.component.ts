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
    
    // this.artists.push(new Artist(1, 'Lorem Ipsum 01', '1900-01-01'));
    // this.artists.push(new Artist(2, 'Lorem Ipsum 02', '1900-01-02'));
    // this.artists.push(new Artist(3, 'Lorem Ipsum 03', '1900-01-03'));
    // this.artists.push(new Artist(4, 'Lorem Ipsum 04', '1900-01-03'));
    // this.artists.push(new Artist(5, 'Lorem Ipsum 05', '1900-01-03'));
    // this.artists.push(new Artist(6, 'Lorem Ipsum 06', '1900-01-03'));
    // this.artists.push(new Artist(7, 'Lorem Ipsum 07', '1900-01-03'));
    // this.artists.push(new Artist(8, 'Lorem Ipsum 08', '1900-01-03'));

    this.artistsService.
      findAll()
      .subscribe((artists) => (this.artists = artists));
    
  }

}
