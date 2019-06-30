package web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import web.TranslatorResponse.TranslatorResult;

@XmlRegistry
public class ObjectFactory {
    private static final QName _DataSet_QNAME = new QName("http://WebXml.com.cn/", "DataSet");
    private static final QName _Base64Binary_QNAME = new QName("http://WebXml.com.cn/", "base64Binary");
    private static final QName _ArrayOfString_QNAME = new QName("http://WebXml.com.cn/", "ArrayOfString");

    public ObjectFactory() {
    }

    public TranslatorResponse createTranslatorResponse() {
        return new TranslatorResponse();
    }

    public TranslatorString createTranslatorString() {
        return new TranslatorString();
    }

    public SuggestWordResponse createSuggestWordResponse() {
        return new SuggestWordResponse();
    }

    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    public DataSet createDataSet() {
        return new DataSet();
    }

    public TranslatorSentenceStringResponse createTranslatorSentenceStringResponse() {
        return new TranslatorSentenceStringResponse();
    }

    public GetMp3Response createGetMp3Response() {
        return new GetMp3Response();
    }

    public TranslatorReferString createTranslatorReferString() {
        return new TranslatorReferString();
    }

    public TranslatorReferStringResponse createTranslatorReferStringResponse() {
        return new TranslatorReferStringResponse();
    }

    public TranslatorResult createTranslatorResponseTranslatorResult() {
        return new TranslatorResult();
    }

    public TranslatorSentenceString createTranslatorSentenceString() {
        return new TranslatorSentenceString();
    }

    public TranslatorStringResponse createTranslatorStringResponse() {
        return new TranslatorStringResponse();
    }

    public Translator createTranslator() {
        return new Translator();
    }

    public GetMp3 createGetMp3() {
        return new GetMp3();
    }

    public SuggestWord createSuggestWord() {
        return new SuggestWord();
    }

    @XmlElementDecl(
            namespace = "http://WebXml.com.cn/",
            name = "DataSet"
    )
    public JAXBElement<DataSet> createDataSet(DataSet var1) {
        return new JAXBElement(_DataSet_QNAME, DataSet.class, (Class)null, var1);
    }

    @XmlElementDecl(
            namespace = "http://WebXml.com.cn/",
            name = "base64Binary"
    )
    public JAXBElement<byte[]> createBase64Binary(byte[] var1) {
        return new JAXBElement(_Base64Binary_QNAME, byte[].class, (Class)null, (byte[])var1);
    }

    @XmlElementDecl(
            namespace = "http://WebXml.com.cn/",
            name = "ArrayOfString"
    )
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString var1) {
        return new JAXBElement(_ArrayOfString_QNAME, ArrayOfString.class, (Class)null, var1);
    }
}
