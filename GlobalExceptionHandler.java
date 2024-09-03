package com.ticket.ticketraise.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(CustomerIdNotException.class)
    public ResponseEntity<?> handlerCustomerIdNotFoundException(CustomerIdNotException ex){
        System.out.println("Excption Handler");
        List<String> details = new ArrayList<>();
        details.add(ex.getMessage());
        APIError err = APIError
                            .builder()
                            .status(HttpStatus.BAD_REQUEST)
                            .errors(details)
                            .message("Resource not found !!")
                            .timeStamp(LocalDateTime.now())
                            .build();
        return ResponseEntity.badRequest().body(err);
    }

}
