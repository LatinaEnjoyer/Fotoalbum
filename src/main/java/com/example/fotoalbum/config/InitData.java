package com.example.fotoalbum.config;

import com.example.fotoalbum.model.GIFModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class InitData {

    private ArrayList<GIFModel> GIFList = new ArrayList<>();

    public InitData(){
        GIFList.add(new GIFModel(1, "Baby.gif", "That's Crazy"));
        GIFList.add(new GIFModel(2, "Kid.gif", "Excusez-moi"));
        GIFList.add(new GIFModel(3, "Speed.gif", "My mom's kinda homeless"));
        GIFList.add(new GIFModel(4, "XQC.gif", "What did he say?"));
    }

    public ArrayList<GIFModel> getGIFList() {
        return GIFList;
    }
}
