package web;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
        name = "EnglishChinese",
        targetNamespace = "http://WebXml.com.cn/",
        wsdlLocation = "file:/F:/Distribute_compute_code/task4/src/EnglishChinese.xml"
)
public class EnglishChinese extends Service  {
    private static final URL ENGLISHCHINESE_WSDL_LOCATION;
    private static final WebServiceException ENGLISHCHINESE_EXCEPTION;
    private static final QName ENGLISHCHINESE_QNAME = new QName("http://WebXml.com.cn/", "EnglishChinese");

    public EnglishChinese() {
        super(__getWsdlLocation(), ENGLISHCHINESE_QNAME);
    }

    public EnglishChinese(WebServiceFeature... var1) {
        super(__getWsdlLocation(), ENGLISHCHINESE_QNAME, var1);
    }

    public EnglishChinese(URL var1) {
        super(var1, ENGLISHCHINESE_QNAME);
    }

    public EnglishChinese(URL var1, WebServiceFeature... var2) {
        super(var1, ENGLISHCHINESE_QNAME, var2);
    }

    public EnglishChinese(URL var1, QName var2) {
        super(var1, var2);
    }

    public EnglishChinese(URL var1, QName var2, WebServiceFeature... var3) {
        super(var1, var2, var3);
    }

    @WebEndpoint(
            name = "EnglishChineseSoap"
    )
    public EnglishChineseSoap getEnglishChineseSoap() {
        return (EnglishChineseSoap)super.getPort(new QName("http://WebXml.com.cn/", "EnglishChineseSoap"), EnglishChineseSoap.class);
    }

    @WebEndpoint(
            name = "EnglishChineseSoap"
    )
    public EnglishChineseSoap getEnglishChineseSoap(WebServiceFeature... var1) {
        return (EnglishChineseSoap)super.getPort(new QName("http://WebXml.com.cn/", "EnglishChineseSoap"), EnglishChineseSoap.class, var1);
    }

    private static URL __getWsdlLocation() {
        if (ENGLISHCHINESE_EXCEPTION != null) {
            throw ENGLISHCHINESE_EXCEPTION;
        } else {
            return ENGLISHCHINESE_WSDL_LOCATION;
        }
    }

    static {
        URL var0 = null;
        WebServiceException var1 = null;

        try {
            var0 = new URL("file:/F:/Distribute_compute_code/task4/src/EnglishChinese.xml");
        } catch (MalformedURLException var3) {
            var1 = new WebServiceException(var3);
        }

        ENGLISHCHINESE_WSDL_LOCATION = var0;
        ENGLISHCHINESE_EXCEPTION = var1;
    }
}
