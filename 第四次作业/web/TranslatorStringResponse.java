package web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"translatorStringResult"}
)
@XmlRootElement(
        name = "TranslatorStringResponse"
)
public class TranslatorStringResponse {
    @XmlElement(
            name = "TranslatorStringResult"
    )
    protected ArrayOfString translatorStringResult;

    public TranslatorStringResponse() {
    }

    public ArrayOfString getTranslatorStringResult() {
        return this.translatorStringResult;
    }

    public void setTranslatorStringResult(ArrayOfString var1) {
        this.translatorStringResult = var1;
    }
}
