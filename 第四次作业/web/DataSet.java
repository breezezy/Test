package web;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"any"}
)
public class DataSet {
    @XmlAnyElement(
            lax = true
    )
    protected List<Object> any;

    public DataSet() {
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList();
        }

        return this.any;
    }
}
