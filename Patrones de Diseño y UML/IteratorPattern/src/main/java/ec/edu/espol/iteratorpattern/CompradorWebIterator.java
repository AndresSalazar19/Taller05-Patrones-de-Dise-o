/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.iteratorpattern;

/**
 *
 * @author Gecko
 */
public class CompradorWebIterator implements ProductIterator {
    private BodegaWebCollection bodegaWeb;
    private String productID;
    private int index;
    
     public CompradorWebIterator(BodegaWebCollection bodegaWeb) {
        this.bodegaWeb = bodegaWeb;
    }
    
    @Override
    public Product getNext() {
        if (hasMore()) {
            return bodegaWeb.getProduct(index++);
        } else {
            return null; // or throw an exception depending on your use case
        }
    }

    @Override
    public boolean hasMore() {
        return index < bodegaWeb.size();
    }
    
}
