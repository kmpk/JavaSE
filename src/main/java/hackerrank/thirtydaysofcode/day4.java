package hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person1 p = new Person1(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

class Person1 {
    private int age;

    public Person1(int initialAge) {
        if (initialAge > 0) age = initialAge;
        else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        if (age < 13) System.out.println("You are young.");
        else if (age < 18) System.out.println("You are a teenager.");
        else System.out.println("You are old.");
    }

    public void yearPasses() {
        age++;
    }
}