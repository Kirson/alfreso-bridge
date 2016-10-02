/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oceanit.alfresco.bridge.util;

/**
 *
 * @author Cristhian Herrera 
 */
public enum AlfrescoEnum 
{
    
    ROOT_SITE("Sites","Sitio Root"),
    DEFAULT_SITE("default","Sitio por defecto");
    
    private String nemonico;
    private String nombre;
    
    AlfrescoEnum(String nemonico,String nombre)
    {
       this.nemonico=nemonico;
       this.nombre=nombre;
    }

    /**
     * @return the nemonico
     */
    public String getNemonico() {
        return nemonico;
    }

    /**
     * @param nemonico the nemonico to set
     */
    public void setNemonico(String nemonico) {
        this.nemonico = nemonico;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
