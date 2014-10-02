package demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Line> lines = new ArrayList<>();
    private final String name;

    public Order(String name) {
        this.name = name;
    }

    public void addLine(Line line) {
        lines.add(line);
    }

    public List<Line> getLines() {
        return lines;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Line line: getLines()) total = total.add(line.getPrice());
        return total;
    }
}
