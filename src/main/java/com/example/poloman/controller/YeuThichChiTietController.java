package com.example.poloman.controller;

import com.example.poloman.entity.Size;
import com.example.poloman.entity.ThuongHieu;
import com.example.poloman.entity.YeuThichChiTiet;
import com.example.poloman.service.SizeService;
import com.example.poloman.service.YeuThichChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/yeuthichchitiet")
public class YeuThichChiTietController {

    @Autowired
    private YeuThichChiTietService yeuThichChiTietService;

    @GetMapping("/getAll")
    public List<YeuThichChiTiet> getAll() {
        return yeuThichChiTietService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody YeuThichChiTiet yeuThichChiTiet) {
        yeuThichChiTietService.save(yeuThichChiTiet);
        return ResponseEntity.ok(yeuThichChiTiet);
    }

    @PutMapping("/update/{madanhsach}")
    public ResponseEntity<?> update(@PathVariable Integer madanhsach, @RequestBody YeuThichChiTiet yeuThichChiTiet) {
        yeuThichChiTietService.save(yeuThichChiTiet);
        return ResponseEntity.ok(yeuThichChiTiet);
    }
    //abcxyz


}
