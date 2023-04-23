package pl.devsmentoring.java.Streams.Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Dog("Burek", 3));
    animals.add(new Cat("Milelon", 4));
    animals.add(new Dog("Puszek", 2));
    animals.add(new Dog("Zorka", 2));
    animals.add(new Cat("Filemon", 1));


    System.out.println("Showing names of animals, their type and number of eyes.");
    List<String> animalDescriptions = animals.stream()
                .map(a -> a.getName() + " is a " + (a instanceof Dog ? "dog" : "cat") + " and has " + a.getNoEyes() + " eyes")
                .collect(Collectors.toList());
    animalDescriptions.forEach(System.out::println);


    System.out.println("\nShowing names of animals which are dogs");
    List<Dog> dogs = animals.stream()
            .filter(dog -> dog instanceof Dog)
            .map(a -> (Dog) a)
            .collect(Collectors.toList());
    dogs.forEach(dog -> System.out.println(dog.getName()));

    System.out.println("\nShowing names of animals in one string.");
    String names = animals.stream()
                .map(Animal::getName)
                .collect(Collectors.joining(" "));
    System.out.println(names);


    System.out.println("\nShowing names of dogs without Zorka in one string.");

    String dogNames = animals.stream()
                .filter(a -> a instanceof Dog)
                .map(a -> (Dog) a)
                .map(Dog::getName)
                .filter(name -> !name.equals("Burek"))
                .collect(Collectors.joining(" "));
    System.out.println(dogNames);


    System.out.println("Showing animals with 2 eyes or more.");
    List<String> animalsEyesSelector = animals.stream()
                .filter(a -> a.getNoEyes() > 2)
                .map(a -> a.getName() + " is a " + (a instanceof Dog ? "dog" : "cat") + " and has " + a.getNoEyes() + " eyes")
                .collect(Collectors.toList());
    animalsEyesSelector.forEach(System.out::println);


}

}
