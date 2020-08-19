package ru.geekbrains.java2;

public class Treadmill {
    private String type;
    private int length;

    public Treadmill() {
        this.type = "Простая";
        this.length= 10;
    }

    public Treadmill(String type, int length) {
        this.type = type;
        this.length = length;
    }

    public boolean runTreadmill(int runAbility) {
        if (runAbility>=this.length) {
            System.out.printf("Дорожка %s длиной %d метров преодалена", this.type, this.length);
            return true;
        } else {
            System.out.printf("Неудача. Дорожка %s слишком длинная", this.type);
            return false;
        }
    }






}
