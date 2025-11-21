package com.bean;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
    public String toString(){
        return list.toString();
    }
}
