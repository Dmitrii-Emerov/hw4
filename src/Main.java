public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнне задание");
        System.out.println("Задание 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возвраст человека 18 и более, то он совершенолетний");
        } else if (age < 18) {
            System.out.println("Не достиг совершеннолетия, нужно немного подождат");
        }
        System.out.println("Задание 2");
        int airTemperature = 3;
        if ( airTemperature < 5){
            System.out.println("На улице меньше 5 градусов, нужно надеть шапку");
        }else if (airTemperature > 5){
            System.out.println("На улице больше 5 градусов, можно идти без шапки");
        }
    }
}
