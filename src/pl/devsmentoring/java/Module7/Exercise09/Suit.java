package pl.devsmentoring.java.Module7.Exercise09;

public enum Suit {
    SPADES("Spades"),
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds");
    private final String display;
    Suit(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return display;
    }
}