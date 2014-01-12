package ReadXml;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;

public class XpathReader {

    String expression = "//Car/Make";

    public static void main(String[] args) {

        XpathReader xpathReader = new XpathReader();
        xpathReader.start();
    }

    public void start() {
        try {
            InputStream in = getClass().getClassLoader().getResourceAsStream("Dummy.xml");
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(in);
            XPath xpath = XPathFactory.newInstance().newXPath();

            //Reading each node
            NodeList nodeList = (NodeList) xpath.compile(expression).evaluate(document, XPathConstants.NODESET);
            //Loop
            for(int i=0; i<nodeList.getLength(); i++){
                System.out.println(nodeList.item(i).getNodeName());
                System.out.println(nodeList.item(i).getFirstChild().getNodeValue());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
