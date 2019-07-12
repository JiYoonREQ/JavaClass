package org.dimigo.oop;

public class Car {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public String getCompany(){return company;}
    public String getModel(){return model;}
    public String getColor(){return color;}
    public int getMaxSpeed(){return maxSpeed;}
    public int getPrice(){return price;}

    public void setCompany(String company){this.company=company;}
    public void setModel(String model){this.model=model;}
    public void setColor(String color){this.color=color;}
    public void setMaxSpeed(int maxSpeed){this.maxSpeed=maxSpeed;}
    public void setPrice(int price){this.price=price;}

    public Car(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car(String company, String model, String color, int maxSpeed) {
        this(company, model, color, maxSpeed, 0);
    }

    public Car(String company, String model, String color) {
        this(company, model, color, 0);
    }
}
