package com.example.recyclerview1.datas;

import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Food;

import java.util.ArrayList;

public class Data {
    private static String [] Name = {
            "Masker",
            "Serum",
            "Sunscreen ",
            "Cream",

    };

    private static String [] Price = {
            "15000",
            "40000",
            "50000",
            "30000",
            "37000",

    };

    private static int [] Image = {
            R.drawable.masker,
            R.drawable.serum,
            R.drawable.sun,
            R.drawable.toner,
            R.drawable.cream,

    };

    public static ArrayList<Food> getDataFood() {
        ArrayList<Food> list = new ArrayList<>();
        for(int i=0;i<Name.length;i++){
            Food food = new Food(Name[i],"Rp " + Price[i],Image[i]);
            list.add(food);
        }
        return list;
    }
}
