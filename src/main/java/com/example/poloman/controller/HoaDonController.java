package com.example.poloman.controller;

import com.example.poloman.entity.HoaDon;
import com.example.poloman.entity.HoaDonChiTiet;
import com.example.poloman.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoadon")
public class HoaDonController {

    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping("/getAll")
    private List<HoaDon> getAll() {
        return hoaDonService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody HoaDon hoaDon) {
        hoaDonService.save(hoaDon);
        return ResponseEntity.ok(hoaDon);
    }

    @PutMapping("/update/{mahoadon}")
    public ResponseEntity<?> update(@PathVariable Integer mahoadon, @RequestBody HoaDon hoaDon) {
        hoaDonService.save(hoaDon);
        return ResponseEntity.ok(hoaDon);
    }

    @DeleteMapping("delete/{mahoadon}")
    public void delete(@PathVariable Integer mahoadon) {
        hoaDonService.delete(mahoadon);
    }

}
