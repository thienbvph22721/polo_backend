package com.example.poloman.service;

import com.example.poloman.entity.HoaDonChiTiet;

import java.util.List;

public interface HoaDonChiTietService {

    List<HoaDonChiTiet> getAll();

    HoaDonChiTiet save(HoaDonChiTiet hoaDonChiTiet);

    void delete(Integer mahoadon);

}
