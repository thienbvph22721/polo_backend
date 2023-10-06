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
@Table(name = "khachhang")
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer makhachhang;

    private String tenkhachhang;
    private Date ngaysinh;
    private String sodienthoai;
    private String diachi;
    private String email;
    private Boolean gioitinh;
    private String matkhau;

}
