package web;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfString",
        propOrder = {"string"}
)
public class ArrayOfString {
    @XmlElement(
            nillable = true
    )
    protected List<String> string;

    public ArrayOfString() {
    }

    public List<String> getString() {
        if (this.string == null) {
            this.string = new ArrayList();
        }

        return this.string;
    }
}
