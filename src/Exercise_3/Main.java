package Exercise_3;

public class Main {
    public static void main(String[] args) {
        Articolo article1 = new Articolo("dsadsa", 1.99, 800);
        Articolo article2 = new Articolo("dseweqwqw", 12.99, 100);
        Articolo article3 = new Articolo("dsewqeq", 15.99, 200);
        Articolo article4 = new Articolo("wqeqeweeqew", 120.99, 1000);

        Cliente customer1 = new Cliente("Emanuele", "Mangano", "emanuelemangano15@gmail.com", "22/05/2024");
        Carrello cart = new Carrello(customer1);
        cart.addArticleToCart(article1);
        cart.addArticleToCart(article2);
        cart.addArticleToCart(article3);
        cart.addArticleToCart(article4);
        cart.printCart();
    }
}
