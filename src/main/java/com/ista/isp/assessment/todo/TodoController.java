package com.ista.isp.assessment.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 1000)
@RestController
public class TodoController {

    private final AtomicLong counter = new AtomicLong();
    private final List<TodoItem> listItems = new ArrayList<TodoItem>();

    @GetMapping("/api/todos")
    public TodoItems get() {
        return new TodoItems(listItems);

    }

    @PostMapping("/api/todos")
    public TodoItem post(@RequestBody TodoItem reqItem) {
        TodoItem item = new TodoItem(counter.incrementAndGet(), reqItem.getContent(), reqItem.getFinished(), reqItem.getMarked());
        listItems.add(0, item);
        return item;
    }

    @DeleteMapping("/api/todos/{id}")
    public TodoItems delete(@PathVariable long id) {
        listItems.removeIf(item -> item.getId() == id);
        return new TodoItems(listItems);
    }

    @PutMapping("/api/todos/{id}")
    public TodoItem put(@PathVariable long id, @RequestBody TodoItem reqItem) {
        listItems.replaceAll(item -> item.getId() == id ? reqItem : item);
        return reqItem;
    }
}
