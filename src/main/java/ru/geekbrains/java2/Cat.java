package ru.geekbrains.java2;

public class Cat implements RunAble, JumpAble {

    private String name;
    private int runAbility;
    private int jumpAbility;

    public Cat() {
        this.name = "Кот";
        this.runAbility= 200;
        this.jumpAbility = 3;
    }
    public Cat(String name, int runAbility, int jumpAbility) {
        this.name = name;
        this.runAbility = runAbility;
        this.jumpAbility = jumpAbility;
    }

    public void run(int h) {
        System.out.println("Кот "+ name +" пробежал"+ h +" метров" );
    }

    public void jump(int h) {
        System.out.println("Кот "+ name +" прыгнул на "+ h +" метров");
    }

}
