public class Main {
    public static void main(String[] args) {

// Задание №1
        System.out.println("");
        System.out.println("Задание №1:");

        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            }
        else {
            System.out.println("Ошибка работы сайта! Обратитесь к администратору");
        }

// Задание №2
        System.out.println("");
        System.out.println("Задание №2:");

        //byte clientOS = 2;
        short clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ошибка работы сайта! Обратитесь к администратору");
        }

// Задание №3
        System.out.println("");
        System.out.println("Задание №3:");

        var year = 2024;

        boolean itEveryHundredthYear = (year % 100) == 0;
        boolean itEveryFourHundredthYear = (year % 400) == 0;
        boolean itHighYear = (year % 4) == 0;

        if (itEveryHundredthYear) {
            System.out.println("Год не является високосным, т.к. это сотый год!");
        }
        else if (itEveryFourHundredthYear) {
            System.out.println("Год не является високосным, т.к. это четырехсотый год!");
            }
        else if (itHighYear) {
            System.out.println("Год является високосным!");
        }
        else {
            System.out.println("Год не является високосным!");
        }

// Задание №4
        System.out.println("");
        System.out.println("Задание №4:");

        short deliveryDistance = 21;
        short deliveryPeriod = 0;
        if (deliveryDistance <= 20) {
            deliveryPeriod = 1;
        } else if (deliveryDistance <= 60) {
            deliveryPeriod = 2;
        } else if (deliveryDistance <= 100) {
            deliveryPeriod = 3;
        }
        else {
            System.out.println("На расстоние более 100 км. не доставляем!");
        }

        if (deliveryPeriod != 0) {
            System.out.println("Потребуется дней: " + deliveryPeriod);
        }

// Задание №5
        System.out.println("");
        System.out.println("Задание №5:");

        byte monthNumber = 13;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц относится к сезону - зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц относится к сезону - весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц относится к сезону - лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц относится к сезону - осень!");
                break;
            default:
                System.out.println("Такого месяца не существует!");
            }


    }
}