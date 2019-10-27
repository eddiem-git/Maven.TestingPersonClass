package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private Integer height;
    private Double weight;
    private String hairColor;




    public Person() {
        this.age = 5;
        this.weight = 72.50;
        this.height = 72;
        this.eyeColor = "brown";
        this.hairColor = "Black";
        this.name = "John";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
    this.name = name;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
    public void setHeight(Integer height){
        this.height = height;

    }
    public void setWeight(Double weight){
        this.weight = weight;

    }
    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor; }

    public Integer getHeight() {
        return height; }

    public Double getWeight() {
        return weight; }

    public String getHairColor() {
        return hairColor; }

}
