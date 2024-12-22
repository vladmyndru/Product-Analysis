package app;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ProductRepository repository= new ProductRepository();

        Map<String, List<Product>> map = repository.getData().stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        map.forEach((key, value) -> {
            System.out.println("\nCategory - " + key + ":");
            value.forEach( e-> System.out.println(e.getName()));
        });

        Double avg = repository.getData().stream()
                .collect(Collectors.averagingDouble(Product::getPrice));

        System.out.println("\nAverage product price is " + avg + " USD");

        Optional<Product> maxPrice = repository.getData().stream()
                .max(Comparator.comparing(Product::getPrice));

        maxPrice.ifPresent(product ->
                System.out.println("\nMax price product: " + product.getName() +
                        " is " + product.getPrice() + " USD")
        );
    }
}
