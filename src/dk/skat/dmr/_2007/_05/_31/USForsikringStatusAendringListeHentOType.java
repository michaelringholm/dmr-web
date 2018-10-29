
package dk.skat.dmr._2007._05._31;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerSvarType;


/**
 * <p>Java class for USForsikringStatusAendringListeHent_OType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USForsikringStatusAendringListeHent_OType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/}HovedOplysningerSvar"/&gt;
 *         &lt;element name="ForsikringStatusAendringListe" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ForsikringStatusAendring" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Koeretoej"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatus"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatusAarsag"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerNummer"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNavn"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Haendelse"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseNummer"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseDato"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Forsikring"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStatus"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringAfgangAarsag" minOccurs="0"/&gt;
 *                                       &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabIdentifikatorStruktur"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedStruktur"/&gt;
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
@XmlType(name = "USForsikringStatusAendringListeHent_OType", propOrder = {
    "hovedOplysningerSvar",
    "forsikringStatusAendringListe"
})
@XmlSeeAlso({
    USForsikringStatusAendringListeHentO.class
})
public class USForsikringStatusAendringListeHentOType {

    @XmlElement(name = "HovedOplysningerSvar", namespace = "http://rep.oio.dk/skat.dk/basis/kontekst/xml/schemas/2006/09/01/", required = true)
    protected HovedOplysningerSvarType hovedOplysningerSvar;
    @XmlElement(name = "ForsikringStatusAendringListe")
    protected USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe forsikringStatusAendringListe;

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
     * Gets the value of the forsikringStatusAendringListe property.
     * 
     * @return
     *     possible object is
     *     {@link USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe }
     *     
     */
    public USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe getForsikringStatusAendringListe() {
        return forsikringStatusAendringListe;
    }

    /**
     * Sets the value of the forsikringStatusAendringListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe }
     *     
     */
    public void setForsikringStatusAendringListe(USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe value) {
        this.forsikringStatusAendringListe = value;
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
     *         &lt;element name="ForsikringStatusAendring" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Koeretoej"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatus"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatusAarsag"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerNummer"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNavn"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Haendelse"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseNummer"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseDato"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Forsikring"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStatus"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringAfgangAarsag" minOccurs="0"/&gt;
     *                             &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabIdentifikatorStruktur"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedStruktur"/&gt;
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
        "forsikringStatusAendring"
    })
    public static class ForsikringStatusAendringListe {

        @XmlElement(name = "ForsikringStatusAendring")
        protected List<USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring> forsikringStatusAendring;

        /**
         * Gets the value of the forsikringStatusAendring property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the forsikringStatusAendring property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForsikringStatusAendring().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring }
         * 
         * 
         */
        public List<USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring> getForsikringStatusAendring() {
            if (forsikringStatusAendring == null) {
                forsikringStatusAendring = new ArrayList<USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring>();
            }
            return this.forsikringStatusAendring;
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
         *         &lt;element name="Koeretoej"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatus"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatusAarsag"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerNummer"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNavn"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Haendelse"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseNummer"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseDato"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Forsikring"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStatus"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringAfgangAarsag" minOccurs="0"/&gt;
         *                   &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabIdentifikatorStruktur"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}JuridiskEnhedStruktur"/&gt;
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
            "koeretoej",
            "haendelse",
            "forsikring",
            "juridiskEnhedStruktur"
        })
        public static class ForsikringStatusAendring {

            @XmlElement(name = "Koeretoej", required = true)
            protected USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Koeretoej koeretoej;
            @XmlElement(name = "Haendelse", required = true)
            protected USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Haendelse haendelse;
            @XmlElement(name = "Forsikring", required = true)
            protected USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Forsikring forsikring;
            @XmlElement(name = "JuridiskEnhedStruktur", required = true)
            protected JuridiskEnhedStrukturType juridiskEnhedStruktur;

            /**
             * Gets the value of the koeretoej property.
             * 
             * @return
             *     possible object is
             *     {@link USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Koeretoej }
             *     
             */
            public USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Koeretoej getKoeretoej() {
                return koeretoej;
            }

            /**
             * Sets the value of the koeretoej property.
             * 
             * @param value
             *     allowed object is
             *     {@link USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Koeretoej }
             *     
             */
            public void setKoeretoej(USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Koeretoej value) {
                this.koeretoej = value;
            }

            /**
             * Gets the value of the haendelse property.
             * 
             * @return
             *     possible object is
             *     {@link USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Haendelse }
             *     
             */
            public USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Haendelse getHaendelse() {
                return haendelse;
            }

            /**
             * Sets the value of the haendelse property.
             * 
             * @param value
             *     allowed object is
             *     {@link USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Haendelse }
             *     
             */
            public void setHaendelse(USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Haendelse value) {
                this.haendelse = value;
            }

            /**
             * Gets the value of the forsikring property.
             * 
             * @return
             *     possible object is
             *     {@link USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Forsikring }
             *     
             */
            public USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Forsikring getForsikring() {
                return forsikring;
            }

            /**
             * Sets the value of the forsikring property.
             * 
             * @param value
             *     allowed object is
             *     {@link USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Forsikring }
             *     
             */
            public void setForsikring(USForsikringStatusAendringListeHentOType.ForsikringStatusAendringListe.ForsikringStatusAendring.Forsikring value) {
                this.forsikring = value;
            }

            /**
             * Gets the value of the juridiskEnhedStruktur property.
             * 
             * @return
             *     possible object is
             *     {@link JuridiskEnhedStrukturType }
             *     
             */
            public JuridiskEnhedStrukturType getJuridiskEnhedStruktur() {
                return juridiskEnhedStruktur;
            }

            /**
             * Sets the value of the juridiskEnhedStruktur property.
             * 
             * @param value
             *     allowed object is
             *     {@link JuridiskEnhedStrukturType }
             *     
             */
            public void setJuridiskEnhedStruktur(JuridiskEnhedStrukturType value) {
                this.juridiskEnhedStruktur = value;
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
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringStatus"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringAfgangAarsag" minOccurs="0"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}ForsikringSelskabIdentifikatorStruktur"/&gt;
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
                "forsikringStatus",
                "forsikringAfgangAarsag",
                "forsikringSelskabIdentifikatorStruktur"
            })
            public static class Forsikring {

                @XmlElement(name = "ForsikringStatus", required = true)
                @XmlSchemaType(name = "string")
                protected ForsikringStatusType forsikringStatus;
                @XmlElement(name = "ForsikringAfgangAarsag")
                protected String forsikringAfgangAarsag;
                @XmlElement(name = "ForsikringSelskabIdentifikatorStruktur", required = true)
                protected ForsikringSelskabIdentifikatorStrukturType forsikringSelskabIdentifikatorStruktur;

                /**
                 * Gets the value of the forsikringStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ForsikringStatusType }
                 *     
                 */
                public ForsikringStatusType getForsikringStatus() {
                    return forsikringStatus;
                }

                /**
                 * Sets the value of the forsikringStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ForsikringStatusType }
                 *     
                 */
                public void setForsikringStatus(ForsikringStatusType value) {
                    this.forsikringStatus = value;
                }

                /**
                 * Gets the value of the forsikringAfgangAarsag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getForsikringAfgangAarsag() {
                    return forsikringAfgangAarsag;
                }

                /**
                 * Sets the value of the forsikringAfgangAarsag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setForsikringAfgangAarsag(String value) {
                    this.forsikringAfgangAarsag = value;
                }

                /**
                 * Gets the value of the forsikringSelskabIdentifikatorStruktur property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ForsikringSelskabIdentifikatorStrukturType }
                 *     
                 */
                public ForsikringSelskabIdentifikatorStrukturType getForsikringSelskabIdentifikatorStruktur() {
                    return forsikringSelskabIdentifikatorStruktur;
                }

                /**
                 * Sets the value of the forsikringSelskabIdentifikatorStruktur property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ForsikringSelskabIdentifikatorStrukturType }
                 *     
                 */
                public void setForsikringSelskabIdentifikatorStruktur(ForsikringSelskabIdentifikatorStrukturType value) {
                    this.forsikringSelskabIdentifikatorStruktur = value;
                }

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
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseNummer"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseDato"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}HaendelseType"/&gt;
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
                "haendelseNummer",
                "haendelseDato",
                "haendelseType"
            })
            public static class Haendelse {

                @XmlElement(name = "HaendelseNummer")
                @XmlSchemaType(name = "integer")
                protected long haendelseNummer;
                @XmlElement(name = "HaendelseDato", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar haendelseDato;
                @XmlElement(name = "HaendelseType", required = true)
                protected String haendelseType;

                /**
                 * Gets the value of the haendelseNummer property.
                 * 
                 */
                public long getHaendelseNummer() {
                    return haendelseNummer;
                }

                /**
                 * Sets the value of the haendelseNummer property.
                 * 
                 */
                public void setHaendelseNummer(long value) {
                    this.haendelseNummer = value;
                }

                /**
                 * Gets the value of the haendelseDato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getHaendelseDato() {
                    return haendelseDato;
                }

                /**
                 * Sets the value of the haendelseDato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setHaendelseDato(XMLGregorianCalendar value) {
                    this.haendelseDato = value;
                }

                /**
                 * Gets the value of the haendelseType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHaendelseType() {
                    return haendelseType;
                }

                /**
                 * Sets the value of the haendelseType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHaendelseType(String value) {
                    this.haendelseType = value;
                }

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
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejIdent"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatus"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejRegistreringStatusAarsag"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}RegistreringNummerNummer"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejOplysningStelNummer"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejArtNavn"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejMaerkeTypeNavn"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejModelTypeNavn"/&gt;
             *         &lt;element ref="{http://skat.dk/dmr/2007/05/31/}KoeretoejVariantTypeNavn"/&gt;
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
                "koeretoejIdent",
                "koeretoejRegistreringStatus",
                "koeretoejRegistreringStatusAarsag",
                "registreringNummerNummer",
                "koeretoejOplysningStelNummer",
                "koeretoejArtNavn",
                "koeretoejMaerkeTypeNavn",
                "koeretoejModelTypeNavn",
                "koeretoejVariantTypeNavn"
            })
            public static class Koeretoej {

                @XmlElement(name = "KoeretoejIdent", required = true)
                protected BigInteger koeretoejIdent;
                @XmlElement(name = "KoeretoejRegistreringStatus", required = true)
                @XmlSchemaType(name = "string")
                protected KoeretoejRegistreringStatusType koeretoejRegistreringStatus;
                @XmlElement(name = "KoeretoejRegistreringStatusAarsag", required = true)
                @XmlSchemaType(name = "string")
                protected KoeretoejRegistreringStatusAarsagType koeretoejRegistreringStatusAarsag;
                @XmlElement(name = "RegistreringNummerNummer", required = true)
                protected String registreringNummerNummer;
                @XmlElement(name = "KoeretoejOplysningStelNummer", required = true)
                protected String koeretoejOplysningStelNummer;
                @XmlElement(name = "KoeretoejArtNavn", required = true)
                protected String koeretoejArtNavn;
                @XmlElement(name = "KoeretoejMaerkeTypeNavn", required = true)
                protected String koeretoejMaerkeTypeNavn;
                @XmlElement(name = "KoeretoejModelTypeNavn", required = true)
                protected String koeretoejModelTypeNavn;
                @XmlElement(name = "KoeretoejVariantTypeNavn", required = true)
                protected String koeretoejVariantTypeNavn;

                /**
                 * Gets the value of the koeretoejIdent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getKoeretoejIdent() {
                    return koeretoejIdent;
                }

                /**
                 * Sets the value of the koeretoejIdent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setKoeretoejIdent(BigInteger value) {
                    this.koeretoejIdent = value;
                }

                /**
                 * Gets the value of the koeretoejRegistreringStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link KoeretoejRegistreringStatusType }
                 *     
                 */
                public KoeretoejRegistreringStatusType getKoeretoejRegistreringStatus() {
                    return koeretoejRegistreringStatus;
                }

                /**
                 * Sets the value of the koeretoejRegistreringStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link KoeretoejRegistreringStatusType }
                 *     
                 */
                public void setKoeretoejRegistreringStatus(KoeretoejRegistreringStatusType value) {
                    this.koeretoejRegistreringStatus = value;
                }

                /**
                 * Gets the value of the koeretoejRegistreringStatusAarsag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link KoeretoejRegistreringStatusAarsagType }
                 *     
                 */
                public KoeretoejRegistreringStatusAarsagType getKoeretoejRegistreringStatusAarsag() {
                    return koeretoejRegistreringStatusAarsag;
                }

                /**
                 * Sets the value of the koeretoejRegistreringStatusAarsag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link KoeretoejRegistreringStatusAarsagType }
                 *     
                 */
                public void setKoeretoejRegistreringStatusAarsag(KoeretoejRegistreringStatusAarsagType value) {
                    this.koeretoejRegistreringStatusAarsag = value;
                }

                /**
                 * Gets the value of the registreringNummerNummer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRegistreringNummerNummer() {
                    return registreringNummerNummer;
                }

                /**
                 * Sets the value of the registreringNummerNummer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRegistreringNummerNummer(String value) {
                    this.registreringNummerNummer = value;
                }

                /**
                 * Gets the value of the koeretoejOplysningStelNummer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKoeretoejOplysningStelNummer() {
                    return koeretoejOplysningStelNummer;
                }

                /**
                 * Sets the value of the koeretoejOplysningStelNummer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKoeretoejOplysningStelNummer(String value) {
                    this.koeretoejOplysningStelNummer = value;
                }

                /**
                 * Gets the value of the koeretoejArtNavn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKoeretoejArtNavn() {
                    return koeretoejArtNavn;
                }

                /**
                 * Sets the value of the koeretoejArtNavn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKoeretoejArtNavn(String value) {
                    this.koeretoejArtNavn = value;
                }

                /**
                 * Gets the value of the koeretoejMaerkeTypeNavn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKoeretoejMaerkeTypeNavn() {
                    return koeretoejMaerkeTypeNavn;
                }

                /**
                 * Sets the value of the koeretoejMaerkeTypeNavn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKoeretoejMaerkeTypeNavn(String value) {
                    this.koeretoejMaerkeTypeNavn = value;
                }

                /**
                 * Gets the value of the koeretoejModelTypeNavn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKoeretoejModelTypeNavn() {
                    return koeretoejModelTypeNavn;
                }

                /**
                 * Sets the value of the koeretoejModelTypeNavn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKoeretoejModelTypeNavn(String value) {
                    this.koeretoejModelTypeNavn = value;
                }

                /**
                 * Gets the value of the koeretoejVariantTypeNavn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKoeretoejVariantTypeNavn() {
                    return koeretoejVariantTypeNavn;
                }

                /**
                 * Sets the value of the koeretoejVariantTypeNavn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKoeretoejVariantTypeNavn(String value) {
                    this.koeretoejVariantTypeNavn = value;
                }

            }

        }

    }

}
