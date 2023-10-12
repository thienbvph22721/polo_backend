package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.ThuongHieu;

import java.util.List;

public interface ThuongHieuService {

    List<ThuongHieu> getAll();

    ThuongHieu save(ThuongHieu thuongHieu);

    void delete(Integer mathuonghieu);

}
