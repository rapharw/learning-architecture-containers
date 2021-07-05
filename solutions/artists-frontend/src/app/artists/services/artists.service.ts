import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Artist } from '../models/Artist';

const URL_API = 'http://localhost:8080';

@Injectable({ providedIn: 'root' })
export class ArtistsService {
  
    constructor(private http: HttpClient) {}

    findAll() {
        return this.http.get<Artist[]>(`${URL_API}/api/artists/`);
    }

    findById(id: number) {
        return this.http.get<Artist>(`${URL_API}/api/artists/${id}/`);
    }

}