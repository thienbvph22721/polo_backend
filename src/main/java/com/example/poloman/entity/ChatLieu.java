package com.example.poloman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "chatlieu")
public class ChatLieu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer machatlieu;

    private String tenchatlieu;
}
