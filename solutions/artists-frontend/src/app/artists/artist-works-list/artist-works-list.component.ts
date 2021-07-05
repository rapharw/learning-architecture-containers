import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Artist } from '../models/Artist';
import { ArtistWork } from '../models/artistWork';
import { ArtistWorksService } from '../services/artist-works.service';
import { ArtistsService } from '../services/artists.service';

@Component({
  selector: 'app-artist-works-list',
  templateUrl: './artist-works-list.component.html',
  styleUrls: ['./artist-works-list.component.scss']
})
export class ArtistWorksListComponent implements OnInit {

  artist: Artist = new Artist();
  artistWorks: ArtistWork[] = [];

  constructor(private route: ActivatedRoute, 
              private artistWorksService: ArtistWorksService,
              private artistsService: ArtistsService) { }

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      
      let artistId = params['artistId'];

      this.artistWorksService.findAll(artistId)
                              .subscribe((artistWorks) => {
                                this.artistWorks = artistWorks;
      });

      this.artistsService.findById(artistId)
                              .subscribe((artist) => {
                                this.artist = artist;
      });

   });
  }

}
