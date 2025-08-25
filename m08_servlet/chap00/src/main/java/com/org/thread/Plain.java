package com.org.thread;

public class Plain implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("Airplane flight");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
