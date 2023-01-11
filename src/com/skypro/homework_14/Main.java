package com.skypro.homework_14;

import com.skypro.homework_14.transport.Car;
import com.skypro.homework_14.transport.Bus;

public class Main { //На всякий случай все ненужное закомментировал, могу все удалить, если можно.
    public static void main(String[] args) {

        /*Car car = new Car();
        car.brand = "Lada";
        car.model = "Granta";
        car.year = 2015;
        car.country = "Russia";
        car.color = "yellow";
        car.engineVolume = 1.7;

        System.out.println(car);*/

        //Если я правильно понял, то сначала нужно создать объекты напрямую через поля, а потом через конструктор.

//        Car car = new Car("Lada", "Granta", 2015, "Russia", "yellow",1.7);
//        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Germany", "black", 3.0);
//        Car car2 = new Car("BMW", "Z8", 2021, "Germany", "black",3.0);
//        Car car3 = new Car("Kia", "Sportage 4-го поколения", 2018, "South Korea", "red",2.4);
//        Car car4 = new Car("Hyundai", "Avante", 2016, "South Korea", "orange",1.6);

//        System.out.println(car);
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);
//        System.out.println(car4);

//        Car car5 = new Car(-2022, "",-2.2);

//        System.out.println(car5);

//        Car car6 = new Car("Hyundai", "Avante", 2016, "South Korea", "orange", 1.6, "ручная КП", "универсал", 585, 4,"" );

//        System.out.println(car6);

        Car car7 = new Car(true,true, "Hyundai", "Avante", 1.6, "", 0, "South Korea",
                "", "", -555, 0, "",100.0);

        System.out.println(car7);

        Bus volga = new Bus("Волга", "БУС", 2012, "Россия", "синий",  90.0);
        Bus ikarus = new Bus("Икарус", "БУС", 1995, "Россия", "красный", 60.0);
        Bus blueBird = new Bus("Blue", "Bird TC/2000", 1988, "USA", "yellow", 110.0);

        System.out.println(volga);
        System.out.println(ikarus);
        System.out.println(blueBird);
    }
}
