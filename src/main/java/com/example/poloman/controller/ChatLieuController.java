package com.example.poloman.controller;

import com.example.poloman.entity.ChatLieu;
import com.example.poloman.service.ChatLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chatlieu")
public class ChatLieuController {

    @Autowired
    private ChatLieuService chatLieuService;

    @GetMapping("/getAll")
    public List<ChatLieu> getAll() {
        return chatLieuService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody ChatLieu chatLieu){
        chatLieuService.save(chatLieu);
        return ResponseEntity.ok(chatLieu);
    }

    @PutMapping("/update/{machatlieu}")
    public ResponseEntity<?> update(@PathVariable Integer machatlieu, @RequestBody ChatLieu chatLieu) {
        chatLieuService.save(chatLieu);
        return ResponseEntity.ok(chatLieu);
    }



}
