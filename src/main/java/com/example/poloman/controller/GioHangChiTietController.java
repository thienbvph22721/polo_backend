package com.example.poloman.controller;

import com.example.poloman.entity.GioHangChiTiet;
import com.example.poloman.service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("giohangchitiet")
public class GioHangChiTietController {

    @Autowired
    private GioHangChiTietService gioHangChiTietService;

    @GetMapping("/getAll")
    public List<GioHangChiTiet> getAll() {
        return gioHangChiTietService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody GioHangChiTiet gioHangChiTiet) {
        gioHangChiTietService.save(gioHangChiTiet);
        return ResponseEntity.ok(gioHangChiTiet);
    }

    @PutMapping("/update/{magiohang}")
    public ResponseEntity<?> update(@PathVariable Integer magiohang, @RequestBody GioHangChiTiet gioHangChiTiet) {
        gioHangChiTietService.save(gioHangChiTiet);
        return ResponseEntity.ok(gioHangChiTiet);
    }

    @DeleteMapping("delete/{magiohang}")
    public void delete(@PathVariable Integer magiohang) {
        gioHangChiTietService.delete(magiohang);
    }
}
