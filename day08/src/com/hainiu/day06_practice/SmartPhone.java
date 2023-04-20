package com.hainiu.day06_practice;

public class SmartPhone extends Phone{
    private double size;

    public SmartPhone() {
    }

    public SmartPhone(String brand, double price, double size) {
        super(brand, price);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void call(){
        System.out.println("使用智能手机打视频电话");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + super.getBrand() + "\'" +
                ", price='" + super.getPrice() + "\'" +
                ", size='" + size + "\'" +
                '}';
    }
}
