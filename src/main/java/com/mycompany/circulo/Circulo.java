/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circulo;

/**
 *
 * @author  Valeria
 * 
 * @since  20/05/2024
 * 
 * @version 1.0
 * 
 * 
 * 
 */
    
    public class Circulo {

    private double radio;
    private String color;
    private static int numCirculos;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    /**
     * 
     * @return el area del círculo
     */
    
    public double calculoArea(){
        if (this.getRadio()<0)
            throw new IllegalArgumentException("Radio negativo");
        return (Math.pow(getRadio(), 2)*Math.PI);
    }
    
    /**
     * 
     * @return devuelve el perímetro del circulo
     * @throws Exception cuando el radio es negativo o muy grande
     */
    public double calculoPerimetro()throws Exception{
        if (this.getRadio()<0)
            throw new Exception ("Radio negativo");
        else if(getRadio()>=100)
            throw new Exception ("Radio muy grande");
        else 
            return (2*Math.PI*this.getRadio());
    }
    
    /**
     * 
     * @return devuelve si el color es aceptable
     * @throws Exception 
     */
    
    public boolean colorAceptable() throws Exception {
        if(getColor().length()>20){
            return false;
        }
        else{
            if(getColor().length()<=0){
                throw new Exception ("Color no existente");
            }
            return true;
        }       
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numCirculos
     */
    public static int getNumCirculos() {
        return numCirculos;
    }

    /**
     * @param aNumCirculos the numCirculos to set
     */
    public static void setNumCirculos(int aNumCirculos) {
        numCirculos = aNumCirculos;
    }
    
    
}


