package com.github.andydrew.other.thread;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Tickets tickets = new Tickets();
        Thread thread1 = new Thread(tickets, "窗口1");
        Thread thread2 = new Thread(tickets, "窗口2");
        thread1.start();
        thread2.start();
    }
}
