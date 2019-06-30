package web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getMp3Result"}
)
@XmlRootElement(
        name = "GetMp3Response"
)
public class GetMp3Response {
    @XmlElement(
            name = "GetMp3Result"
    )
    protected byte[] getMp3Result;

    public GetMp3Response() {
    }

    public byte[] getGetMp3Result() {
        return this.getMp3Result;
    }

    public void setGetMp3Result(byte[] var1) {
        this.getMp3Result = var1;
    }
}
