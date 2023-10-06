package com.example.poloman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "sanpham")
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer masanpham;

    private String tensanpham;
    private Double giaban;
    private Double gianhap;
    private String hinhanh;
    private Integer luotmua;
    private String mota;

    @ManyToOne
    @JoinColumn(name = "thuonghieu")
    private ThuongHieu thuonghieu;

    @ManyToOne
    @JoinColumn(name = "chatlieu")
    private ChatLieu chatlieu;

    @ManyToOne
    @JoinColumn(name = "kieuao")
    private DongSP kieuao;
}
