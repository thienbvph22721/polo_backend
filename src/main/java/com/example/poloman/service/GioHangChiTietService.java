package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.GioHangChiTiet;

import java.util.List;

public interface GioHangChiTietService {

    List<GioHangChiTiet> getAll();

    GioHangChiTiet save(GioHangChiTiet gioHangChiTiet);

    void delete(Integer magiohang);

}
