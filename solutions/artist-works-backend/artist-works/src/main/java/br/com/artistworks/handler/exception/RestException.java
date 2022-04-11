package br.com.artistworks.handler.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RestException {

    private String mensagem;
    private int status;

}
