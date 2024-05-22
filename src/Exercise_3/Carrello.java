package Exercise_3;

public class Carrello {
    private Cliente customer;
    private Articolo[] articles;
    private double total;

    public Carrello(Cliente customer) {
        this.customer = customer;
        this.articles = new Articolo[50];
        total = 0;
    }

    public void addArticleToCart(Articolo newArticle) {
        for (int i = 0; i < articles.length; i++) {
            if (articles[i] == null) {
                articles[i] = newArticle;
                break;
            }
        }


    }

    public void printCart() {
        System.out.println("--SEZIONE CLIENTE-- \n");
        System.out.println(customer.getName() + " " + customer.getSurname());
        System.out.println(customer.getEmail());
        System.out.println("--ARTICOLI NEL CARRELLO-- \n");
        for (int i = 0; i < articles.length; i++) {

            if (articles[i] != null) {
                System.out.println("\n Articolo" + (i + 1));
                System.out.println(articles[i]);
                total = total + articles[i].getPrice();
            }
        }
        System.out.format("\nTotale del Carrello : %.2f", total);
    }
}
