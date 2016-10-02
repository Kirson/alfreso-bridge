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
public class Network implements Serializable
{
    @Key
    public String id;
        
    @Key
    public boolean homeNetwork;
        
    //@Key
    //DateTime createdAt;
        
    @Key
    public boolean paidNetwork;
        
     @Key
     public boolean isEnabled;
        
     @Key
     public String subscriptionLevel;

}
