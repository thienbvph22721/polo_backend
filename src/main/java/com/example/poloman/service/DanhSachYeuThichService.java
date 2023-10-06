package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.DanhSachYeuThich;

import java.util.List;

public interface DanhSachYeuThichService {

    List<DanhSachYeuThich> getAll();

    DanhSachYeuThich save(DanhSachYeuThich danhSachYeuThich);


}
