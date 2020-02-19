package xmltest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class SystemConfigParser {

	public static void main(String[] args) {
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read("conf/system-config.xml");
			//jdbc-driver
			Element driverNameElt = (Element) document.selectSingleNode("/config/database-info/driver-name");
			String driverName = driverNameElt.getStringValue();
			System.out.println(driverName);
			
			//url
			Element urlElt = (Element) document.selectSingleNode("config//url");
			String url = urlElt.getStringValue();
			System.out.println(url);
			
			//user
			Element userrElt = (Element) document.selectObject("//user");
			String user = userrElt.getText();
			System.out.println(user);
			
			//password
			Element passwordElt = (Element) document.selectSingleNode("//password");
			String password = passwordElt.getStringValue();
			System.out.println(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
