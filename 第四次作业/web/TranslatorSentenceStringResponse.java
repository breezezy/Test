package web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"translatorSentenceStringResult"}
)
@XmlRootElement(
        name = "TranslatorSentenceStringResponse"
)
public class TranslatorSentenceStringResponse {
    @XmlElement(
            name = "TranslatorSentenceStringResult"
    )
    protected ArrayOfString translatorSentenceStringResult;

    public TranslatorSentenceStringResponse() {
    }

    public ArrayOfString getTranslatorSentenceStringResult() {
        return this.translatorSentenceStringResult;
    }

    public void setTranslatorSentenceStringResult(ArrayOfString var1) {
        this.translatorSentenceStringResult = var1;
    }
}
