/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oceanit.alfresco.bridge.model;

import java.io.Serializable;
import com.google.api.client.util.Key;

/**
 *
 * @author Cristhian Herrera 
 */
@SuppressWarnings("serial")
public class NetworkEntry extends Entry implements Serializable
{
      @Key
      public Network entry;
      
      
}
