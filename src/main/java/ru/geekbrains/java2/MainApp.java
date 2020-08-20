package ru.geekbrains.java2;

public class MainApp {

    public static void main(String[] args) {

        Obstacle obstacle [] = new Obstacle [4];  // Создаем массив препятствий
                obstacle [0] = new Treadmill(2, "щебенчатая", 200);
                obstacle [1] = new Wall(1, "низкая", 1);
                obstacle [2] = new Treadmill();
                obstacle [3] = new Wall();


        RunAble runAble [] = new RunAble [4];  // Создаем массив участников
                runAble [0] = new Cat ("Барсик", 50,2);
                runAble [1] = new Cat ();
                runAble [2] = new Human ("Петя", 300,1);
                runAble [3] = new Robot ("R2", 100,0);


       // Отправляем участников преодолевать препядствия
        for (int i=0; i<runAble.length; i++ ) { // перебираем участников
            for (int j=0; j<obstacle.length; j++){ // перебираем препетствия
                // смотрим тип претствия, в зависимости от типа берем соответсвующую способность
                if (obstacle [j].getType()==2) {
                   // используем способность бегать
                    if (obstacle[j].runObstacle(runAble[i].getName(), runAble[i].getRunAbility())) {
                    } else {
                        break;
                    }
                }
                if (obstacle [j].getType()==1) {
                    // используем способность прыгать
                        if ( obstacle [j].runObstacle( runAble[i].getName(), runAble[i].getJumpAbility()) ) {
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
