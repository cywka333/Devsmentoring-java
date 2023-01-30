package pl.devsmentoring.java.Module8.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class TramDepot extends Depot {

    int allWagonNo;

    public TramDepot(String name) {
        super(name);
    }

    private List<Tram> trams = new ArrayList<>();

    public void addTram(Tram tram) {
        if (tram.getWagonNo() >= 1 && tram.getWagonNo() <= 4) {
            trams.add(tram);
        }else {
            System.out.println("Tram is too long or too short for tram depot. I can not add it. Create tram with 1-3 wagons.\n");
        }
    }

    public List<Tram> getTrams() {
        return trams;
    }

    public int sumWagonNo() {
        for (Tram tram : trams) {
            allWagonNo += tram.getWagonNo();
        }
        return allWagonNo;
    }

}


