package web;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"translatorResult"}
)
@XmlRootElement(
        name = "TranslatorResponse"
)
public class TranslatorResponse {
    @XmlElement(
            name = "TranslatorResult"
    )
    protected TranslatorResponse.TranslatorResult translatorResult;

    public TranslatorResponse() {
    }

    public TranslatorResponse.TranslatorResult getTranslatorResult() {
        return this.translatorResult;
    }

    public void setTranslatorResult(TranslatorResponse.TranslatorResult var1) {
        this.translatorResult = var1;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"any"}
    )
    public static class TranslatorResult {
        @XmlAnyElement(
                lax = true
        )
        protected List<Object> any;

        public TranslatorResult() {
        }

        public List<Object> getAny() {
            if (this.any == null) {
                this.any = new ArrayList();
            }

            return this.any;
        }
    }
}
