package com.example;

import com.example.fizzbuzz.fizzbuzz;
import com.example.model.Person;

public class Main {
    public static void main(String[] args) {
        //Personオブジェクトを作成
        Person person = new Person("山田太郎", 30);
        person.introduce();

        int n = 100;
        fizzbuzz fizzBuzzobject = new fizzbuzz();
        fizzBuzzobject.fizzBuzz(n);
    }
}