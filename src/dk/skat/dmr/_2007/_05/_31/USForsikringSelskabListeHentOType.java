
package dk.skat.dmr._2007._05._31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USForsikringSelskabListeHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USForsikringSelskabListeHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabSamlingStruktur" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USForsikringSelskabListeHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "forsikringSelskabSamlingStruktur"
})
@XmlSeeAlso({
    USForsikringSelskabListeHentO.class
})
public class USForsikringSelskabListeHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "ForsikringSelskabSamlingStruktur")
    protected ForsikringSelskabSamlingStrukturType forsikringSelskabSamlingStruktur;

    /**
     * Gets the value of the hovedOplysningerSvar property.
     * 
     * @return
     *     possible object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public HovedOplysningerSvarType getHovedOplysningerSvar() {
        return hovedOplysningerSvar;
    }

    /**
     * Sets the value of the hovedOplysningerSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link HovedOplysningerSvarType }
     *     
     */
    public void setHovedOplysningerSvar(HovedOplysningerSvarType value) {
        this.hovedOplysningerSvar = value;
    }

    /**
     * Gets the value of the forsikringSelskabSamlingStruktur property.
     * 
     * @return
     *     possible object is
     *     {@link ForsikringSelskabSamlingStrukturType }
     *     
     */
    public ForsikringSelskabSamlingStrukturType getForsikringSelskabSamlingStruktur() {
        return forsikringSelskabSamlingStruktur;
    }

    /**
     * Sets the value of the forsikringSelskabSamlingStruktur property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForsikringSelskabSamlingStrukturType }
     *     
     */
    public void setForsikringSelskabSamlingStruktur(ForsikringSelskabSamlingStrukturType value) {
        this.forsikringSelskabSamlingStruktur = value;
    }

}
