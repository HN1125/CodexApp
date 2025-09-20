package com.hb.codex.api.controller.sample;

import java.time.OffsetDateTime;

public class StatusResponse {
    private final String message;
    private final OffsetDateTime timestamp;

    public StatusResponse(String message, OffsetDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }
}
