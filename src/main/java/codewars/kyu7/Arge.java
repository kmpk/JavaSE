package codewars.kyu7;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int counter = 0;
        double perc = percent * 0.01;
        double population = p0;
        while (true) {
            if (population >= p) return counter;
            counter++;
            population += (population * perc) + aug;
        }
    }
}
