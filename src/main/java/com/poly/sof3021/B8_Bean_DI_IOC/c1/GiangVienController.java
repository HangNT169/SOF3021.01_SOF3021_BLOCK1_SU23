package com.poly.sof3021.B8_Bean_DI_IOC.c1;

public class GiangVienController {

    private SinhVienService sinhVienService = new SinhVienService();

    public void demo11(){
        sinhVienService.getAll();
    }
}
