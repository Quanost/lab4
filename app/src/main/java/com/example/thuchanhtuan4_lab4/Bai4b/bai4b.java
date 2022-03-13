package com.example.thuchanhtuan4_lab4.Bai4b;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.thuchanhtuan4_lab4.R;

import java.util.ArrayList;
import java.util.List;

public class bai4b extends AppCompatActivity {
    private GridView gridView;
    private List<DayCap> listLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4b);
        gridView = (GridView) findViewById(R.id.gridview);

        listLanguage = new ArrayList<>();
        listLanguage.add(new DayCap(1, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(2, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(3, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(4, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(5, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(6, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(7, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));
        listLanguage.add(new DayCap(8, "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."));

        DayCapAdapter adapter = new DayCapAdapter(this, R.layout.item_custom_grid_view, listLanguage);
        gridView.setAdapter(adapter);
    }
}