package com.example.challengefragmentsrecyclerview12272019;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList <Person> people;
    @Override
    public void onCreate() {
        super.onCreate();
        people = new ArrayList<Person>();
        people.add(new Person("RAM", "Mercedez", "E20", "5157358888"));
        people.add(new Person("Shyam", "Volkswagen", "Polo","5157358888"));
        people.add(new Person("Hari", "Nissan", "Almera","5157358888"));
        people.add(new Person("Gita", "Mercedez", "E20","5157358888"));
        people.add(new Person("Sita", "Nissan", "Almera","5157358888"));
        people.add(new Person("Gopal", "Volkswagen", "Polo", "5157358888"));
        people.add(new Person("Shiva", "Nissan", "Almera","5157358888"));
        people.add(new Person("Krishna", "Mercedez", "E20","5157358888"));
        people.add(new Person("Gopal", "Mercedez", "E20","5157358888"));
        people.add(new Person("Ganesh", "Nissan", "Almera","5157358888"));
        people.add(new Person("Yamraj", "Volkswagen", "Polo","5157358888"));
        people.add(new Person("Yuvraj", "Mercedez", "E20","5157358888"));
        people.add(new Person("Sudip", "Nissan", "Almera","5157358888"));
        people.add(new Person("Sandesh", "Volkswagen", "Polo","5157358888"));
        people.add(new Person("Ajaya", "Mercedez", "E20","5157358888"));
        people.add(new Person("Ashma", "Nissan", "Almera","5157358888"));

    }
}
