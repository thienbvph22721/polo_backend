package com.example.poloman.controller;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.entity.ChiTietSanPham;
import com.example.poloman.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ctsp")
public class ChiTietSanPhamController {

    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    @GetMapping("/getAll")
    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamService.getAll();
    }


    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody ChiTietSanPham chiTietSanPham){
        chiTietSanPhamService.save(chiTietSanPham);
        return ResponseEntity.ok(chiTietSanPham);
    }

    @PutMapping("/update/{mactsp}")
    public ResponseEntity<?> update(@PathVariable Integer mactsp, @RequestBody ChiTietSanPham chiTietSanPham) {
        chiTietSanPhamService.save(chiTietSanPham);
        return ResponseEntity.ok(chiTietSanPham);
    }

}
