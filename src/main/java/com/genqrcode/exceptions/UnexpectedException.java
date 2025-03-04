package com.genqrcode.exceptions;

import java.io.IOException;

/**
 * Signals that the client has been rate limited.
 */
public class UnexpectedException extends IOException {

    public UnexpectedException(String message) {
        super(message);
    }
}
