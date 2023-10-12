package com.example.poloman.service;

import com.example.poloman.entity.ChiTietSanPham;

import java.util.List;

public interface ChiTietSanPhamService {

    List<ChiTietSanPham> getAll();

    ChiTietSanPham save(ChiTietSanPham chiTietSanPham);

    void delete(Integer mactsp);

}
