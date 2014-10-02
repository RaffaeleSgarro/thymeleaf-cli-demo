package demo;

import java.math.BigDecimal;

public class Line {

    private final Product product;
    private final BigDecimal price;

    public Line(Product product, BigDecimal price) {
        this.product = product;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
