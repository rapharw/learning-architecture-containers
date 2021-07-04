package br.com.artistworks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Category {

    private String work;
    private String type;

    public Category(CategoryValuesStub cv){
        this.work = cv.name();
        this.type = cv.getValue();
    }
}
