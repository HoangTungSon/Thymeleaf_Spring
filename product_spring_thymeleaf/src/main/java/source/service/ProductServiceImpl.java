package source.service;

import source.model.Product;

import java.util.*;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Product A", 12, "Hanoi"));
        products.put(2, new Product(2, "Product B", 21, "England"));
        products.put(3, new Product(3, "Product C", 10, "German"));
        products.put(4, new Product(4, "Product D", 8, "China"));
        products.put(5, new Product(5, "Product E", 13, "Cambodia"));
        products.put(6, new Product(6, "Product F", 18, "Singapore"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
