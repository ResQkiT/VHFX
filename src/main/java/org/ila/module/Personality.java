package org.ila.module;

import javax.swing.*;

public class Personality {

    private String name = "";
    private Integer age = 0;
    private String descr = "";

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDescr() {
        return descr;
    }

    public Personality() {

    }

    @Override
    public String toString() {
        String s = "";
        s += "Имя: " + this.name + "\n";
        s +="Возраст: " + this.age.toString()+ "\n";
        s +="Описание: " + this.descr + "\n";
        return s;

    }
}
