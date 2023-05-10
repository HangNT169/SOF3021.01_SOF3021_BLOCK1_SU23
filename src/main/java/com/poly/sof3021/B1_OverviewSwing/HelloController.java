package com.poly.sof3021.B1_OverviewSwing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// Tat ca cac class duoc dat trong com  => Deu la bean . Danh dau annotaion(@): @Controller
// => Danh dau tang nay la tang controller. La tang trung gian trao doi giua client <=> server
public class HelloController {
    // client <=> server : trao doi thong qua HTTP Method
    // Co 4 loai HTTP co ban: GET, POST, PUT, DELETE.
    // Java 5: GET <=> Hien thi du lieu, POST  <=> Xu ly du lieu
    // MVC: MODEL <=> VIEW <=> CONTROLLER
    // Tất cả các hàm trong controller luôn luôn là 1 String. Và sẽ trả về 1 view
    @GetMapping("/demo")
    public String hienThiGiaoDien(Model model){
        // Truyen 1 gia tri tu phia controller => JSP : Model
        // model . addAttribute truyen vao 2 tham so: Tham so 1: Ten muon su dung ben jsp
        // Tham so 2: Gia tri muon truyen sang ben JSP
        model.addAttribute("name","PhongTT35");
        return "trang-chu";
    }

}
