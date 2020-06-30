package io.chr1s.designpattern.pubsub;

public abstract class Post {

    private String message;

    Post(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
