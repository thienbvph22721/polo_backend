package com.example.poloman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "chucvu")
public class ChucVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer machucvu;

    private String tenchucvu;
}
