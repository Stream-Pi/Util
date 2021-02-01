package com.streampi.util.exception;

public class SevereException extends StreamPiException{
    public SevereException(String message)
    {
        super(message);
    }

    public SevereException(String title, String message)
    {
        super(title, message);
    }
}