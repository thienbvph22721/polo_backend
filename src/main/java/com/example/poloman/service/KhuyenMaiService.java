package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.KhuyenMai;

import java.util.List;

public interface KhuyenMaiService {

    List<KhuyenMai> getAll();

    KhuyenMai save(KhuyenMai khuyenMai);

}
