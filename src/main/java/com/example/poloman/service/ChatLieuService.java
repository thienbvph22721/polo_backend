package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;

import java.util.List;
import java.util.UUID;

public interface ChatLieuService {
    List<ChatLieu> getAll();

    ChatLieu save(ChatLieu chatLieu);

    void delete(Integer machatlieu);

}
