package com.example.poloman.service;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.Size;

import java.util.List;

public interface SizeService {

    List<Size> getAll();

    Size save(Size size);

}
