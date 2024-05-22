package Exercise_1;

public class Rettangolo {
    private double height;
    private double width;

    public Rettangolo(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println();
        double perimetroTotale = rettangolo1.perimetro(rettangolo1.height, rettangolo1.width) + rettangolo2.perimetro(rettangolo2.height, rettangolo2.width);
        double areaTotale = rettangolo1.area(rettangolo1.height, rettangolo1.width) + rettangolo2.area(rettangolo2.height, rettangolo2.width);
        System.out.println("Il perimetro del primo rettangolo è: " + rettangolo1.perimetro(rettangolo1.height, rettangolo1.width));
        System.out.println("L'area del primo rettangolo è: " + rettangolo1.area(rettangolo1.height, rettangolo1.width));
        System.out.println("Il perimetro del secondo rettangolo è: " + rettangolo2.perimetro(rettangolo2.height, rettangolo2.width));
        System.out.println("L'area del secondo rettangolo è: " + rettangolo2.area(rettangolo2.height, rettangolo2.width));
        System.out.println("La somma delle aree è: " + areaTotale);
        System.out.println("La somma dei perimetri è: " + perimetroTotale);

    }

    public double perimetro(double height, double width) {
        return (height * 2) + (width * 2);
    }

    public double area(double height, double width) {
        return height * width;
    }

    public void stampaRettangolo() {
        System.out.println("Il perimetro è: " + perimetro(height, width));
        System.out.println("L'area è: " + area(height, width));
    }
}
