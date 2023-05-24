package com.poly.sof3021.B8_Bean_DI_IOC.c1;

public class SinhVienController {

    private SinhVienService sinhVienService = new SinhVienService();

    public void demo(){
        sinhVienService.getAll();
    }
}
