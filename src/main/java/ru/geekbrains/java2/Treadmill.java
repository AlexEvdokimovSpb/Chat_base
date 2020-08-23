package ru.geekbrains.java2;

public class Treadmill extends Obstacle {
    private int type;
    private String typeName;
    private int length;

    public Treadmill () {
        this.type = 2;
        this.typeName = "асфальтовая";
        this.length= 1;
    }

    public Treadmill (int type, String typeName, int height) {
        this.type = type;
        this.typeName = typeName;
        this.length = height;
    }

    @Override
    public boolean runObstacle(String name, int runAbility) {
        if (runAbility>=this.length) {
            System.out.printf("Дорожка %s длиной %d метров преодолена %s %n", this.typeName, this.length, name);
            return true;
        } else {
            System.out.printf("Неудача. Дорожка %s слишком длинная для %s %n", this.typeName, name);
            return false;
        }
    }

    @Override
    public int getType () {
        return this.type;
    }


}
