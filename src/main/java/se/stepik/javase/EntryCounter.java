package se.stepik.javase;

import java.util.*;
import java.util.stream.Collectors;

public class EntryCounter {
    public static void main(String[] args) {
        List<LogEntry> logs = Arrays.asList(LogEntry.of(new Date(), "1", "url1"),
                LogEntry.of(new Date(), "2", "url1"),
                LogEntry.of(new Date(), "3", "url1"),
                LogEntry.of(new Date(), "4", "url3"),
                LogEntry.of(new Date(), "5", "url3"),
                LogEntry.of(new Date(), "6", "url2"),
                LogEntry.of(new Date(), "7", "url2"),
                LogEntry.of(new Date(), "8", "url2"),
                LogEntry.of(new Date(), "9", "url2"),
                LogEntry.of(new Date(), "10", "url2"));

        Map<String, Long> count = logs.stream().collect(Collectors.toMap(LogEntry::getUrl, log -> 1L, Long::sum));
    }
}

class LogEntry {
    private final Date created;
    private final String login;
    private final String url;

    private LogEntry(Date created, String login, String url) {
        this.created = created;
        this.login = login;
        this.url = url;
    }

    public static LogEntry of(Date created, String login, String url) {
        return new LogEntry(created, login, url);
    }

    public Date getCreated() {
        return created;
    }

    public String getLogin() {
        return login;
    }

    public String getUrl() {
        return url;
    }
}