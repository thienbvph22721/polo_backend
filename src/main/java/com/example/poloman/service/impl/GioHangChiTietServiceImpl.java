package com.example.poloman.service.impl;

import com.example.poloman.entity.GioHangChiTiet;
import com.example.poloman.repository.GioHangChiTietRepository;
import com.example.poloman.service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangChiTietServiceImpl implements GioHangChiTietService {

    @Autowired
    private GioHangChiTietRepository gioHangChiTietRepository;

    @Override
    public List<GioHangChiTiet> getAll() {
        return gioHangChiTietRepository.findAll();
    }

    @Override
    public GioHangChiTiet save(GioHangChiTiet gioHangChiTiet) {
        return gioHangChiTietRepository.save(gioHangChiTiet);
    }

    @Override
    public void delete(Integer magiohang) {
        gioHangChiTietRepository.deleteById(magiohang);

    }
}
