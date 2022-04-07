package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите ваше имя: ");
                String name = scanner.next();
                user.setName(name);
                System.out.println("Ваше имя = " + user.getName());
                System.out.println("Введите возраст");
                Integer age = scanner.nextInt();
                user.setAge(age);
                System.out.println("Ваш возраст  = " + user.getAge());
            } catch (IllegalNameException illegalNameException) {
                System.out.println(illegalNameException.getMessage());
            } catch (IllegalAgeException illegalAgeException) {
                System.out.println(illegalAgeException.getMessage());
            }
        }
    }
}
