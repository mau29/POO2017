/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Automovil {
    //Atributos (caracteristicas)son siempre privados
    //Ejem: Cómo color es un texto es String
    private String color;
    private String marca;
    private String submarca;
    private int modelo;
    private double precio;

    // alt+insertar, getter, y seleccionar el que elegiste o los
    public String getColor ()
    {
        return color;
    }
    
    public String getMarca ()
    {
        return marca;
    }
    
    public String getSubmarca ()
    {
        return submarca;
    }
    
    public int getModelo ()
    {
        return modelo;
    }
    
    public double getPrecio ()
    {
        return precio;
    }
    
    //Métodos
    public void descripcion()
    {
        //sout + tab
        //se concatena con el +
        System.out.println("Vehiculo marca: " + marca);
        System.out.println("Sub-marca: " + submarca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
    }
    
    //psvm+tab
    public static void main(String[] args) 
    {
        //Creacion de una instancia(objeto) de tipo Automovil para PODER ACCEDER a los ATRIBUTOS y METODOS publicos
        
        //Primero la clase, despues el noombre que le quiero poner a la instancia
        //despues new y el nombre de la clase
        //Acceder a atributos
        Automovil miCarrito = new Automovil();
        
        miCarrito.color = "rojo";
        miCarrito.marca = "VW";
        miCarrito.modelo = 1999; //no van entre comillas porque son numeros
        miCarrito.precio = 10000;
        miCarrito.submarca = "bocho";
        
        //Acceder a metodos
        miCarrito.descripcion();
    }
}
