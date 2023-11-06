// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // tack 1
        int clientOS = 5; //  (0 — iOS, 1 — Android)
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Нет ссылки для вашей системы");
        }

        //tack 2
        int clientOSNew = 1; //  (0 — iOS, 1 — Android)
        int clientDeviceYear = 2015;
        if (clientOSNew == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOSNew == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        // tack 3
        int year = 1800;
        if (year > 1584) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        // tack 4
        int timeDelivery = 1;
        int deliveryDistance = 95;
        if (deliveryDistance < 100) {
            if (deliveryDistance >= 60) {
                timeDelivery += 2;
                System.out.println("Потребуется дней: " + timeDelivery);
            } else if (20 <= deliveryDistance && deliveryDistance < 60) {
                timeDelivery += 1;
                System.out.println("Потребуется дней: " + timeDelivery);
            } else {
                System.out.println("Потребуется дней: " + timeDelivery);
            }
        } else {
            System.out.println("Нет доставки");
        }

        // tack 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Неверно введен номер месяца");
        }
    }
}