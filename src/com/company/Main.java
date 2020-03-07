package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            for (int i = 1; i < 5; i++) {
                Runners runners = new Runners("Бегун ");
                System.out.println("Бегун " + i + " берёт палочку ");
                if (i == 5) {
                    System.out.println("Бегун " + (i) + " бежит к финишу");
                }
                System.out.println("Бегун " + (i) + " бежит к Бегуну " + (i + 1));
                runners.start();
                runners.setPriority(i);
            }
            for (int i = 5; i > 1; i--) {
                Runners runners = new Runners("Бегун ");
                ;
                System.out.println("Бегун " + i + " берёт палочку ");
                System.out.println("Бегун " + (i) + " бежит к Бегуну " + (i - 1));
                runners.start();
                runners.setPriority(i);
            }
        } catch (Exception E) {
            E.getMessage();
        }
    }
}
