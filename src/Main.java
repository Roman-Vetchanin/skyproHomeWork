public class Main {
    public static void main(String[] args) {
        //Задача №1
        //виды ОС: 0-iOS, 1-Android
        int clientOC = 0;
        if (clientOC == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOC == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Приложения для вашей операционной системы еще в разработке");
        }
        //Задача №2
        int clientDeviceYear = 2013;
        if (clientOC == 0&&clientDeviceYear>2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOC==0&&clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOC == 1&&clientDeviceYear>2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Задача №3
        int year = 2024;
        int leapYear = year%4;
        if (leapYear==0){
            System.out.println(year+" год является високосным");
        }else {
            System.out.println(year+" год не является високосным");
        }
        //Задача№4
        int deliveryDistance = 101;
        if(deliveryDistance<20){
            System.out.println("Доставка будет осуществлена в течение суток");
        } else if (deliveryDistance>=20&&deliveryDistance<=60) {
            System.out.println("Доставка будет осуществлена в течение 2 дней");
        } else if (deliveryDistance>=60&&deliveryDistance<=100) {
            System.out.println("Доставка будет осуществлена в течение 3 дней");
        }else {
            System.out.println("Ваше расположение не входит в зону обслуживания нашей компании.");
        }
        //Задача №5
        int monthNumber = 3;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}