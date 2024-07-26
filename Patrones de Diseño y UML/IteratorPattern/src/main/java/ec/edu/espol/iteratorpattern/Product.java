/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.iteratorpattern;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Gecko
 */
public class Product {
       private String idProducto;
    private String nombre;
    private String descripcion;
    private String categoria;
    private String marca;
    private String modelo;
    private double precio;
    private int cantidadEnStock;
    private LocalDate fechaDeAdquisicion;
    private String estadoProducto;
    private String ubicacionEnBodega;
    private String numeroDeSerie;
    private LocalDate fechaDeGarantia;
    private boolean estadoDeGarantia;
    private boolean estadoDeReparacion;
    private String proveedor;
    private List<String> fallosReportados;
    private LocalDate fechaDeUltimaActualizacion;

    // Constructores, getters y setters se omiten para simplicidad
}
