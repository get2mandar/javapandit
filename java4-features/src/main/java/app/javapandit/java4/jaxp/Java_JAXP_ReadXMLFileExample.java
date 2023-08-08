package app.javapandit.java4.jaxp;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import app.javapandit.java4.logging.Java_LoggingExample;

public class Java_JAXP_ReadXMLFileExample {

	static DocumentBuilderFactory docFactory;
	static DocumentBuilder builder;
	static Document document;

	public static void main(String[] args) {

		// Must Set Before The Logger
		String xmlFilePath = Java_LoggingExample.class.getClassLoader().getResource("jaxp-pets.xml").getFile();
		System.out.println("To See from where XML File is picked Up:");
		System.out.println(xmlFilePath);
		System.out.println(" - - - - - - ");

		try {

			docFactory = DocumentBuilderFactory.newInstance();
			builder = docFactory.newDocumentBuilder();
			document = builder.parse(xmlFilePath);

			// Query by tag name
			NodeList empNodesList = document.getElementsByTagName("pet");

			for (int i = 0; i < empNodesList.getLength(); i++) {
				Element studentItem = (Element) empNodesList.item(i);
				System.out.println("(Attribute) id: " + studentItem.getAttribute("id"));

				NodeList studentItemChildNodes = studentItem.getChildNodes();
				for (int j = 0; j < studentItemChildNodes.getLength(); j++) {
					Node childNode = studentItemChildNodes.item(j);

					// Element
					if (childNode.getNodeType() == Node.ELEMENT_NODE && "name".equals(childNode.getNodeName())) {
						System.out.println("name: " + childNode.getFirstChild().getNodeValue());
					}

					// Element
					if (childNode.getNodeType() == Node.ELEMENT_NODE && "gender".equals(childNode.getNodeName())) {
						System.out.println("gender: " + childNode.getFirstChild().getNodeValue());
					}

					// Comment
					if (childNode.getNodeType() == Node.COMMENT_NODE) {
						Comment comment = (Comment) childNode;
						System.out.println("comment: " + comment.getData());
					}

					// CharacterData (CDATA)
					if (childNode.getNodeType() == Node.CDATA_SECTION_NODE) {
						CharacterData cData = (CharacterData) childNode;
						System.out.println("CDATA: " + cData.getData());
					}
				}
				System.out.println(" - - - - - - ");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
