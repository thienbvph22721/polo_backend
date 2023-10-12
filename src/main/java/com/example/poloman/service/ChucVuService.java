package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.ChucVu;

import java.util.List;

public interface ChucVuService {

    List<ChucVu> getAll();

    ChucVu save(ChucVu chucVu);

    void delete(Integer machucvu);

}
