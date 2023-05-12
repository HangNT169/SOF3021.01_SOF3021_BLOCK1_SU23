package com.poly.sof3021.B3_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
// @Builder : Co the tao contructor voi so tham so mong muon (2 hoawcj 3 ...)
public class SinhVien {

    private String ma;

    private String ten;

    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;
    // @Data : Khong duoc dung <=> Import *
    // Ctrl Alt O : Xoa import thua

}
