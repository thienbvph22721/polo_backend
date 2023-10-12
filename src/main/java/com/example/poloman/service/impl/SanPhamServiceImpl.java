package com.example.poloman.service.impl;

import com.example.poloman.entity.SanPham;
import com.example.poloman.repository.SanPhamRepository;
import com.example.poloman.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {

    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public SanPham save(SanPham sanPham) {
        return sanPhamRepository.save(sanPham);
    }

    @Override
    public void delete(Integer masanpham) {
        sanPhamRepository.deleteById(masanpham);

    }
}
