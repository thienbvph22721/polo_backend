package com.example.poloman.service.impl;

import com.example.poloman.entity.KhuyenMai;
import com.example.poloman.repository.KhuyenMaiRepository;
import com.example.poloman.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {

    @Autowired
    private KhuyenMaiRepository khuyenMaiRepository;

    @Override
    public List<KhuyenMai> getAll() {
        return khuyenMaiRepository.findAll();
    }

    @Override
    public KhuyenMai save(KhuyenMai khuyenMai) {
        return khuyenMaiRepository.save(khuyenMai);
    }
}
