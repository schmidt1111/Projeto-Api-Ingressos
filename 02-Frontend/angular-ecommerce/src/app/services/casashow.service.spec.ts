import { TestBed } from '@angular/core/testing';

import { CasashowService } from './casashow.service';

describe('CasashowService', () => {
  let service: CasashowService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CasashowService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
