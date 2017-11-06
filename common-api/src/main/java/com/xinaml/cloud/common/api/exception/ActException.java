package com.xinaml.cloud.common.api.exception;


public class ActException extends Exception {

    private static final long serialVersionUID = -4245853247366157120L;

    public ActException() {
        super();
    }

    public ActException(String message) {
        super(message);
    }

    public ActException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
