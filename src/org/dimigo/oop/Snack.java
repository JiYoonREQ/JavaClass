package org.dimigo.oop;

import java.util.*;

public class Snack {
    private String name;
    private String company;
    private int price;
    private int number;

   public Snack() {}
    public Snack(String name, String company, int price, int number) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int calcPrice()
    {
        return price*number;
    }

    public String toString() {
       StringBuilder sb=new StringBuilder("");
       sb.append("이름 : "+name+"\n");
       sb.append("제조사 : "+company+"\n");
       sb.append( String.format("가격 : %,d원\n", price));
       sb.append("개수 : "+number+"개\n");
        return sb.toString();
    }
}
