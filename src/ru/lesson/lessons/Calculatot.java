package ru.lesson.lessons;

/**
 * Created by a.shipulin on 30.09.16.
 */
public class Calculatot {
    private int result;
    public void add(int ...params) {
        for(int param:params) {
            this.result += param;

        }

    }


    public static void main(String[] args) {
        Calculatot calc = new Calculatot();
        calc.add(2, 3, 5);
        System.out.println(calc.getResult());
    }

    public int getResult() {
        return result;
    }
}
