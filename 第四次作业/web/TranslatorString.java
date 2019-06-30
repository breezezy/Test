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
        name = "TranslatorString"
)
public class TranslatorString {
    protected String wordKey;

    public TranslatorString() {
    }

    public String getWordKey() {
        return this.wordKey;
    }

    public void setWordKey(String var1) {
        this.wordKey = var1;
    }
}
