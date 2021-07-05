import { CategoryWork } from "./categoryWork";

export class ArtistWork {

    constructor(
      public id: number = 0,
      public title: string = 'ArtistWork.title',
      public idArtist: string = 'ArtistWork.idArtist',
      public category: CategoryWork
    ) {}
    
    
}