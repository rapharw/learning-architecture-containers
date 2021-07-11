package br.com.artistworks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private String work;
    private String type;

    public Category(CategoryValuesStub cv){
        this.work = cv.name();
        this.type = cv.getValue();
    }
}
