package se.homework.HW4;

public class HW22 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println(0);
                    break;
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                default:
                    System.out.println(3);
                    break;
            }
        }
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println(0);
                case 1:
                    System.out.println(1);
                case 2:
                    System.out.println(2);
                default:
                    System.out.println(3);
            }
        }
    }
}
