package com.example.onlineplantnursery.Controller;
import com.example.onlineplantnursery.Exception.NoSuchSeedExistsException;
import com.example.onlineplantnursery.Exception.SeedAldredyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.example.onlineplantnursery.Exception.ErrorResponse;

@ControllerAdvice

public class GlobalExceptionHandler {
    @ExceptionHandler(value = NoSuchSeedExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody ErrorResponse handleException(NoSuchSeedExistsException ex){
        return  new ErrorResponse(
                HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }
    @ExceptionHandler(value = SeedAldredyExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody ErrorResponse handleException(SeedAldredyExistsException ex){
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage() );
    }
}
