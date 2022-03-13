package com.example.thuchanhtuan4_lab4.Bai4a;

public class Language {
    private int id;
    private String name;
    private String name1;

    public Language(int id, String name, String name1) {
        this.id = id;
        this.name = name;
        this.name1 = name1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
}
