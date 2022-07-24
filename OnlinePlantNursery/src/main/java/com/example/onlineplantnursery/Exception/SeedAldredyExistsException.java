package com.example.onlineplantnursery.Exception;

public class SeedAldredyExistsException extends RuntimeException{
    private String message;

    public SeedAldredyExistsException(){};
    public SeedAldredyExistsException(String msg){
        super(msg);
        this.message = msg;
    }
}
