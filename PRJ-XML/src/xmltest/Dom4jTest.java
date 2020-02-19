package xmltest;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Dom4jTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read("conf/students.xml");
			Element root = document.getRootElement();
			for(Iterator<Element> rootIter = root.elementIterator(); rootIter.hasNext();) {
				Element studentElt = rootIter.next();
				for(Iterator<Element> innerIter = studentElt.elementIterator(); innerIter.hasNext();) {
					Element innerElt = innerIter.next();
					String innerValue = innerElt.getStringValue();
					System.out.println(innerValue);
					}
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
