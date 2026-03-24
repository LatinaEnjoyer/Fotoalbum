package com.example.fotoalbum.repository;

import com.example.fotoalbum.config.InitData;
import com.example.fotoalbum.model.GIFModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GIFRepository {

    @Autowired
    InitData initData;

    public GIFModel getGIFById(int id){
        for (GIFModel gif : initData.getGIFList()){
            if (gif.getId() == id){
                return gif;
            }
        }
        return null;
    }
}
