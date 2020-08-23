package ru.geekbrains.java2;

public class Wall extends Obstacle {
    private int type;
    private String typeName;
    private int height;

    public Wall() {
        this.type = 1;
        this.typeName = "невысокая";
        this.height= 3;
    }

    public Wall(int type, String typeName, int height) {
        this.type = type;
        this.typeName = typeName;
        this.height = height;
    }

    @Override
    public boolean runObstacle(String name, int jumpAbility) {
        if (jumpAbility >= this.height) {
            System.out.printf("Стена %s высотой %d метра преодолена %s %n", this.typeName, this.height, name);
            return true;
        } else {
            System.out.printf("Неудача. Стена %s слишком высокая для %s %n", this.typeName, name);
            return false;
        }
    }

    @Override
    public int getType () {
        return this.type;
    }


}
