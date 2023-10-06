package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.YeuThichChiTiet;

import java.util.List;

public interface YeuThichChiTietService {

    List<YeuThichChiTiet> getAll();

    YeuThichChiTiet save(YeuThichChiTiet yeuThichChiTiet);

}
