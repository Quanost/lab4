package com.example.thuchanhtuan4_lab4.Bai4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.thuchanhtuan4_lab4.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Ca nấu lẩu nấu mì mini ","De vang"));
        listLanguage.add(new Language(2, "1 Kg Khô gà bơ tỏi","LTD Food"));
        listLanguage.add(new Language(3, "Xe cần cẩu đa năng","Thế giới đồ chơi"));
        listLanguage.add(new Language(4, "Đồ chơi dạng mô hình","Thế giới đồ chơi"));
        listLanguage.add(new Language(5, "Lãnh đạo đơn giản","Minh Long Book"));
        listLanguage.add(new Language(6, "Hiểu lòng con trẻ","Minh Long Book"));
        listLanguage.add(new Language(7, "Lập Trình PHP","Minh Long Book"));
        listLanguage.add(new Language(8, "Lập Trình WordPress","Minh Long Book"));
        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_list_view, listLanguage);
        listView.setAdapter(adapter);
    }
}