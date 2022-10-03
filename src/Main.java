public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        checkLeapYear(2022);
        System.out.println(" Задание 2 ");
        getDeviceLink(1, 2015);
        System.out.println(" Задание 3 ");
        int deliveryDays =numberOfDeliveryDays(95);
        System.out.println(" Потребуется дней на доставку: " + deliveryDays);
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " Год високосный ");
        } else {
            System.out.println(year + " Год не високосный ");
        }
    }

    public static void getDeviceLink(int osType, int clientDeviceYear) {
        if (osType == 0) {
            System.out.println(" IOS ");
        } else {
            System.out.println(" Android ");
        }
        if (clientDeviceYear >= 2015) {
            System.out.println(" Установите обычную версию ");
        } else {
            System.out.println(" Установите упрощенную версию ");
        }
    }

    public static int numberOfDeliveryDays(int distanceToTheClient) {
        if (distanceToTheClient <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) distanceToTheClient / 40) + 1;
        }
    }
}