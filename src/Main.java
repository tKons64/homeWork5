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

        short deliveryDistance = 101;
        short deliveryPeriod = 1;
        if (deliveryDistance > 20) {
            deliveryPeriod++;
        }
        if (deliveryDistance > 60) {
            deliveryPeriod++;
        }
        if (deliveryDistance > 100) {
            System.out.println("На расстоние более 100 км. не доставляем!");
            deliveryPeriod = 0;
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

// Задание №6
        System.out.println("");
        System.out.println("Задание №6:");

        byte age = 23;
        int salary = 100000;
        double creditLimit = 0;

        if (age < 23) {
            creditLimit = salary * 2;            
        }
        else {
            creditLimit = salary * 3;
        }

        if (salary >= 80_000) {
            creditLimit = creditLimit * 1.5;
        } else if (salary >= 50_000) {
            creditLimit = creditLimit * 1.2;
        }

        if (creditLimit > 0) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом - " + creditLimit +" рублей.");
        } else {
            System.out.println("Мы, к сожалению, не готовы выдать вам кредитную карту.");
        }

// Задание №7
        System.out.println("");
        System.out.println("Задание №7:");

        byte age_x = 18;
        int salary_x = 50_000;
        int wantedSum = 330_000;
        double monthlyPayment = 0;

        float baseRate = 10f;
        short periodCredit = 12;
        var maxPayment = salary_x * 0.5; //максимально допустимый платеж

        if (age_x < 23) {
            baseRate = baseRate + 1;
        } else if (age_x < 30) {
            baseRate = (float) (baseRate + 0.5);
        }

        if (salary_x > 80_000) {
            baseRate = (float) (baseRate - 0.7);
        }

        baseRate = baseRate / 100; //приведем ставку к процентной

        double monthlyRate = 0;
        monthlyRate = baseRate / 12;

        monthlyPayment = wantedSum * (monthlyRate * Math.pow(1 + monthlyRate, periodCredit) / (Math.pow(1 + monthlyRate, periodCredit) - 1));

        if (monthlyPayment < maxPayment) {
            System.out.println("Максимальный платеж при ЗП - " + salary_x + " равен " + maxPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено!");
        }else {
            System.out.println("Максимальный платеж при ЗП - " + salary_x + " равен " + maxPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано!");
        }

    }
}