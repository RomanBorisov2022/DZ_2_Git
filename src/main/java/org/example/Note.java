package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private String content;
    private LocalDateTime timestamp;

    public Note(String content) {
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String getFormattedTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return timestamp.format(formatter);
    }

    public String getContent() {
        return content;
    }
}

