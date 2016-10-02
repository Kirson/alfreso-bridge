/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oceanit.alfresco.bridge.model;

import com.google.api.client.util.Key;
import java.io.Serializable;

/**
 *
 * @author Cristhian Herrera 
 */
@SuppressWarnings("serial")
public class Pagination implements Serializable
{
    
    @Key
    public int count;
        
    @Key
    public boolean hasMoreItems;
        
    @Key
    public int totalItems;
        
    @Key
    public int skipCount;
        
    @Key
    public int maxItems;
}
