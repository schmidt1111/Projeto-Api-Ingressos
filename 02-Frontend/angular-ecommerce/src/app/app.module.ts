import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CasashowListComponent } from './components/casashow-list/casashow-list.component';
import { HttpClientModule } from '@angular/common/http';
import { CasashowService } from "./services/casashow.service";
@NgModule({
  declarations: [
    AppComponent,
    CasashowListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [CasashowService],
  bootstrap: [AppComponent]
})
export class AppModule { }
