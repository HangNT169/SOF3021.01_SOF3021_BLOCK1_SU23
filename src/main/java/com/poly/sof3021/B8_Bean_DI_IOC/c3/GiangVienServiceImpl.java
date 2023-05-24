package com.poly.sof3021.B8_Bean_DI_IOC.c3;

import com.poly.sof3021.B8_Bean_DI_IOC.c3.ICommonService;

public class GiangVienServiceImpl implements ICommonService {
    @Override
    public void getAll() {
        System.out.println("giang vien");
    }
}
