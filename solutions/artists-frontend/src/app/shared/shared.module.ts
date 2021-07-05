import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AButtonComponent } from './a-button/a-button.component';
import { MaterialModule } from '../material.module';
import { MaterialCardComponent } from './material-card/material-card.component';
import { MaterialNavigationComponent } from './material-navigation/material-navigation.component';
import { MaterialDialogComponent } from './material-dialog/material-dialog.component';

const components = [
  AButtonComponent, MaterialCardComponent, MaterialNavigationComponent, MaterialDialogComponent
]

@NgModule({
  declarations: components,
  imports: [
    CommonModule,
    MaterialModule
  ],
  exports: components
})
export class SharedModule { }
