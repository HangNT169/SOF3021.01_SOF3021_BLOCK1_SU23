package com.poly.sof3021.B3_CRUDListFixCung.service;

import com.poly.sof3021.B3_CRUDListFixCung.entity.SinhVien;

import java.util.List;

public interface SinhVienService {

    List<SinhVien>getAll();

    SinhVien detailSinhVien(String ma);

    void removeSinhVien(String ma);

    void addSinhVien(SinhVien sinhVien);

}
