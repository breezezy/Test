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
        name = "TranslatorSentenceString"
)
public class TranslatorSentenceString {
    protected String wordKey;

    public TranslatorSentenceString() {
    }

    public String getWordKey() {
        return this.wordKey;
    }

    public void setWordKey(String var1) {
        this.wordKey = var1;
    }
}
