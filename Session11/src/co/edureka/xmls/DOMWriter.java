package co.edureka.xmls;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Student{
	int roll;
	String name;
	String address;
}

public class DOMWriter {

	public static void main(String[] args) {
		
		// Data in Object is Temporary !!
		Student sRef = new Student();
		sRef.roll = 101;
		sRef.name = "John";
		sRef.address = "Redwood Shores";
		
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // Design Pattern
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // Empty XML Document
			
			Element rootElm = document.createElement("students");
			Element stuElm = document.createElement("student");
			
			Element rollElm = document.createElement("roll");
			Element nameElm = document.createElement("name");
			Element adrsElm = document.createElement("address");
			
			Text txtRoll = document.createTextNode(String.valueOf(sRef.roll));
			Text txtName = document.createTextNode(sRef.name);
			Text txtAdrs = document.createTextNode(sRef.address);
			
			rollElm.appendChild(txtRoll);
			nameElm.appendChild(txtName);
			adrsElm.appendChild(txtAdrs);
			
			stuElm.appendChild(rollElm);
			stuElm.appendChild(nameElm);
			stuElm.appendChild(adrsElm);
			
			rootElm.appendChild(stuElm);
			//rootElm.appendChild(stuElm1);
			//rootElm.appendChild(stuElm2);
			
			document.appendChild(rootElm);
		
			// Source
			DOMSource source = new DOMSource(document);
			
			File file = new File("/Users/ishantkumar/Downloads/edurekastudentsapr2.xml");
			FileOutputStream fos = new FileOutputStream(file);
			// Result
			StreamResult result = new StreamResult(fos);
		
			// Convert Source into the specific result -> Transformer
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			
			System.out.println("XML Data Written !!");
			
		}catch(Exception e){
			System.out.println("Exeption is: "+e);
		}
	}

}
