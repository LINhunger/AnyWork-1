package com.qg.AnyWork.exception.user;

/**
 * Created by FunriLy on 2017/7/10.
 * From small beginnings comes great things.
 */
public class UserNotLogin extends RuntimeException {

    public UserNotLogin(String message){
        super(message);
    }

    public UserNotLogin(String message, Throwable cause){
        super(message, cause);
    }
}
