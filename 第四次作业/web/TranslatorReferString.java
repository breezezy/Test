package web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"wordKey"}
)
@XmlRootElement(
        name = "TranslatorReferString"
)
public class TranslatorReferString {
    protected String wordKey;

    public TranslatorReferString() {
    }

    public String getWordKey() {
        return this.wordKey;
    }

    public void setWordKey(String var1) {
        this.wordKey = var1;
    }
}
