
package dk.skat.dmr._2007._05._31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USForsikringStatusAendringListeHentInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USForsikringStatusAendringListeHentInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USForsikringStatusAendringListeHent_I"/&gt;
 *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}USForsikringStatusAendringListeHent_O"/&gt;
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
@XmlType(name = "USForsikringStatusAendringListeHentInterfaceType", propOrder = {
    "usForsikringStatusAendringListeHentI",
    "usForsikringStatusAendringListeHentO",
    "kompenserTrans",
    "kompenserTransSvar"
})
public class USForsikringStatusAendringListeHentInterfaceType {

    @XmlElement(name = "USForsikringStatusAendringListeHent_I")
    protected USForsikringStatusAendringListeHentI usForsikringStatusAendringListeHentI;
    @XmlElement(name = "USForsikringStatusAendringListeHent_O")
    protected USForsikringStatusAendringListeHentO usForsikringStatusAendringListeHentO;
    @XmlElement(name = "KompenserTrans")
    protected KompenserTransType kompenserTrans;
    @XmlElement(name = "KompenserTransSvar")
    protected KompenserTransSvarType kompenserTransSvar;

    /**
     * Gets the value of the usForsikringStatusAendringListeHentI property.
     * 
     * @return
     *     possible object is
     *     {@link USForsikringStatusAendringListeHentI }
     *     
     */
    public USForsikringStatusAendringListeHentI getUSForsikringStatusAendringListeHentI() {
        return usForsikringStatusAendringListeHentI;
    }

    /**
     * Sets the value of the usForsikringStatusAendringListeHentI property.
     * 
     * @param value
     *     allowed object is
     *     {@link USForsikringStatusAendringListeHentI }
     *     
     */
    public void setUSForsikringStatusAendringListeHentI(USForsikringStatusAendringListeHentI value) {
        this.usForsikringStatusAendringListeHentI = value;
    }

    /**
     * Gets the value of the usForsikringStatusAendringListeHentO property.
     * 
     * @return
     *     possible object is
     *     {@link USForsikringStatusAendringListeHentO }
     *     
     */
    public USForsikringStatusAendringListeHentO getUSForsikringStatusAendringListeHentO() {
        return usForsikringStatusAendringListeHentO;
    }

    /**
     * Sets the value of the usForsikringStatusAendringListeHentO property.
     * 
     * @param value
     *     allowed object is
     *     {@link USForsikringStatusAendringListeHentO }
     *     
     */
    public void setUSForsikringStatusAendringListeHentO(USForsikringStatusAendringListeHentO value) {
        this.usForsikringStatusAendringListeHentO = value;
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
