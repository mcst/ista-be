package com.ista.isp.assessment.todo;

public class TodoItem {

    private final long id;
    private final String content;
    private final boolean finished;
    private final boolean marked;

    public TodoItem(long id, String content, boolean finished, boolean marked) {
        this.id = id;
        this.content = content;
        this.finished = finished;
        this.marked = marked;
    }

    public boolean getMarked() {
        return marked;
    }

    public boolean getFinished() {
        return finished;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

