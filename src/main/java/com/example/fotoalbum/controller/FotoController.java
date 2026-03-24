package com.example.fotoalbum.controller;

import com.example.fotoalbum.config.InitData;
import com.example.fotoalbum.model.GIFModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class FotoController {

    @Autowired
    InitData initData;

    @GetMapping("/")
    public String getFrontPage(Model model){
        ArrayList<GIFModel> gifList = new ArrayList<>();
        gifList.addAll(initData.getGIFList());
        model.addAttribute("GIFList", initData.getGIFList());
        return "FrontPage";
    }

    @GetMapping("/PageOne")
    public String getPageOne(){
        return "LaughingBaby";
    }

    @GetMapping("/PageTwo")
    public String getPageTwo(){
        return "XQCSmoking";
    }

    @GetMapping("/PageThree")
    public String getPageThree(){
        return "AwkwardKid";
    }

    @GetMapping("/PageFour")
    public String getPageFour(){
        return "SpeedLaughing";
    }
}
