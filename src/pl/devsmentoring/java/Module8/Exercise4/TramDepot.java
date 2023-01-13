package pl.devsmentoring.java.Module8.Exercise4;

public class TramDepot {

    public static void main(String[] args) {
        final String tramDepotName = "Tram Depot!";
        int allWagonNo;
        Tram tram1 = new Tram(100,3,4);
        Tram tram2 = new Tram(130, 5, 1);

        allWagonNo = tram1.getWagonNo() + tram2.getWagonNo();
        System.out.println("Welcome to " + tramDepotName);
        tram1.introduce();
        tram2.introduce();
        System.out.println("We have here " + allWagonNo + " wagons");

    }
}
