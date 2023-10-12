package com.example.poloman.service;

import com.example.poloman.entity.GioHang;

import java.util.List;

public interface GioHangService {

    List<GioHang> getAll();

    GioHang save(GioHang gioHang);

    void delete(Integer magiohang);

}
