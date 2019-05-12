package com.design.principles;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Color {
    GREEN,
    BLUE,
    RED
}

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}

class Product {
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.color = color;
        this.size = size;
        this.name = name;
    }
}

interface Specification<T>{
    boolean isSatisfied(T item);
}

interface Filter<T>{
    List<T> filter(List<T> items, Specification<T> specification);
}

class ColorSpecification implements Specification<Product>{
    private Color color;

    public ColorSpecification(Color color){
        this.color = color;
    }


    @Override
    public boolean isSatisfied(Product item) {
        return item.color == this.color;
    }
}

class SizeSpecification implements Specification<Product>{
    private Size size;

    public SizeSpecification(Size size){
        this.size = size;
    }


    @Override
    public boolean isSatisfied(Product item) {
        return item.size == this.size;
    }
}

class ProductFilter implements Filter<Product>{

    @Override
    public List<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(item -> specification.isSatisfied(item)).collect(Collectors.toList());
    }
}

public class OCPDemo {

    public static void main(String[] args){

        Product apple = new Product("Apple", Color.GREEN, Size.LARGE);
        Product shirt = new Product("Shirt", Color.RED, Size.SMALL);
        Product house = new Product("House", Color.GREEN, Size.SMALL);

        List<Product> products = Arrays.asList(apple, shirt, house);

        ProductFilter productFilter = new ProductFilter();
        productFilter.filter(products, new ColorSpecification(Color.RED)).forEach(product -> System.out.println(product.name));
        productFilter.filter(products, new SizeSpecification(Size.SMALL)).forEach(product -> System.out.println(product.name));

    }

}
