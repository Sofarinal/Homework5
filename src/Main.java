import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2

        int client = 0;
        int clientDeviceYear = 2011;
        if (client == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (client == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (client == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (client == 1 && clientDeviceYear >= 2015) {
            System.out.println("становите версию приложения для Android по ссылке");
            }

        // Задание 3

        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
            } else if (year % 400 == 0) {
            System.out.println(year + " год является високосныим");
            } else {
            System.out.println(year + " год не является високосныим");
        }

        // Задание 4

        int deliveryDistance = 95;
        int day;
        if (deliveryDistance > 100) {
            System.out.println("Доставка более чем на 100 км не осуществляется");
            } else if (deliveryDistance <= 20) {
            day = 1;
            System.out.println("Потребуется дней: " + day);
            } else if (deliveryDistance <= 60) {
            day = 2;
            System.out.println("Потребуется дней: " + day);
            } else if (deliveryDistance <= 100) {
            day = 3;
            System.out.println("Потребуется дней: " + day);
        }

        // Задание 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " относится к сезону: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " относится к сезону: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " относится к сезону: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " относится к сезону: осень");
                break;
            default:
                System.out.println("Пока сказать нечего");
        }
    }
}