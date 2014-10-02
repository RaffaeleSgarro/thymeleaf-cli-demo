package demo;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import java.math.BigDecimal;


public class App {

    public static void main(String... args) {

        TemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("XHTML");

        TemplateEngine engine = new TemplateEngine();
        engine.setTemplateResolver(resolver);
        engine.initialize();

        // Request
        IContext ctx = new Context();

        Product mouse = new Product("#123", "Logitech Mouse");
        Product keyboard = new Product("#332", "MS Keyboard");

        Order order = new Order("2014/23");
        order.addLine(new Line(mouse, new BigDecimal("32.5")));
        order.addLine(new Line(keyboard, new BigDecimal("11.99")));

        ctx.getVariables().put("order", order);
        String html = engine.process("bill", ctx);

        System.out.println("Generated template:");
        System.out.println(html);
    }
}
