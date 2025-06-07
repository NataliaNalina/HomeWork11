import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home work metod");
        System.out.println("Задача 1");
        int year = 2010;
        checkYear(year);
        System.out.println("Задача 2");
        byte clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        selectApp(clientOS, currentYear);
        System.out.println("Задача 3");
        int deliveryDistance = 50;
        int dayOfDelivery = calcDayOfDelivery(deliveryDistance);
        if (dayOfDelivery == -1) {
            System.out.println("К сожаленю, доставки до Вас нет.");
        } else {
            System.out.println("Доставка займет " + dayOfDelivery + " дня.");
        }
    }
    public static void checkYear(int year) {
         if (year>=1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year +" не является високосным");
        }
    }

    public static void selectApp(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную веррию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите веррию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную веррию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите веррию приложения для iOS по ссылке");
        }
    }

    public static int calcDayOfDelivery(int deliveryDistance) {
        int dayOfDelivery = -1;
        if (deliveryDistance <= 20) {
            dayOfDelivery = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            dayOfDelivery = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            dayOfDelivery = 3;
        } else {
            dayOfDelivery = -1;
        }
        return dayOfDelivery;
    }
}

