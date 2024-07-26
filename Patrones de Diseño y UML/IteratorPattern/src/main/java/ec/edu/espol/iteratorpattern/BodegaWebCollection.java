/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.iteratorpattern;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gecko
 */
public class BodegaWebCollection implements BodegaCollection {
    
    private Map<Integer, Product> products;
    
    public BodegaWebCollection() {
        this.products = new HashMap<>();
    }
    
    @Override
    public ProductIterator createProductIterator() {
        return new CompradorWebIterator(this);
    }

    @Override
    public void addProduct(Integer productId, Product product) {
        products.put(productId, product);
    }

    @Override
    public Product getProduct(Integer productId) {
        return products.get(productId);
    }

    @Override
    public int size() {
        return products.size();
    
    }

    @Override
    public Iterable<Integer> getProductIds() {
        return products.keySet();
    }
    
}
