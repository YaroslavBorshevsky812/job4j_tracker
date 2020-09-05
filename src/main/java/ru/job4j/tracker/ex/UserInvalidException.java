package ru.job4j.tracker.ex;

public class UserInvalidException extends UserNotFoundException{
    public UserInvalidException (String massage){
        super(massage);
    }
}
