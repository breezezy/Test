package web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"suggestWordResult"}
)
@XmlRootElement(
        name = "SuggestWordResponse"
)
public class SuggestWordResponse {
    @XmlElement(
            name = "SuggestWordResult"
    )
    protected ArrayOfString suggestWordResult;

    public SuggestWordResponse() {
    }

    public ArrayOfString getSuggestWordResult() {
        return this.suggestWordResult;
    }

    public void setSuggestWordResult(ArrayOfString var1) {
        this.suggestWordResult = var1;
    }
}
