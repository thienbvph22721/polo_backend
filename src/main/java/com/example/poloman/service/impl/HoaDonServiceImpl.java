package com.example.poloman.service.impl;

import com.example.poloman.entity.HoaDon;
import com.example.poloman.repository.HoaDonRepository;
import com.example.poloman.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonServiceImpl implements HoaDonService {

    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Override
    public List<HoaDon> getAll() {
        return hoaDonRepository.findAll();
    }

    @Override
    public HoaDon save(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public void delete(Integer mahoadon) {
        hoaDonRepository.deleteById(mahoadon);
    }
}
