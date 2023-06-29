package se.stepik.algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class NetworkPackets {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ProcessingSimul {
    private final Queue<Integer> buffer;
    private final int maxSpace;
    private final StringBuilder result;

    public ProcessingSimul(int time, int buffer) {
        this.buffer = new LinkedList<>();
        this.maxSpace = buffer;
        result = new StringBuilder();
    }

    public void pushPacket(Packet p) {
        if (buffer.size() == 0 && maxSpace > 0) {
            result.append(p.getArrival()).append(" ");
            buffer.add(p.getArrival() + p.getDuration());
        }
        if (buffer.size() != 0 && buffer.size() < maxSpace) {
            int last = buffer.peek();
            if (p.getArrival() < last) {

                result.append(p.getDuration() + last).append(" ");
            }
        }
    }

    public String getResult() {
        return result.deleteCharAt(result.lastIndexOf(" ")).toString();
    }

}

class Packet {
    private final int arrival;
    private final int duration;

    private Packet(int arrival, int duration) {
        this.arrival = arrival;
        this.duration = duration;
    }

    public static Packet fromString(String s) {
        String[] input = s.split(" ");
        return new Packet(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
    }

    public int getArrival() {
        return arrival;
    }

    public int getDuration() {
        return duration;
    }
}
