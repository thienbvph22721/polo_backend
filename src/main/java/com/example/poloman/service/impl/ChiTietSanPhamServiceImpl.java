package com.example.poloman.service.impl;

import com.example.poloman.entity.ChiTietSanPham;
import com.example.poloman.repository.ChiTietSanPhamRepository;
import com.example.poloman.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamRepository.findAll();
    }

    @Override
    public ChiTietSanPham save(ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamRepository.save(chiTietSanPham);
    }

    @Override
    public void delete(Integer mactsp) {
        chiTietSanPhamRepository.deleteById(mactsp);
    }
}
