package co.edureka.xmls;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParser {

	public static void main(String[] args) {
		
		
		try{
			
			ArrayList<Student> studentList = new ArrayList<Student>();
			
			File file = new File("/Users/ishantkumar/Downloads/edurekastudentsapr2.xml");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // Design Pattern
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);
			
			String rootElmName = document.getDocumentElement().getNodeName();
			System.out.println("Root Element is: "+rootElmName);
			
			NodeList nodeList = document.getElementsByTagName("student");
			System.out.println("nodeList size: "+nodeList.getLength());
			
			for(int i=0; i<nodeList.getLength(); i++){
				Node node = nodeList.item(i);
				if(node.getNodeType() == Node.ELEMENT_NODE){
					Element element = (Element)node;
					
					
					String roll = element.getElementsByTagName("roll").item(0).getTextContent();
					String name = element.getElementsByTagName("name").item(0).getTextContent();
					String address = element.getElementsByTagName("address").item(0).getTextContent();
					
					
					Student stu = new Student();
					stu.roll = Integer.parseInt(roll);
					stu.name = name;
					stu.address = address;
					
					studentList.add(stu);
					
					System.out.println(roll+" - "+name+" - "+address);
					System.out.println("------------------------------------");
				}
			}
			
		}catch(Exception e){
			System.out.println("Exeption is: "+e);
		}		

	}

}
