/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oceanit.alfresco.bridge;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.chemistry.opencmis.client.api.CmisObject;
import org.apache.chemistry.opencmis.client.api.Document;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.ItemIterable;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.commons.PropertyIds;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oceanit.alfresco.bridge.service.AlfrescoCMIS;
import com.oceanit.alfresco.bridge.util.AlfrescoConstants;

import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Cristhian Herrera 
 */
@SuppressWarnings("serial")
public class AlfrescoCMISTest implements Serializable
{
    
    public AlfrescoCMISTest() {
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
     * Test of getSession method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetSession_Properties() {
        System.out.println("getSession");
        Properties properties = null;
        Session expResult = null;
        Session result = AlfrescoCMIS.getSession(properties);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSession method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetSession_0args() {
        System.out.println("getSession");
        
        Session result = AlfrescoCMIS.getSession();
       
        Folder root = result.getRootFolder();
        
        System.out.println("-> "+root.getName() + " -> "+root.getId());
    }

    /**
     * Test of getFolderId method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetFolderId() 
    {
        System.out.println("getFolderId");
        Session session = AlfrescoCMIS.getSession();
        String folderName = "arcom";

        String result = AlfrescoCMIS.getFolderId(session, folderName);
        
        System.out.println(" --> "+result);
    }

    /**
     * Test of getSiteId method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetSiteId() {
        System.out.println("getSiteId");
        Session session = AlfrescoCMIS.getSession();
        String siteName = "arcom";
 
        String siteId = AlfrescoCMIS.getSiteId(session, siteName);
        System.out.println("--> "+siteId);
        //--> 
        Folder root = AlfrescoCMIS.getFolder(session, siteId);
       
        
        for(CmisObject cmo:root.getChildren())
        {
           System.out.println(" "+cmo.getName());
        }
        
        String folderArcom = "arcom";
        Map<String, Object> properties = new HashMap<String, Object>();
        try{
        
        properties.put(PropertyIds.OBJECT_TYPE_ID, AlfrescoConstants.CMIS_TYPE_FOLDER);
        properties.put(PropertyIds.NAME, folderArcom );
        root.createFolder(properties);
       
        
        }catch(Exception e)
        {
               CmisObject co = AlfrescoCMIS.getChildFolder(root, folderArcom);
               System.out.println("--> " +co.getName());
               System.out.println("//--> " +co.getId());
               
//               folderArcom = "test";
//               properties.put(PropertyIds.NAME, folderArcom );
//               root.createFolder(properties);
               
               
        }
        
        //root.
        
    }

    /**
     * Test of getDocumentId method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetDocumentId() {
        System.out.println("getDocumentId");
        Session session = null;
        String name = "";
        String expResult = "";
        String result = AlfrescoCMIS.getDocumentId(session, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
   

   

  
   
   


    /**
     * Test of updateContent method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testUpdateContent() {
        System.out.println("updateContent");
        Session session = null;
        CmisObject doc = null;
        Map<String, Object> properties = null;
        AlfrescoCMIS.updateContent(session, doc, properties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteContent method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testDeleteContent() {
        System.out.println("deleteContent");
        CmisObject doc = null;
        AlfrescoCMIS.deleteContent(doc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testFind_4args() {
        System.out.println("find");
        Session session = null;
        String[] fields = null;
        String[] locations = null;
        String[] conditions = null;
        ItemIterable expResult = null;
        ItemIterable result = AlfrescoCMIS.find(session, fields, locations, conditions);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testFind_Session() {
        System.out.println("find");
        Session session = null;
        ItemIterable expResult = null;
        ItemIterable result = AlfrescoCMIS.find(session);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocument method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetDocument_Properties_String() {
        System.out.println("getDocument");
        Properties properties = null;
        String objectId = "";
        Document expResult = null;
        Document result = AlfrescoCMIS.getDocument(properties, objectId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocument method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetDocument_Session_String() {
        System.out.println("getDocument");
        Session session = null;
        String objectId = "";
        Document expResult = null;
        Document result = AlfrescoCMIS.getDocument(session, objectId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDocument method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testFindDocument() {
        System.out.println("findDocument");
        Session session = null;
        String objectId = "";
        Document expResult = null;
        Document result = AlfrescoCMIS.findDocument(session, objectId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDocumentInsideFolder method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testFindDocumentInsideFolder_3args_1() {
        System.out.println("findDocumentInsideFolder");
        Properties properties = null;
        String folderName = "";
        String documentName = "";
        Document expResult = null;
        Document result = AlfrescoCMIS.findDocumentInsideFolder(properties, folderName, documentName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDocumentInsideFolder method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testFindDocumentInsideFolder_3args_2() {
        System.out.println("findDocumentInsideFolder");
        Session session = null;
        String folderName = "";
        String documentName = "";
        Document expResult = null;
        Document result = AlfrescoCMIS.findDocumentInsideFolder(session, folderName, documentName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChildFolder method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetChildFolder() {
        System.out.println("getChildFolder");
        Folder folder = null;
        String name = "";
        CmisObject expResult = null;
        CmisObject result = AlfrescoCMIS.getChildFolder(folder, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFolder method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetFolder() {
        System.out.println("getFolder");
        Session session = null;
        String folderId = "";
        Folder expResult = null;
        Folder result = AlfrescoCMIS.getFolder(session, folderId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   

    /**
     * Test of getDocumentUrl method, of class AlfrescoCMIS.
     */
    @Ignore
    @Test
    public void testGetDocumentUrl() {
        System.out.println("getDocumentUrl");
        Document document = null;
        Session session = null;
        String expResult = "";
        String result = AlfrescoCMIS.getDocumentUrl(document, session);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}