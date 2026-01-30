package _3_AdapterDesignPattern;

public class XmlToJsonAdapter implements JsonService {
    private XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    public String getJson() {
        String xml = xmlService.getXml();
        return "{ \"data\": \"Hello\" }"; // giả lập chuyển đổi
    }
}