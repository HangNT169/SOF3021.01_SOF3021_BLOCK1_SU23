package com.poly.sof3021.B3_CRUDListFixCung.controller;

import com.poly.sof3021.B3_CRUDListFixCung.entity.SinhVien;
import com.poly.sof3021.B3_CRUDListFixCung.service.SinhVienService;
import com.poly.sof3021.B3_CRUDListFixCung.service.impl.SinhVienServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
// Controller => Danh dau tang(bean) => Tang trao doi giua client & server
public class SinhVienController {
    // @Controller => MVC => Tat ham /request => LUON LUON TRA VE 1 VIEW (RETURN STRING => TEN CUA VIEW)

    private SinhVienService sinhVienService = new SinhVienServiceImpl();
    // interface = new class

    private List<SinhVien> lists = new ArrayList<>();

    // C1: GetMapping => Method Get => Hien thi
    @GetMapping("/sinh-vien/hien-thi")
    // C2: @RequestMapping
//    @RequestMapping(value = "/sinh-vien/hien-thi",method = RequestMethod.POST) // Default la Method Get
    public String hienThiSinhVien(Model model) {
        lists = sinhVienService.getAll();
        model.addAttribute("sinhViens", lists);
        return "/buoi3/sinhviens";
    }

    // Dung PathVariable : cung lay gia tri tren url
    @GetMapping("/sinh-vien/detail/{ma1}")
    public String detailSinhVien(Model model, @PathVariable("ma1") String maSV) {
        SinhVien sinhVien = sinhVienService.detailSinhVien(maSV);
        model.addAttribute("sv", sinhVien);
        return "/buoi3/detail-sinh-vien";
    }
    // Phan biet Controller & Rest Controller
    // Controller => Luon luon tra ve View (Return 1 String)
    // RestController => API duoi dang default JSON
//    @GetMapping("/demo1111")
//    @ResponseBody // Muon tra ve kieu du lieu khac o trong controller
//    // => DUNG RESPONSEBODY
//    public List<SinhVien>demo(){
//        List<SinhVien>sinhViens = new ArrayList<>();
//        sinhViens.add(new SinhVien("HE130461", "Nguyen Thuy Hang", 10, "Ha Noi", false));
//        sinhViens.add(new SinhVien("HE130462", "Nguyen Hoang Tien", 11, "Ha Noi1", true));
//        sinhViens.add(new SinhVien("HE130463", "Nguyen Anh Dung", 15, "Ha Noi3", true));
//        sinhViens.add(new SinhVien("HE130464", "Vu Van Nguyen", 14, "Ha Noi6", true));
//        sinhViens.add(new SinhVien("HE130465", "Tran Tuan Phong", 20, "Ha Noi7", true));
//        return sinhViens;
//    }

}
