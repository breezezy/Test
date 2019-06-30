package web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"translatorReferStringResult"}
)
@XmlRootElement(
        name = "TranslatorReferStringResponse"
)
public class TranslatorReferStringResponse {
    @XmlElement(
            name = "TranslatorReferStringResult"
    )
    protected ArrayOfString translatorReferStringResult;

    public TranslatorReferStringResponse() {
    }

    public ArrayOfString getTranslatorReferStringResult() {
        return this.translatorReferStringResult;
    }

    public void setTranslatorReferStringResult(ArrayOfString var1) {
        this.translatorReferStringResult = var1;
    }
}
