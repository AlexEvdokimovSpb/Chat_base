package ru.geekbrains.java2;

public class Obstacle {
    private int type;
    private String typeName;
    private int obstacle;

    public Obstacle() {
        this.type = 0;
        this.typeName = "Простая";
        this.obstacle= 10;
    }

    public Obstacle(int type, String typeName, int length) {
        this.type = type;
        this.typeName = typeName;
        this.obstacle = obstacle;
    }

    public boolean runObstacle(String name, int runObstacle) {
        if (runObstacle>=this.obstacle) {
            System.out.printf("Препятствие %s со сложностью %d преодолено %s %n", this.typeName, this.obstacle, name);
            return true;
        } else {
            System.out.printf("Неудача. Препятствие %s слишком сложное для %s %n", this.typeName, name);
            return false;
        }
    }

    public int getType () {
        return this.type;
    }

}
