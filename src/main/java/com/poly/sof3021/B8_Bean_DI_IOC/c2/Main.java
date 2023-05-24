package com.poly.sof3021.B8_Bean_DI_IOC.c2;

public class Main {

//    private GiangVienServiceImpl giangVienService;

    //C1:  Class = new Class
    private ICommonService giangVienService;
    // C2: interface = new Class
    public Main() {
        giangVienService = new SinhVienServiceImpl();
    }

    public void getAll11() {
        giangVienService.getAll(); // giang vien
    }
}
