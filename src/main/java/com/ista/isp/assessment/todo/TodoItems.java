package com.ista.isp.assessment.todo;

import java.util.List;

public class TodoItems {

    List<TodoItem> items;

    public TodoItems(List<TodoItem> items) {
        this.items = items;
    }

    public List<TodoItem> getItems() {
        return this.items;
    }

}
