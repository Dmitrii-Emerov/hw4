public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int age = 32;
        boolean canNotGoToSchool = age < 7 || age > 18;
        if (age >= 18 && age < 21) {
            System.out.println("Ты достаточно взрослый, чтобы водить,но недостаточно, взрозлый чтобы пить алкоголь");
        } else if (age >= 21) {
            System.out.println("Ты можешь пить алкоголь и водить машину");
        }
    }
}
