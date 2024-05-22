package Exercise_2;

public class Chiamata {
    private String calledNumber;
    private int duration;

    public Chiamata(String calledNumber, int duration) {
        this.calledNumber = calledNumber;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return
                "  Numero chiamato= '" + calledNumber + '\'' +
                        "  Durata= " + duration + " min";

    }
}

