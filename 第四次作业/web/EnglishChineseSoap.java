package web;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import web.TranslatorResponse.TranslatorResult;

@WebService(
        name = "EnglishChineseSoap",
        targetNamespace = "http://WebXml.com.cn/"
)
@XmlSeeAlso({ObjectFactory.class})
public interface EnglishChineseSoap {
    @WebMethod(
            operationName = "Translator",
            action = "http://WebXml.com.cn/Translator"
    )
    @WebResult(
            name = "TranslatorResult",
            targetNamespace = "http://WebXml.com.cn/"
    )
    @RequestWrapper(
            localName = "Translator",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.Translator"
    )
    @ResponseWrapper(
            localName = "TranslatorResponse",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.TranslatorResponse"
    )
    TranslatorResult translator(@WebParam(name = "wordKey",targetNamespace = "http://WebXml.com.cn/") String var1);

    @WebMethod(
            operationName = "TranslatorString",
            action = "http://WebXml.com.cn/TranslatorString"
    )
    @WebResult(
            name = "TranslatorStringResult",
            targetNamespace = "http://WebXml.com.cn/"
    )
    @RequestWrapper(
            localName = "TranslatorString",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.TranslatorString"
    )
    @ResponseWrapper(
            localName = "TranslatorStringResponse",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.TranslatorStringResponse"
    )
    ArrayOfString translatorString(@WebParam(name = "wordKey",targetNamespace = "http://WebXml.com.cn/") String var1);

    @WebMethod(
            operationName = "TranslatorReferString",
            action = "http://WebXml.com.cn/TranslatorReferString"
    )
    @WebResult(
            name = "TranslatorReferStringResult",
            targetNamespace = "http://WebXml.com.cn/"
    )
    @RequestWrapper(
            localName = "TranslatorReferString",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.TranslatorReferString"
    )
    @ResponseWrapper(
            localName = "TranslatorReferStringResponse",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.TranslatorReferStringResponse"
    )
    ArrayOfString translatorReferString(@WebParam(name = "wordKey",targetNamespace = "http://WebXml.com.cn/") String var1);

    @WebMethod(
            operationName = "TranslatorSentenceString",
            action = "http://WebXml.com.cn/TranslatorSentenceString"
    )
    @WebResult(
            name = "TranslatorSentenceStringResult",
            targetNamespace = "http://WebXml.com.cn/"
    )
    @RequestWrapper(
            localName = "TranslatorSentenceString",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.TranslatorSentenceString"
    )
    @ResponseWrapper(
            localName = "TranslatorSentenceStringResponse",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.TranslatorSentenceStringResponse"
    )
    ArrayOfString translatorSentenceString(@WebParam(name = "wordKey",targetNamespace = "http://WebXml.com.cn/") String var1);

    @WebMethod(
            operationName = "SuggestWord",
            action = "http://WebXml.com.cn/SuggestWord"
    )
    @WebResult(
            name = "SuggestWordResult",
            targetNamespace = "http://WebXml.com.cn/"
    )
    @RequestWrapper(
            localName = "SuggestWord",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.SuggestWord"
    )
    @ResponseWrapper(
            localName = "SuggestWordResponse",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.SuggestWordResponse"
    )
    ArrayOfString suggestWord(@WebParam(name = "wordKey",targetNamespace = "http://WebXml.com.cn/") String var1);

    @WebMethod(
            operationName = "GetMp3",
            action = "http://WebXml.com.cn/GetMp3"
    )
    @WebResult(
            name = "GetMp3Result",
            targetNamespace = "http://WebXml.com.cn/"
    )
    @RequestWrapper(
            localName = "GetMp3",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.GetMp3"
    )
    @ResponseWrapper(
            localName = "GetMp3Response",
            targetNamespace = "http://WebXml.com.cn/",
            className = "wsTransproxy.GetMp3Response"
    )
    byte[] getMp3(@WebParam(name = "Mp3",targetNamespace = "http://WebXml.com.cn/") String var1);
}
