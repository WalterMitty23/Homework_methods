package pro.sky;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Task 1");
        int checkYear = 2009;
        checkLeapYear(checkYear);
    }
    public static void task2() {
        System.out.println("\nTask 2");
        int clientOs = 2;
        int currentYear = LocalDate.now().getYear();
        checkDevice(clientOs, currentYear);
    }

    public static void task3() {
        System.out.println("Task 3");
        int deliveryDistance = 55;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        if (deliveryDays == 404) {
            System.out.println("Доставка невозможна.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    public static void checkLeapYear(int checkYear) {
        int leapYear = checkYear % 4;
        int leapYear400 = checkYear % 400;
        int leapYearNot100 = checkYear % 100;
        boolean trueLeapYear1 = leapYear == 0;
        boolean trueLeapYear2 = leapYearNot100 != 0;
        boolean trueLeapYear3 = leapYear400 == 0;
        if ((trueLeapYear1 && trueLeapYear2) || trueLeapYear3) {
            System.out.printf("%d год является високосным", checkYear);
        } else {
            System.out.printf("%d год не является високосным", checkYear);
        }
    }

    public static void checkDevice(int clientOs, int currentYear) {
        boolean earlier2015 = (currentYear < 2015);
        if ((clientOs == 0) && earlier2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((clientOs == 1) && earlier2015) {
            System.out.println("Установите версию приложения для Android  по ссылке");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android  по ссылке");
        } else {
            System.out.println("Unknown device");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 404;
        }
    }

}