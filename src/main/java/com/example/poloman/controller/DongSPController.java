package com.example.poloman.controller;

import com.example.poloman.entity.ChucVu;
import com.example.poloman.entity.DanhSachYeuThich;
import com.example.poloman.entity.DongSP;
import com.example.poloman.service.DongSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dongsp")
public class DongSPController {

    @Autowired
    private DongSPService dongSPService;

    @GetMapping("/getAll")
    public List<DongSP> getAll() {
        return dongSPService.getAll();
    }


    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody DongSP dongSP){
        dongSPService.save(dongSP);
        return ResponseEntity.ok(dongSP);
    }

    @PutMapping("/update/{madongsp}")
    public ResponseEntity<?> update(@PathVariable Integer madongsp, @RequestBody DongSP dongSP) {
        dongSPService.save(dongSP);
        return ResponseEntity.ok(dongSP);
    }

}
