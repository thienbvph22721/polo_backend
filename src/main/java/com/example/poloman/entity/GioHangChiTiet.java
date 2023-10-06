package com.example.poloman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "giohangchitiet")
public class GioHangChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer magiohang;

    private Integer soluong;
    private Integer trangthai;

    @ManyToOne
    @JoinColumn(name = "giohang")
    private GioHang giohang;

    @ManyToOne
    @JoinColumn(name = "sanpham")
    private SanPham sanpham;


}
