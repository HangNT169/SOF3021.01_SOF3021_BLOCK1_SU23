package com.poly.sof3021.B2_XuLyForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String hienThi(){
        return "login-form";
    }

    @PostMapping("/ket-qua")
    public String xuLyLogin(@RequestParam("uname")String username
            , @RequestParam("psw")String password, Model model){
        // Lay gia tri tu phia jsp
        // request.getPara("name cua o input ")
        // Java 5: Request Param
        model.addAttribute("u1", username);
        model.addAttribute("u2", password);
        return "/buoi2/hien-thi-ket-qua";
    }
}
