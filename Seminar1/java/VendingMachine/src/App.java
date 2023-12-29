import java.util.ArrayList;
import java.util.List;

import Domain.Bootle;
import Domain.HotDrink;
import Domain.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMechine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(100, 12, "Lays", 1234);
        Product item2 = new Product(110, 112, "Nuts", 1235);
        Product item3 = new Product(90, 32, "Chips", 1236);
        Product item4 = new Product(20, 22, "Milka", 1237);
        Product item5 = new Product(60, 72, "3korochki", 1238);
        Product item6 = new Product(50, 62, "snikers", 1239);
        Product item7 = new Bootle(55, 3, "colla", 3, 0.5f);
        Product item8 = new HotDrink(40, 3, "tea", 11, 40.5f);
        Product item9 = new HotDrink(59, 321, "coffe", 1322, 39.7f);
        Product item10 = new HotDrink(70, 119, "cocoa", 115, 51.5f);

        Holder hold = new Holder();
        CoinDispenser coin = new CoinDispenser();
        Display disp = new Display();
        List<Product> listProd = new ArrayList<>();

        listProd.add(item1);
        listProd.add(item2);
        listProd.add(item3);
        listProd.add(item4);
        listProd.add(item5);
        listProd.add(item6);
        listProd.add(item7);
        listProd.add(item8);
        listProd.add(item9);
        listProd.add(item10);

        VendingMechine vm = new VendingMechine(hold, coin, disp, listProd);

        for(Product p : vm.getAssort())
        {
            System.out.println(p);
        }
    }
}
