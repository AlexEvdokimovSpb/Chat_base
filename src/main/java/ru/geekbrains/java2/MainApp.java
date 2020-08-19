package ru.geekbrains.java2;

public class MainApp {

    public static void main(String[] args) {

        Human human = new Human("Петр", 200, 2);
        human.run(10);

        Treadmill treadmill = new Treadmill();
        if(treadmill.runTreadmill(30)) {
            System.out.println(" xxxx");
        };


    }


}
