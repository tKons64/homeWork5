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



    }
}