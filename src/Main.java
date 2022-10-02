public class Main {
    public static void main(String[] args) {

        //Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        int clientOs = 1;
        int clientDeviceYear = 2016;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOs == 0 && clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения iOS");
        } if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOs == 1 && clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения Android");
        }

         //Задача 3

        int year = 2024;
        if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400==0))
        {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }

        //Задача 4

        int deliveryDistance = 55;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах "+ deliveryDistance +" км занимает сутки.");
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах "+ deliveryDistance +" км занимает двое суток.");
        }
        else if (deliveryDistance >=60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах "+ deliveryDistance +" км занимает  трое суток.");
        }

        //Задача 5

        int monthNumber = 8;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь, зима");
                break;
            case 2:
                System.out.println("Февраль, зима");
                break;
            case 3:
                System.out.println("Март, весна");
                break;
            case 4:
                System.out.println("Апрель, весна");
                break;
            case 5:
                System.out.println("Май, весна");
                break;
            case 6:
                System.out.println("Июнь, лето");
                break;
            case 7:
                System.out.println("Июль, лето");
                break;
            case 8:
                System.out.println("Август, лето");
                break;
            case 9:
                System.out.println("Сентябрь, осень");
                break;
            case 10:
                System.out.println("Октябрь, осень");
                break;
            case 11:
                System.out.println("Ноябрь, осень");
                break;
            case 12:
                System.out.println("Декабрь, зима");
                break;
            default:
                System.out.println("В колендаре 12 месяце! Вы ввели недоступное число.");
        }
    }
}