/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oceanit.alfresco.bridge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oceanit.alfresco.bridge.bean.AlfrescoDocumentBean;
import com.oceanit.alfresco.bridge.bean.AlfrescoFileBean;
import com.oceanit.alfresco.bridge.bean.AlfrescoFolderBean;
import com.oceanit.alfresco.bridge.service.AlfrescoService;
import com.oceanit.alfresco.bridge.util.AlfrescoFileUtil;

import org.apache.chemistry.opencmis.client.api.CmisObject;
import org.apache.chemistry.opencmis.client.api.Document;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Cristhian Herrera 
 */
@SuppressWarnings("serial")
public class AlfrescoServiceTest implements Serializable 
{

    public AlfrescoServiceTest() 
    {
    
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDocument method, of class AlfrescoService.
     * @throws java.io.IOException
     */
    @Ignore
    @Test
    public void testGetDocument() throws IOException {
        System.out.println("getDocument ->");
        Properties properties = null;
        String nombreCarpeta = "Prueba";
        String nombreDocumento = "componenteReportes.pdf";

        System.out.println("getDocument -> 1");

        AlfrescoDocumentBean result = AlfrescoService.getDocument(properties, nombreCarpeta, nombreDocumento);

        System.out.println("getDocument -> 2");
        System.out.println("Result " + result.getDocumentId());
        System.out.println("mime " + result.getDocument().getContentStream().getMimeType());

        File f = new File("/Users/cherrera/file.pdf");
        String title = "INFORME_TECNICO";
        List<String> parrafoList = new ArrayList<String>();
        String parrafo = "texto del archivo 4";
        parrafoList.add(parrafo);
        CreateWordFileTest cft = new CreateWordFileTest();

        File f2 = cft.newWordDoc("INFORME_TECNICO_4", title, parrafoList);
        System.out.println("-- " + f.getName() + " " + f.length());

//        List<String> carpetas = new ArrayList<String>();
//        carpetas.add("17156739944");
//        carpetas.add("2");
//        AlfrescoService.pushFileToAlfresco(null, f, title, ".doc", "Sitios", "Arcom", carpetas);

//        AlfrescoFileBean afb = new AlfrescoFileBean();
//        afb.setName("INFORME_TECNICO_4");
//        afb.setFile(f);
//        afb.setData(AlfrescoFileUtil.fileToArrayByte(f));
//        //afb.setMime(AlfrescoMimeType.pdf.getMimeType());
//        afb.setMimeType(AlfrescoMimeType.doc.getMimeType());

//        List<AlfrescoFileBean> listFiles = new ArrayList<AlfrescoFileBean>();
//        listFiles.add(afb);
//
//        List<String> carpetas2 = new ArrayList<String>();
//        String carpeta = "17156739944";
//        carpetas.add(carpeta);

//        Map<String, Object> mapa2 = AlfrescoService.createContent(null, "Test", carpetas2, listFiles, false);
//
//        AlfrescoDocumentBean db = (AlfrescoDocumentBean) mapa2.get(afb.getName());
//
//        System.out.println("id  " + db.getDocument().getId());
//        System.out.println("url  " + db.getDocumentUrl());

    }
    
    @Ignore
    @Test
    public void testGetDocument2() throws IOException {
        System.out.println("getDocument ->");
        Properties properties = null;
        Document doc = AlfrescoService.getDocument(properties,"6fd758d9-dba4-4074-b4f7-041014399c1b;1.0");

        System.out.println("-->" + doc.getDescription());
    }
    
    @Ignore
    @Test
    public void testAuthenticationTicket() throws IOException, Exception {
        System.out.println("getDocument ->");
        String tick = AlfrescoService.getAuthenticationTicket();
        System.out.println("-->" + tick);
    }

    /**
     * Test of findDocument method, of class AlfrescoService.
     */
    @Ignore
    @Test
    public void testFindDocument() {
        System.out.println("findDocument");
        Properties properties = null;
        String carpeta = "";
        String nombreDocumento = "";
        AlfrescoDocumentBean expResult = null;
        AlfrescoDocumentBean result = AlfrescoService.findDocument(properties, carpeta, nombreDocumento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

   

    /**
     * Test of getFolderContent method, of class AlfrescoService.
     */
    @Ignore
    @Test
    public void testGetFolderContent() {
        System.out.println("getFolderContent");
        String carpetaId = "";
        List expResult = null;
        List result = AlfrescoService.getFolderContent(carpetaId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocument method, of class AlfrescoService.
     */
    @Ignore
    @Test
    public void testGetDocument_Properties_String() {
        System.out.println("getDocument");
        Properties properties = null;
        String documentId = "";
        Document expResult = null;
        Document result = AlfrescoService.getDocument(properties, documentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumentURL method, of class AlfrescoService.
     */
    @Ignore
    @Test
    public void testGetDocumentURL() {
        System.out.println("getDocumentURL");
        Properties properties = null;
        String nombreCarpeta = "";
        String nombreDocumento = "";
        String expResult = "";
        String result = AlfrescoService.getDocumentURL(properties, nombreCarpeta, nombreDocumento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void stringTest() {
        String user = "rgl/cherrera";
        String vector[] = user.split("\\/");
        System.out.println(" --> " + vector[1]);
    }

    /**
     * Test of getDocument method, of class AlfrescoService.
     */
    @Ignore
    @Test
    public void testGetDocument_3args() {
        System.out.println("getDocument");
        Properties properties = null;
        String folderName = "";
        String documentName = "";
        AlfrescoDocumentBean expResult = null;
        AlfrescoDocumentBean result = AlfrescoService.getDocument(properties, folderName, documentName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  

   

    @Ignore
    @Test
    public void testGetFolder() {
        Folder folder = AlfrescoService.getFolder("arcom");
        System.out.println(" " + folder.getName() + " - " + folder.getId());
        for (CmisObject cmo : folder.getChildren()) {
            System.out.println("--> " + cmo.getName() + " -> " + cmo.getId());
        }
    }

    @Ignore
    @Test
    public void testPushFile() {
        try {
            File f = new File("/Users/cherrera/Documentos/formato_ieee830.doc");
            AlfrescoFileBean afb = new AlfrescoFileBean();
            afb.setFile(f);
            afb.setExtension("doc");
            AlfrescoDocumentBean result = AlfrescoService.pushDocument(afb);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlfrescoServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AlfrescoServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Ignore
    @Test
    public void testCreateFolders() {
        List<String> folders = new ArrayList<String>();
//        folders.add("arcom");
        folders.add("0801169376");
        folders.add("test");
        folders.add("dos");
        folders.add("tres");
        folders.add("cuatro");
        folders.add("cinco");
        folders.add("seis");
        folders.add("siete");

        List<AlfrescoFolderBean> resultFolders = AlfrescoService.createFolders(folders);

        for (AlfrescoFolderBean afb : resultFolders) {
            System.out.println("--> " + afb.getName() + " -> " + afb.getFolderId());
        }


    }
    
    
    @Ignore
    @Test
    public void testUploadDocument() throws FileNotFoundException, IOException, Exception
    {
       File file =  new File("/Users/cherrera/Documentos/formato_ieee830.doc");
       AlfrescoFileBean afb = AlfrescoFileUtil.fileToAlfrescoFileBean(file);
//       afb.setFile(file);
//       InputStream is = AlfrescoFileUtil.fileToInputStream(file);
//       afb.setInputStream(is);
//       String mimeType = AlfrescoFileUtil.findMimeType(file.getName());
//       System.out.println("mimeType "+mimeType);
//       afb.setMimeType(mimeType);
//       afb.setName(file.getName());
       
       List<String> folders = new ArrayList<String>();
//        folders.add("arcom");
        folders.add("0801169376");
        folders.add("test");
        folders.add("dos");
        folders.add("tres");
        folders.add("cuatro");
        folders.add("cinco");
        folders.add("seis");
        folders.add("siete");
        folders.add("ocho");
        folders.add("nueve");
        folders.add("diez");
        folders.add("once");
        folders.add("doce");
        folders.add("trece");
        folders.add("catorce");
        folders.add("quince");
        folders.add("dieciseis");
        folders.add("diecisiete");
        folders.add("dieciocho");
        folders.add("diecinueve");
        folders.add("veinte");
        folders.add("veinteuno");
        folders.add("veintedos");
        folders.add("veintetres");
        folders.add("veintecuatro");
        folders.add("veintecinco");
        folders.add("veinteseis");
        folders.add("veintesiete");
        folders.add("veinteocho");
        
        AlfrescoDocumentBean adb = AlfrescoService.uploadDocument( folders, afb);
        
        System.out.println(" --> "+adb.getDocumentId());
        System.out.println(" --> "+adb.getDocumentUrl());
        System.out.println(" ---> "+adb.getDocument().getPaths().get(0));
        System.out.println(" ---> "+adb.getGenericUrl().build());
       
    }
    
    @Ignore
    @Test
    public void testGetTicket() throws Exception
    {
       String ticket = AlfrescoService.getAuthenticationTicket();
       
       System.out.println(" --> "+ticket);
    }
    
    @Ignore
    @Test
    public void createTempFile() throws Exception
    {
       File file =  new File("/Users/cherrera/Documentos/formato_ieee830.doc");
       
       InputStream is = new FileInputStream(file);
       
       String[] namePart = file.getName().split("\\.");
       
       File temp = AlfrescoFileUtil.streamToFilePoint(is, namePart[0], namePart[1]);
       
       System.out.println("--> " +temp.getName());
    }
}