//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int clientOS = 1;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2:");
        int clientDeviceYear = 2015;
        int clientOS1 = 1;
        if (clientDeviceYear <= 2015 && clientOS1 ==0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3:");
        int year = 2024;
        int junYear = 1584;
        if (year >= junYear && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 4:");
        int deliveryDistance = 101;
        if (deliveryDistance >= 0 && deliveryDistance<=20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >=21 && deliveryDistance <=60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >=61 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача 5:");
        int monthNumber = 13;
        switch (monthNumber) {
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
                System.out.println("Такого месяца не существует");
        }
    }
}