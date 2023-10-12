package com.example.poloman.controller;

import com.example.poloman.entity.ChiTietSanPham;
import com.example.poloman.entity.GioHang;
import com.example.poloman.entity.GioHangChiTiet;
import com.example.poloman.service.ChiTietSanPhamService;
import com.example.poloman.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/giohang")
public class GioHangController {

    @Autowired
    private GioHangService gioHangService;

    @GetMapping("/getAll")
    public List<GioHang> getAll() {
        return gioHangService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody GioHang gioHang) {
        gioHangService.save(gioHang);
        return ResponseEntity.ok(gioHang);
    }

    @PutMapping("/update/{magiohang}")
    public ResponseEntity<?> update(@PathVariable Integer magiohang, @RequestBody GioHang gioHang) {
        gioHangService.save(gioHang);
        return ResponseEntity.ok(gioHang);
    }

    @DeleteMapping("delete/{magiohang}")
    public void delete(@PathVariable Integer magiohang) {
        gioHangService.delete(magiohang);
    }
}
