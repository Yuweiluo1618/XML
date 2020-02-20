package xmltest;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ServerParser {

	public static void main(String[] args) {
		try {
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read("conf/server.xml");
			Element connectorElt = (Element) document.selectSingleNode("//connector");
			Attribute portAttr = connectorElt.attribute("port");
			String port = portAttr.getStringValue();
			System.out.println(port);
			
			String portValue = connectorElt.attributeValue("port");
			System.out.println(portValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
