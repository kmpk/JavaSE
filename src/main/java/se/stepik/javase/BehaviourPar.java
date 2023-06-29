package se.stepik.javase;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviourPar {
    public static void main(String[] args) {
        List<Account> accounts = Collections.EMPTY_LIST;

        List<Account> nonEmptyAccounts = filter(accounts, a -> a.getBalance() > 0);

        List<Account> accountsWithTooMuchMoney = filter(accounts, a -> !a.isLocked && a.getBalance() >= 100000000);

        IntUnaryOperator mult2 = num -> num * 2;
        IntUnaryOperator add3 = num -> num + 3;

        IntUnaryOperator combinedOperator = add3.compose(mult2.andThen(add3)).andThen(mult2);
        int result = combinedOperator.applyAsInt(5);
        System.out.println(result);

        Consumer<Integer> printer = System.out::println;
        Consumer<Integer> devNull = (val) -> { int v = val * 2; };

        Consumer<Integer> combinedConsumer = devNull.andThen(devNull.andThen(printer));
        combinedConsumer.accept(100);

    }

    private static List<Account> filter(List<Account> elems, Predicate<Account> predicate) {
        return elems.stream().filter(predicate).collect(Collectors.toList());
    }

    class Account {
        private String number;
        private long balance;
        private boolean isLocked;

        public Account(String number, long balance, boolean isLocked) {
            this.number = number;
            this.balance = balance;
            this.isLocked = isLocked;
        }

        public String getNumber() {
            return number;
        }

        public long getBalance() {
            return balance;
        }

        public boolean isLocked() {
            return isLocked;
        }
    }
}

