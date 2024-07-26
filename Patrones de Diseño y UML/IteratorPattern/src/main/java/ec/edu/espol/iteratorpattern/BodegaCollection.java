/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.iteratorpattern;

/**
 *
 * @author Gecko
 */
public interface BodegaCollection {
    public ProductIterator createProductIterator();
    void addProduct(Integer productId, Product product);
    Product getProduct(Integer productId);
    int size();
    Iterable<Integer> getProductIds(); // To iterate over product IDs
}
