package se.codewars.kyu4;

public class Matrix {
    public static <T extends Exception> void enter() throws T {
        throw (T) new Neo();
    }
}