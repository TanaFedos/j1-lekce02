package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);

        for (int i = 0; i < 3; i++) {
            nakresliDomecek();
        }
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(180);

    }

    private void nakresliDomecek() {
        zofka.penDown();
        for (int dom = 0; dom < 4; dom++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.penUp();

        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
