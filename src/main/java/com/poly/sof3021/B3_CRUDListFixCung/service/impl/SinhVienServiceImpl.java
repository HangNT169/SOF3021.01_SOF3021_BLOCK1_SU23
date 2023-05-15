package com.poly.sof3021.B3_CRUDListFixCung.service.impl;

import com.poly.sof3021.B3_CRUDListFixCung.entity.SinhVien;
import com.poly.sof3021.B3_CRUDListFixCung.service.SinhVienService;

import java.util.ArrayList;
import java.util.List;

public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienServiceImpl() {
        lists.add(new SinhVien("HE130461", "Nguyen Thuy Hang", 10, "Ha Noi", false));
        lists.add(new SinhVien("HE130462", "Nguyen Hoang Tien", 11, "Ha Noi1", true));
        lists.add(new SinhVien("HE130463", "Nguyen Anh Dung", 15, "Ha Noi3", true));
        lists.add(new SinhVien("HE130464", "Vu Van Nguyen", 14, "Ha Noi6", true));
        lists.add(new SinhVien("HE130465", "Tran Tuan Phong", 20, "Ha Noi7", true));
    }

    @Override
    public List<SinhVien> getAll() {
        return lists;
    }

    @Override
    public SinhVien detailSinhVien(String ma) {
        for (SinhVien sv : lists) {
            if (sv.getMa().equalsIgnoreCase(ma)) {
                return sv;
            }
        }
        return null;
    }

    @Override
    public void removeSinhVien(String ma) {
        // tim sv
        SinhVien sinhVien = detailSinhVien(ma);
        // xoa
        lists.remove(sinhVien);
    }

    @Override
    public void addSinhVien(SinhVien sinhVien) {
        lists.add(sinhVien);
    }
}
