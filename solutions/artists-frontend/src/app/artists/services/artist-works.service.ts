import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ArtistWork } from '../models/artistWork';

const URL_API = 'http://localhost:8080';

@Injectable({ providedIn: 'root' })
export class ArtistWorksService {
  
    constructor(private http: HttpClient) {}

    findAll(artistId: number) {
        return this.http.get<ArtistWork[]>(`${URL_API}/api/artists/${artistId}/works/`);
    }

}