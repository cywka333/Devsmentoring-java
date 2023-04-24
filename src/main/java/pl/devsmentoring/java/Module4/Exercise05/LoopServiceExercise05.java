package pl.devsmentoring.java.Module4.Exercise05;


import java.util.ArrayList;
import java.util.List;

public class LoopServiceExercise05 {

    List<Integer> borderedList = new ArrayList<>();

     List<Integer> createList(int border) {
        List<Integer> result = new ArrayList<>();
        if (border < 0 || border == 0){
            System.out.println("Border has to be positive");
        }
        for (int i = 0; i <= border; i += 5) {
            result.add(i);
        }
        this.borderedList = result;
        return result;
    }

}

