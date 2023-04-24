package pl.devsmentoring.java.StringReverse;
class ReverseService {

    private String inputToReverse;
    private String reversedString;

    public String getReversedString() {
        return reversedString;
    }

    public ReverseService(String inputToReverse) {
        this.inputToReverse = inputToReverse;
    }

    void reverseAndPrint() {
        reversedString = inputToReverse.chars()
                                              .mapToObj(c -> (char) c)
                                              .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
        System.out.println(reversedString);
    }


}

