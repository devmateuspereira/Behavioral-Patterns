package br.com.cod3r.template.sales.after;

import br.com.cod3r.template.sales.after.model.Buyer;
import br.com.cod3r.template.sales.after.model.Cart;
import br.com.cod3r.template.sales.after.model.Category;
import br.com.cod3r.template.sales.after.model.Product;
import br.com.cod3r.template.sales.after.service.BestOfferService;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Buyer simpleBuyer1 = new Buyer("Simple #1", 1500, false);
        Buyer simpleBuyer2 = new Buyer("Simple #2", 3000, false);
        Buyer specialBuyer = new Buyer("Special #1", 500, true);
        Buyer specialBuyer2 = new Buyer("Special #2", 3000, true);

        Product notebook = new Product("Notebook", 999.99, Category.ELETRONICS, 10.0);
        Product shoes = new Product("Ultra Runnins shoes", 200.0, Category.SPORTS, 1.25);
        Product shorts = new Product("Denim shorts", 20.0, Category.CLOTHES, 0.5);
        Product mouse = new Product("Mouse", 10.0, Category.ELETRONICS, 0.2);

        Cart cart1 = new Cart(simpleBuyer1, Arrays.asList(notebook, shoes, shorts, mouse));
        Cart cart2 = new Cart(simpleBuyer2, Arrays.asList(notebook, shoes, shorts, mouse));
        Cart cart3 = new Cart(specialBuyer, Arrays.asList(notebook, shoes, shorts, mouse));
        Cart cart4 = new Cart(specialBuyer2, Arrays.asList(notebook, shoes, shorts, mouse));
        Cart cart5 = new Cart(specialBuyer2, Arrays.asList(notebook));
        Cart cart6 = new Cart(specialBuyer2, Arrays.asList(shorts));

        BestOfferService service = new BestOfferService();
        service.calculateBestOffer(cart1);
        System.out.println("--------------");
        service.calculateBestOffer(cart2);
        System.out.println("--------------");
        service.calculateBestOffer(cart3);
        System.out.println("--------------");
        service.calculateBestOffer(cart4);
        System.out.println("--------------");
        service.calculateBestOffer(cart5);
        System.out.println("--------------");
        service.calculateBestOffer(cart6);
    }

}