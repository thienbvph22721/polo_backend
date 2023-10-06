package com.example.poloman.service.impl;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.repository.ChatLieuRepository;
import com.example.poloman.service.ChatLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatLieuServiceImpl implements ChatLieuService {

    @Autowired
    private ChatLieuRepository chatLieuRepository;

    @Override
    public List<ChatLieu> getAll() {
        return chatLieuRepository.findAll();
    }

    @Override
    public ChatLieu save(ChatLieu chatLieu) {
        return chatLieuRepository.save(chatLieu);
    }
}
