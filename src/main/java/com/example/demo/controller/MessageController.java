package com.example.demo.controller;

import com.example.demo.entity.Message;
import com.example.demo.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService service;

    @GetMapping
    public List<Message> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Message create(@RequestBody Message m) {
        return service.create(m);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
