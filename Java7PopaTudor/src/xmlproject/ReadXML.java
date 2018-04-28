/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author tudor
 */
public class ReadXML {

    public static void main(String[] args) {

        try {
            File inputFile = new File("C:\\Users\\tudor\\Documents\\NetBeansProjects\\Java7PopaTudor\\Java7PopaTudor\\src\\xmlproject\\xmlDoc.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("user");
            System.out.println("----------------------------");
            int length = nList.getLength();
            System.out.println("XML number of elements = " + length);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the username");
            String myUser = scanner.nextLine();
            System.out.println("Please enter the password");
            String myPass = scanner.nextLine();
            System.out.println("Please enter the role");
            String myRole = scanner.nextLine();

            for (int temp = 0; temp < length; temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName() + " " + (temp + 1));
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    String resultUser = eElement.getElementsByTagName("username").item(0).getTextContent();
                    System.out.println("Username is: " + resultUser);

                    String resultPass = eElement.getElementsByTagName("password").item(0).getTextContent();
                    System.out.println("Password is: " + resultPass);

                    String resultRole = eElement.getElementsByTagName("role").item(0).getTextContent();
                    System.out.println("Role is: " + resultRole);

                    if (myUser.equals(resultUser)) {
                        System.out.println("Username found");     
                    } else {
                        System.out.println("Invalid username");
                    }
                    
                    if (myPass.equals(resultPass)) {
                        System.out.println("Password found");
                    } else {
                        System.out.println("Invalid password");
                    }
                    
                    if (myRole.equals(resultRole)) {
                        System.out.println("Role found");
                        break;
                    } else {
                        System.out.println("Invalid role");
                    }

//                    if (myUser.equals(resultUser) && myPass.equals(resultPass) && myRole.equals(resultRole)) {
//                        System.out.println("User found!");
//                    } else {
////                        System.out.println("User " + myUser + " with password " + myPass + " and role " + myRole + " is invalid");
//                    }
//               System.out.println("Book formats available : " 
//               + eElement
//                  .getElementsByTagName("formats")
//                  .item(0)
//                  .getTextContent());
//               System.out.println("Book price : " 
//               + eElement
//                  .getElementsByTagName("price")
//                  .item(0)
//                  .getTextContent());
                }

            }
        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
            e.printStackTrace();
        }
    }
}
