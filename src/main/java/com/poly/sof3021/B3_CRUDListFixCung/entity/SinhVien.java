package com.poly.sof3021.B3_CRUDListFixCung.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
// @Builder : Co the tao contructor voi so tham so mong muon (2 hoac 3 ...)
public class SinhVien {

    @NotEmpty(message = "Ahihi do ngoc")
    @Min(value = 5)
    private String ma;

    @Pattern(regexp = "[a-z A-Z]+")
    private String ten;

    @NotNull
    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;
    // @Data : Khong duoc dung <=> Import *
    // Ctrl Alt O : Xoa import thua

}
