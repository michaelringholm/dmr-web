
package dk.skat.dmr._2007._05._31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForsikringSelskabSamlingStrukturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForsikringSelskabSamlingStrukturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForsikringSelskabSamling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ForsikringSelskab" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabStruktur"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForsikringSelskabSamlingStrukturType", propOrder = {
    "forsikringSelskabSamling"
})
public class ForsikringSelskabSamlingStrukturType {

    @XmlElement(name = "ForsikringSelskabSamling", required = true)
    protected ForsikringSelskabSamlingStrukturType.ForsikringSelskabSamling forsikringSelskabSamling;

    /**
     * Gets the value of the forsikringSelskabSamling property.
     * 
     * @return
     *     possible object is
     *     {@link ForsikringSelskabSamlingStrukturType.ForsikringSelskabSamling }
     *     
     */
    public ForsikringSelskabSamlingStrukturType.ForsikringSelskabSamling getForsikringSelskabSamling() {
        return forsikringSelskabSamling;
    }

    /**
     * Sets the value of the forsikringSelskabSamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForsikringSelskabSamlingStrukturType.ForsikringSelskabSamling }
     *     
     */
    public void setForsikringSelskabSamling(ForsikringSelskabSamlingStrukturType.ForsikringSelskabSamling value) {
        this.forsikringSelskabSamling = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ForsikringSelskab" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabStruktur"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "forsikringSelskab"
    })
    public static class ForsikringSelskabSamling {

        @XmlElement(name = "ForsikringSelskab")
        protected List<ForsikringSelskabSamlingStrukturType.ForsikringSelskabSamling.ForsikringSelskab> forsikringSelskab;

        /**
         * Gets the value of the forsikringSelskab property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the forsikringSelskab property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForsikringSelskab().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ForsikringSelskabSamlingStrukturType.ForsikringSelskabSamling.ForsikringSelskab }
         * 
         * 
         */
        public List<ForsikringSelskabSamlingStrukturType.ForsikringSelskabSamling.ForsikringSelskab> getForsikringSelskab() {
            if (forsikringSelskab == null) {
                forsikringSelskab = new ArrayList<ForsikringSelskabSamlingStrukturType.ForsikringSelskabSamling.ForsikringSelskab>();
            }
            return this.forsikringSelskab;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabStruktur"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "forsikringSelskabStruktur"
        })
        public static class ForsikringSelskab {

            @XmlElement(name = "ForsikringSelskabStruktur", required = true)
            protected ForsikringSelskabStrukturType forsikringSelskabStruktur;

            /**
             * Gets the value of the forsikringSelskabStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link ForsikringSelskabStrukturType }
             *     
             */
            public ForsikringSelskabStrukturType getForsikringSelskabStruktur() {
                return forsikringSelskabStruktur;
            }

            /**
             * Sets the value of the forsikringSelskabStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link ForsikringSelskabStrukturType }
             *     
             */
            public void setForsikringSelskabStruktur(ForsikringSelskabStrukturType value) {
                this.forsikringSelskabStruktur = value;
            }

        }

    }

}
