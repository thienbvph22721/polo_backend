package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.HoaDon;

import java.util.List;

public interface HoaDonService {

    List<HoaDon> getAll();

    HoaDon save(HoaDon hoaDon);

    void delete(Integer mahoadon);

}
