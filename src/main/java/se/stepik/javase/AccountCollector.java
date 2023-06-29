package se.stepik.javase;

import java.util.*;
import java.util.stream.Collectors;

public class AccountCollector {
    private static final Set<User> users = new HashSet<>();

    public static void main(String[] args) {
    }

    private Map<String, Long> sumOfTrByAcc(List<Transaction> transactions) {
        return transactions.stream().collect(Collectors.toMap(t -> t.getAccount().getNumber(), Transaction::getSum, Long::sum));
    }

    private static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        return accounts.stream()
                .filter(acc -> acc.getBalance() > 0)
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getState().equals(State.CANCELED))
                .mapToLong(Transaction::getSum)
                .sum();
    }

    public static Optional<User> findUserByLogin(String login) {
        return users.stream().filter(u -> u.getLogin().equals(login)).findFirst();
    }

    public static void printBalanceIfNotEmpty(String userLogin) {
        Optional<User> found = findUserByLogin(userLogin);
        if (found.isPresent()) {
            if (found.get().getAccount() != null) {
                long balance = found.get().getAccount().getBalance();
                if (balance > 0) {
                    System.out.printf("%s: %d", userLogin, balance);
                }
            }
        }
    }
}

class Account {
    private String number;
    private long balance;
    private List<Transaction> transactions;
    private UUID guid;

    public UUID getGuid() {
        return guid;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public String getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public Account(String number, long balance) {
        this.number = number;
        this.balance = balance;
    }
}

class User {
    private String login;
    private Account account;

    public String getLogin() {
        return login;
    }

    public Account getAccount() {
        return account;
    }

    public User(String login, Account account) {
        this.login = login;
        this.account = account;
    }
}

class Transaction {
    private String uuid;
    private long sum;
    private Account account;
    private State state;
    private Date created;

    public String getUuid() {
        return uuid;
    }

    public long getSum() {
        return sum;
    }

    public Account getAccount() {
        return account;
    }

    public Transaction(String uuid, long sum, Account account) {
        this.uuid = uuid;
        this.sum = sum;
        this.account = account;
    }

    public State getState() {
        return state;
    }

    public Date getCreated() {
        return created;
    }
}

enum State {
    CANCELED, FINISHED, PROCESSING
}
