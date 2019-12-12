package com.abiraj.esoftwarica.model;

public class Contacts {

    private String name,address,Gender,age;
    private int ImageId;

    public Contacts(String name,String address,String Gender,String age, int ImageId){
        this.name = name;
        this.address = address;
        this.Gender = Gender;
        this.age = age;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getGender() {
        return Gender;
    }

    public void setAge(String  age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}
