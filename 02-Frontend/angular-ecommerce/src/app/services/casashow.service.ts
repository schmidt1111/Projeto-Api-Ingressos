import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Casashow } from '../common/casashow';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CasashowService {

  private baseUrl = 'http://localhost:8081/api/casashow/';

                //injec HttpClient
  constructor(private httpClient: HttpClient) { }
    //returns um observable um mapa dados do json para spring data rest de um matriz(array) de casashow
  getCasashowList(): Observable<Casashow[]> {
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(response => response._embedded.casashow)
    );
  }
}
  interface GetResponse {
    _embedded:{
      casashow:Casashow[];
    }
  }

