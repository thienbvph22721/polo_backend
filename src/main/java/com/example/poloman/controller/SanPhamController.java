package com.example.poloman.controller;

import com.example.poloman.entity.NhanVien;
import com.example.poloman.entity.SanPham;
import com.example.poloman.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sanpham")
public class SanPhamController {

    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("/getAll")
    public List<SanPham> getAll() {
        return sanPhamService.getAll();
    }


    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody SanPham sanPham) {
        sanPhamService.save(sanPham);
        return ResponseEntity.ok(sanPham);
    }


    @PutMapping("/update/{masanpham}")
    public ResponseEntity<?> update(@PathVariable Integer masanpham, @RequestBody SanPham sanPham) {
        sanPhamService.save(sanPham);
        return ResponseEntity.ok(sanPham);
    }
}
