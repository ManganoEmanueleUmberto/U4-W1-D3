package Exercise_2;

import java.util.Random;

public class SIM {
    private String telephoneNumber;
    private int credit;
    private Chiamata[] last5Call;

    public SIM(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        credit = 0;
        last5Call = new Chiamata[5];
    }

    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + telephoneNumber);
        System.out.println("Credito residuo: " + credit + "€");
        System.out.println("Lista delle ultime 5 chiamate: ");
        for (int i = 0; i < last5Call.length; i++) {
            if (last5Call[i] != null) {
                System.out.println(last5Call[i]);
            }

        }
    }

    public void Call(String numberToCall) {
        Random rndm = new Random();
        int duration = rndm.nextInt(1, 5);
        Chiamata call = new Chiamata(numberToCall, duration);

        for (int i = 0; i < last5Call.length; i++) {
            if (last5Call[i] == null) {
                last5Call[i] = call;
                break;
            } else {
                last5Call[0] = call;
            }
        }
    }
}
