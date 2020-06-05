import { Component, OnInit } from '@angular/core';
import { CasashowService } from 'src/app/services/casashow.service';
import { Casashow } from 'src/app/common/casashow';
@Component({
  selector: 'app-casashow-list',
  templateUrl: './casashow-list-table.component.html',
  styleUrls: ['./casashow-list.component.css']
})
export class CasashowListComponent implements OnInit {
  casashow: Casashow[];
//injetar nosso casashowService no construtor
  constructor(private casashowService: CasashowService) { }
            //similar a construção do POST
  ngOnInit(){
    this.casashowService.getCasashowList().subscribe(
      data => {
        this.casashow = data; //resulta na assinatura do array (matriz) casashow
      }
    )
  }


}
