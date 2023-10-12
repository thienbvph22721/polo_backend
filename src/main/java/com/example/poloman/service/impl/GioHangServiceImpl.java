package com.example.poloman.service.impl;

import com.example.poloman.entity.GioHang;
import com.example.poloman.repository.GioHangRepository;
import com.example.poloman.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangServiceImpl implements GioHangService {

    @Autowired
    private GioHangRepository gioHangRepository;

    @Override
    public List<GioHang> getAll() {
        return gioHangRepository.findAll();
    }

    @Override
    public GioHang save(GioHang gioHang) {
        return gioHangRepository.save(gioHang);
    }

    @Override
    public void delete(Integer magiohang) {
        gioHangRepository.deleteById(magiohang);
    }
}
