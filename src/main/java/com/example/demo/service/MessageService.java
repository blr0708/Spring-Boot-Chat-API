package com.example.demo.service;

import com.example.demo.entity.Message;
import com.example.demo.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository repository;

    public List<Message> getAll() {
        return repository.findAll();
    }

    public Message create(Message m) {
        return repository.save(m);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
