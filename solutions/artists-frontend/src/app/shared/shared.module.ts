import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MaterialModule } from '../material.module';

import { AButtonComponent } from './a-button/a-button.component';
import { MaterialCardComponent } from './material-card/material-card.component';
import { MaterialNavigationComponent } from './material-navigation/material-navigation.component';

const components = [
  AButtonComponent, MaterialCardComponent, MaterialNavigationComponent
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
