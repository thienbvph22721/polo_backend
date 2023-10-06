package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;

import java.util.List;

public interface ChatLieuService {
    List<ChatLieu> getAll();

    ChatLieu save(ChatLieu chatLieu);




}
