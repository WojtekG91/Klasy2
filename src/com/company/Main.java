package com.company;

import com.company.Zadanie3.Game;
import com.company.Zadanie3.Player;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Player player1 = new Player("Wojciech", "Wojtek1");
        Player player2 = new Player("Arek", "Arek1");

        player1.setPoints(120);
        player2.setPoints(101);

        Game game = new Game("Game1");
        game.addPlayer(player1);
        game.addPlayer(player2);

        game.winner();

        game.displayPlayerList();
    }
}


//        Osoba osoba1 = new Osoba("Wojtek","Galka","Male", 27 );
//        Osoba osoba2 = new Osoba("Arek", "Gałka", "Male",29);
//
//        System.out.println(osoba1.getName()+osoba1.getSurname());
//        System.out.println(osoba2.getName()+osoba2.getSurname());
//
//        Samochod samochod1 = new Samochod();
//        samochod1.setBrand("BMW");
//        samochod1.setPrice(50000);
//
//        samochod1.show();
//    }
//}

class Osoba {
    private String name, surname, gender;
    private int age;

    public Osoba(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
