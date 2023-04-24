package pl.devsmentoring.java.Module4.Exercise05;

import pl.devsmentoring.java.Module4.Exercise04.LoopService;

public class Main {
    public static void main(String[] args) {
        LoopServiceExercise05 loopServiceExercise05 = new LoopServiceExercise05();
        loopServiceExercise05.createList(200);
        System.out.println(loopServiceExercise05.borderedList);
    }
}
