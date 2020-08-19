package ru.geekbrains.java2;

public class Wall {
    private String type;
    private int height;

    public Wall() {
        this.type = "Забор";
        this.height= 1;
    }

    public Wall(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public boolean jumpWall(int jumpAbility) {
        if (jumpAbility >= this.height) {
            System.out.printf("Стена %s высотой %d метров преодалена", this.type, this.height);
            return true;
        } else {
            System.out.printf("Неудача. Стена %s слишком высокая", this.type);
            return false;
        }
    }
}
