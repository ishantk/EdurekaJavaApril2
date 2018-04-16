package co.edureka.xmls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println("**Document Parsing Started**");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch,start,length);
		System.out.print(str);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("**Document Parsing Ended**");
	}
}

public class SAXParserDemo {

	public static void main(String[] args) {
		
		try{
			
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
			
			MyHandler handler = new MyHandler();
					
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			parser.parse(new FileInputStream(file), handler);
						
		}catch(Exception e){
			System.out.println("Exeption is: "+e);
		}	
	}

}
