package com.example.yin.service;

import com.example.yin.domain.Consumer;

import java.util.List;

public interface ConsumerService {
    boolean addUser(Consumer consumer);

    List<Consumer> allUser();
}
