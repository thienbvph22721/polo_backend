package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.DongSP;

import java.util.List;

public interface DongSPService {

    List<DongSP> getAll();

    DongSP save(DongSP dongSP);

    void delete(Integer madongsp);

}
