package com.github.andydrew.other.thread;

public class Tickets implements Runnable {
    static int count = 10;

    @Override
    public void run() {
        while (true) {
            synchronized (Tickets.class) {
                if (count == 0) {
                    break;
                }
                count--;
                System.out.println(Thread.currentThread().getName() + "正在售出第" + (1000 - count) + "票，目前剩余" + count + "张票");
            }
        }
    }
}
