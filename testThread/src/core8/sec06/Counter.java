package core8.sec06;

public class Counter {
    private int value;
    public synchronized int increment() {
        value++;
        return value;
    }
}