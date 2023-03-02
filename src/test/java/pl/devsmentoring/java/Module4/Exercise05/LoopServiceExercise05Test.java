package pl.devsmentoring.java.Module4.Exercise05;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LoopServiceExercise05Test {


    LoopServiceExercise05 loopServiceExercise05 = new LoopServiceExercise05();
    @Test
    void creatingListShouldCreateArrayListStartFrom0EndsInBorder(){
        // given
        int border = 100;
        List<Integer> expectedList;
        List<Integer> actualList;
        // when
        actualList = loopServiceExercise05.createList(border);
        expectedList = loopServiceExercise05.borderedList
                .stream()
                .toList();

        // then
        Assertions.assertEquals(actualList, expectedList);
    }

}