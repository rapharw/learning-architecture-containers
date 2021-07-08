import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FlexLayoutModule } from '@angular/flex-layout';
import { HttpClientModule } from '@angular/common/http';

import { ArtistsListComponent } from './artists-list/artists-list.component';
import { ArtistWorksListComponent } from './artist-works-list/artist-works-list.component';
import { MaterialModule } from '../material.module';
import { SharedModule } from '../shared/shared.module';
import { ArtistCardComponent } from './artist-card/artist-card.component';
import { ArtistDialogComponent } from './artist-dialog/artist-dialog.component';


const components = [
  ArtistsListComponent, ArtistWorksListComponent, ArtistCardComponent, ArtistDialogComponent
];

@NgModule({
  declarations: components,
  imports: [
    CommonModule,
    FlexLayoutModule,
    HttpClientModule,

    SharedModule,
    MaterialModule
  ]
})
export class ArtistsModule { }
