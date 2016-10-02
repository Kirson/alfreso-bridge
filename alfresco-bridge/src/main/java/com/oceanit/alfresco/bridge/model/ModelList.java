/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oceanit.alfresco.bridge.model;

import com.google.api.client.util.Key;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Cristhian Herrera
 */
@SuppressWarnings("serial")
public class ModelList<T extends Entry> implements Serializable
{
    @Key
    public ArrayList<T> entries;
        
    @Key
    public Pagination pagination;
}
