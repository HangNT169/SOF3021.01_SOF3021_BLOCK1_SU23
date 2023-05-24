package com.poly.sof3021.B8_Bean_DI_IOC.c3;

public class CommonController {

    private ICommonService commonService;


    // Contructor Injection
    // Setter Injection > DI
    public CommonController(ICommonService commonService) {
        this.commonService = commonService;
    }

    public void getAll111(){
        commonService.getAll();
    }

}
