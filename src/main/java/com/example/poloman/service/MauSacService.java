package com.example.poloman.service;

import com.example.poloman.entity.MauSac;

import java.util.List;

public interface MauSacService {

    List<MauSac> getAll();

    MauSac save(MauSac mauSac);

    void delete(Integer mamausac);

}
