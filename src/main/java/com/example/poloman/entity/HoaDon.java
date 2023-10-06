package com.example.poloman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "hoadon")
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mahoadon;


    private Date ngaytao;
    private Integer trangthai;
    private String ghichu;
    private Date ngaythanhtoan;

    @ManyToOne
    @JoinColumn(name = "khachhang")
    private KhachHang khachhang;

    @ManyToOne
    @JoinColumn(name = "nhanvien")
    private NhanVien nhanVien;


}
