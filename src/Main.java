public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнне задание");
        System.out.println("Задание 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возвраст человека " + age + " и более, то он совершенолетний");
        } else if (age < 18) {
            System.out.println("Не достиг совершеннолетия, нужно немного подождат");
        }
        System.out.println("Задание 2");
        int airTemperature = 6;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else if (airTemperature > 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задание 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придеться заплатить штраф");
        } else if (speed <= 60) {
            System.out.println("Если скорость " + speed + " , можно ездить спокойно");
        }
        System.out.println("Задание 4");
        int agePerson = 17;
        if (agePerson >= 2 && agePerson <= 4) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в Садик ");
        }
        if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу");
        }
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен "+ agePerson +", то ему нужно ходить в университет");
        }
        if (agePerson > 24){
            System.out.println("Если возраст человека равен "+ agePerson + ", то ему нужно ходить на раболту");
        }
        System.out.println("Задание 5");
        int childAge = 15;
        if (childAge < 5){
            System.out.println("Если возраст ребенка равен "+ childAge + " , то ему нельзя кататься на атракционе");
        }
        if (childAge >= 5 && childAge <=14){
            System.out.println("Если возраст ребенка равен "+ childAge + " , то ему можно кататься в сопровождении взрослого");
        }
        if (childAge >14){
            System.out.println("Если возраст ребенка выше "+ childAge + " , то ему можно кататься на атракционе без сопровождения взрослого");
        }
        System.out.println("Задание 6");
        int peopleTrain = 50;
        int carriageCapacity = 102;
        int seatingCapacity = 60;
        if (peopleTrain <= carriageCapacity && peopleTrain < seatingCapacity){
            System.out.println("есть сидячие и стоячие места в вагоне");
        } else if (peopleTrain <= carriageCapacity && peopleTrain >= seatingCapacity) {
            System.out.println("Остались только стоячие места");
        }
        if (peopleTrain > carriageCapacity){
            System.out.println("Вагон переполнен мест нет");
        }
        System.out.println("Задание 7");
        int one = 34;
        int two = 35;
        int three = 33;
        if (one >= two && one >= three) {
            System.out.println("one самое большое число");
        } else if (two >= one && two >= three) {
            System.out.println("two самое большое число");
        } else {
            System.out.println("three самое большое число");
        }
    }
}
