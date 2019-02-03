package com.firti.webservice.exceptions.exists;

public class MRequestAlreadyExistsException extends AlreadyExistsException{
    public MRequestAlreadyExistsException() {
        super();
    }

    public MRequestAlreadyExistsException(String message) {
        super(message);
    }
}
