package com.epam.mjc;

public class CustomIllegalArgumentException extends IllegalArgumentException{

    public CustomIllegalArgumentException(long id){
        super(message(id));
    }

    private static String message(long id){
        return "Could not find student with ID " + id;
    }
}
