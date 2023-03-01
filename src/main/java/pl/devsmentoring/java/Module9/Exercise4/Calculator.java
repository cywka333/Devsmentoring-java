package pl.devsmentoring.java.Module9.Exercise4;

//Stwórz interfejs Calculator, w którym umieścisz sygnaturę metod:
//int substract(int a, int b)
//int add(int a, int b)
//int multiply(int a, int b)
//double divide(int a, int b).
//Utwórz następnie klasę CalculationSystem, która będzie przyjmowała do konstruktora obiekt powyższej klasy - przekaż do niej anonimową implementację interfejsu z odpowiednio zdefiniowanymi metodami.
//
//CalculationSystem będzie posiadała metodę performCalculations(...)  która wywoła i wyświetli wszystkie operacje Calulator-a.

public interface Calculator {
     int substract(int a, int b);
     int add(int a, int b);
     int multiply(int a, int b);
     double divide(int a, int b);


}
