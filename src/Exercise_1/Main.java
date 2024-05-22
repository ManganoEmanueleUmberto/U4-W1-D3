package Exercise_1;

public class Main {


    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5, 10.5);
        Rettangolo rettangolo2 = new Rettangolo(3, 20);
        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);

    }
}
