import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ArtistsListComponent } from './artists/artists-list/artists-list.component';
import { NotFoundComponent } from './errors/not-found/not-found.component';
import { ArtistWorksListComponent } from './artists/artist-works-list/artist-works-list.component';

const routes: Routes = [
  {
    path: 'artists', 
    component: ArtistsListComponent
  },
  {
    path: 'artists/:artistId/works', 
    component: ArtistWorksListComponent
  },
  {
    path: '*', 
    component: NotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
