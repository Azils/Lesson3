package com.company;

public class User {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.length() > 20){
            throw new IllegalNameException("Длина имени не должно быть больше 20 " +
                    "символов. Ваше имя + " + name);
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 1 || age > 100){
            throw new IllegalAgeException("Возраст человека не может быть больше" +
                    " 100 или меньше 1. Ваш заданный возраст " + age);
        }
        this.age = age;
    }
}
