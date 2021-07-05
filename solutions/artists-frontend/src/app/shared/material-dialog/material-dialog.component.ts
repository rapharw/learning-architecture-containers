import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-material-dialog',
  templateUrl: './material-dialog.component.html',
  styleUrls: ['./material-dialog.component.scss']
})
export class MaterialDialogComponent implements OnInit {

  @Input() title: string = '';
  
  constructor() { }

  ngOnInit(): void {
  }

}