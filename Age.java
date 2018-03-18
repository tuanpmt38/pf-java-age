public class Age {
    public static void main(String[] args) {
        int age;
        int year = 2018;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter year:");
        year = sc.nextInt();
        age = 2018 - year;
        if (year >= 2018)
            System.out.println("Enter false:");
        else
            System.out.println("Display Age:" + age);
    }
}
