package com.genqrcode.exceptions;

import java.io.IOException;

/**
 * Signals that the client has been rate limited.
 */
public class RateLimitedException extends IOException {

    public RateLimitedException() {
        super("Client has been rate limited");
    }
}
