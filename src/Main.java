public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнне задание");
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("\nУстановите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("\nУстановите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Неопределенная операционная система");
        }
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        System.out.println("Задание 3");
        int year = 2021;
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 105;
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется.");
        } else if (deliveryDistance > 60) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println("Задание 5");
        int mothNumber = 12;
        switch (mothNumber) {
            case 1:
            case 2:
            case 12:
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
            default:
                System.out.println("Такого месяца нет");
        }
    }

}