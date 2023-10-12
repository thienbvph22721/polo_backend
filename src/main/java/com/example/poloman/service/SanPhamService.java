package com.example.poloman.service;

import com.example.poloman.entity.SanPham;

import java.util.List;

public interface SanPhamService {

    List<SanPham> getAll();

    SanPham save(SanPham sanPham);

    void delete(Integer masanpham);

}
