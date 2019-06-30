package web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"mp3"}
)
@XmlRootElement(
        name = "GetMp3"
)
public class GetMp3 {
    @XmlElement(
            name = "Mp3"
    )
    protected String mp3;

    public GetMp3() {
    }

    public String getMp3() {
        return this.mp3;
    }

    public void setMp3(String var1) {
        this.mp3 = var1;
    }
}
