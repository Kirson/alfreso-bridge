/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oceanit.alfresco.bridge;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.wml.ObjectFactory;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Cristhian Herrera
 */
@SuppressWarnings("serial")
@Deprecated
public class CreateWordFileTest implements Serializable
{

     private static WordprocessingMLPackage wordMLPackage;
     private static ObjectFactory factory;
     /**
      * 
      * @param filename
      * @param title
      * @param paragraph
      * @return 
      */
     @Ignore
     @Test
     public void testNewWordDoc()
     {
        String fileName = "ejemplo";
        String title = "demo";
        
        List<String> paragraphs = new ArrayList<String>();
        paragraphs.add("uno");
        paragraphs.add("DOSS");
        File f = newWordDoc(fileName,title,paragraphs);
        System.out.println(" ------>> "+f.getName() + " "+f.exists());
     }
     
     /**
      * 
      * @param filename
      * @param title
      * @param paragraphList
      * @return 
      */
    public File newWordDoc(String filename, String title, List<String> paragraphList) 
    {

           
            File tempFile = null;
            
            try {
                tempFile = File.createTempFile(filename,".doc");
                wordMLPackage = WordprocessingMLPackage.createPackage();
                factory = Context.getWmlObjectFactory();

                wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Title", title);
        //        wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Subtitle", lineaSubtitulo);
                
                for(String paragraph:paragraphList){
                    wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", paragraph);    
                }
                
                wordMLPackage.save(tempFile);

                
                
            }catch(Exception e){
                System.err.println("e");      
            }

            
        return tempFile;
    }

}
