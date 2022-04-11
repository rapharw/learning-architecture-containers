package br.com.artistworks.handler.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Slf4j
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Método que intercepta toda BusinessException, retornando um ResponseEntity
     * @param ex
     * @param request
     * @return
     */
    @ExceptionHandler(value= {Exception.class})
    public ResponseEntity<Object> handleConflict(Exception ex, WebRequest request) {
        log.info("Exception | {} - {} - {}", request.getSessionId(), request.getContextPath(), ex.getMessage());

        String errorMessage = "Error on operation";

        if(!(ex.getCause() instanceof Exception))
            errorMessage = ex.getMessage();

        return handleExceptionInternal(ex,
                new RestException(errorMessage, 500),
                HttpHeaders.EMPTY,
                HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

}

