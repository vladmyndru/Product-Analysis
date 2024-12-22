package app;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    public List<Product> getData() {
        return Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Coffee Maker", "Appliances", 80.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Blender", "Appliances", 50.0)
        );
    }
}
