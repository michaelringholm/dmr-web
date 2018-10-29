
package dk.skat.dmr._2007._05._31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USForsikringSelskabListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USForsikringSelskabListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USForsikringSelskabListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USForsikringSelskabListeHent_O"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KompenserTrans"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KompenserTransSvar"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USForsikringSelskabListeHentInterfaceType", propOrder = {
    "usForsikringSelskabListeHentI",
    "usForsikringSelskabListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USForsikringSelskabListeHentInterfaceType {

    @XmlElement(name = "USForsikringSelskabListeHent_I")
    protected USForsikringSelskabListeHentI usForsikringSelskabListeHentI;
    @XmlElement(name = "USForsikringSelskabListeHent_O")
    protected USForsikringSelskabListeHentO usForsikringSelskabListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usForsikringSelskabListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USForsikringSelskabListeHentI }
     *     
     */
    public USForsikringSelskabListeHentI getUSForsikringSelskabListeHentI() {
        return usForsikringSelskabListeHentI;
    }

    /**
     * Sets the value of the usForsikringSelskabListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USForsikringSelskabListeHentI }
     *     
     */
    public void setUSForsikringSelskabListeHentI(USForsikringSelskabListeHentI value) {
        this.usForsikringSelskabListeHentI = value;
    }

    /**
     * Gets the value of the usForsikringSelskabListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USForsikringSelskabListeHentO }
     *     
     */
    public USForsikringSelskabListeHentO getUSForsikringSelskabListeHentO() {
        return usForsikringSelskabListeHentO;
    }

    /**
     * Sets the value of the usForsikringSelskabListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USForsikringSelskabListeHentO }
     *     
     */
    public void setUSForsikringSelskabListeHentO(USForsikringSelskabListeHentO value) {
        this.usForsikringSelskabListeHentO = value;
    }

    /**
     * Gets the value of the kompenserTrans property.
     * 
     * @return
     *     possible object is
     *     {@link KompenserTransType }
     *     
     */
    public KompenserTransType getKompenserTrans() {
        return kompenserTrans;
    }

    /**
     * Sets the value of the kompenserTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link KompenserTransType }
     *     
     */
    public void setKompenserTrans(KompenserTransType value) {
        this.kompenserTrans = value;
    }

    /**
     * Gets the value of the kompenserTransSvar property.
     * 
     * @return
     *     possible object is
     *     {@link KompenserTransSvarType }
     *     
     */
    public KompenserTransSvarType getKompenserTransSvar() {
        return kompenserTransSvar;
    }

    /**
     * Sets the value of the kompenserTransSvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link KompenserTransSvarType }
     *     
     */
    public void setKompenserTransSvar(KompenserTransSvarType value) {
        this.kompenserTransSvar = value;
    }

}
