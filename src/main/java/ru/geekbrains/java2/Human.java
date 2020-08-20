package ru.geekbrains.java2;

public class Human implements RunAble {

    private String name;
    private int runAbility;
    private int jumpAbility;

    public Human() {
        this.name = "Человек";
        this.runAbility= 100;
        this.jumpAbility = 2;
    }
    public Human(String name, int runAbility, int jumpAbility) {
        this.name = name;
        this.runAbility = runAbility;
        this.jumpAbility = jumpAbility;
    }

    public void run(int h) {
        System.out.println("Человек "+ name +" пробежал "+ h +" метров" );
    }

    public void jump(int h) {
        System.out.println("Человек "+ name +" прыгнул на "+ h +" метров");
    }

    public String getName () {
        return this.name;
    }

    public int getRunAbility () {
        return this.runAbility;
    }

    public int getJumpAbility () {
        return this.jumpAbility;
    }


}
