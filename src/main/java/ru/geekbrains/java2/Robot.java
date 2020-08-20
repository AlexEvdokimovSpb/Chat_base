package ru.geekbrains.java2;

public class Robot implements RunAble {

    private String name;
    private int runAbility;
    private int jumpAbility;

    public Robot() {
        this.name = "Робот";
        this.runAbility= 1000;
        this.jumpAbility = 0;
    }
    public Robot (String name, int runAbility, int jumpAbility) {
        this.name = name;
        this.runAbility = runAbility;
        this.jumpAbility = jumpAbility;
    }

    public void run(int h) {
        System.out.println("Робот "+ name +" пробежал"+ h +" метров" );
    }

    public void jump(int h) {
        System.out.println("Робот "+ name +" прыгнул на "+ h +" метров");
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
