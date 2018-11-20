package dk.skat.dmr.b2b.sample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import com.google.gson.Gson;

import dk.oio.rep.skat_dk.basis.kontekst.xml.schemas._2006._09._01.HovedOplysningerType;
import dk.skat.dmr._2007._05._31.USForsikringService;
import dk.skat.dmr._2007._05._31.USForsikringServiceType;
import dk.skat.dmr._2007._05._31.USForsikringStatusAendringListeHentI;
import dk.skat.dmr._2007._05._31.USForsikringStatusAendringListeHentO;

@SuppressWarnings("ALL")
public class USForsikingStatusAendringListeHentClient {

	private static final Logger logger = Logger.getLogger(USForsikingStatusAendringListeHentClient.class.getName());
	private static final Gson jsonConverter = new Gson();
	private static final String newLine = System.getProperty("line.separator");
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
	private USForsikringServiceType servicePort = null;

	private String endpointURL;

	private USForsikingStatusAendringListeHentClient() {
	}

	public USForsikingStatusAendringListeHentClient(String endpointURL) {
		this.endpointURL = endpointURL;
	}

	@SuppressWarnings("restriction")
	public String invoke(USForsikringService service, Bus bus, String searchFromTime) throws Exception {
		if(servicePort == null)
			buildServicePort(service, bus);
		
		USForsikringStatusAendringListeHentI vehicleChangesRequest = new USForsikringStatusAendringListeHentI();
		vehicleChangesRequest.setHovedOplysninger(getHeaderInfo());
		vehicleChangesRequest.setDatoTidSoegFra(getXmlSearchFromTimeCal(searchFromTime));
		logRequest(newLine, vehicleChangesRequest);
		USForsikringStatusAendringListeHentO response = servicePort.getUSForsikringStatusAendringListeHent(vehicleChangesRequest);

		String vehicleInsuranceChangeJSON = jsonConverter.toJson(response);
		logger.finest(vehicleInsuranceChangeJSON);
		return vehicleInsuranceChangeJSON;
	}

	private void buildServicePort(USForsikringService service, Bus bus) {
		BusFactory.setDefaultBus(bus);
		servicePort = service.getPort();
		BindingProvider serviceProvider = (BindingProvider) servicePort;
		serviceProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpointURL);
	}

	private XMLGregorianCalendar getXmlSearchFromTimeCal(String searchFromTime) throws Exception {
		GregorianCalendar searchFromTimeCal = new GregorianCalendar();			
		searchFromTimeCal.setTime(sdf.parse(searchFromTime));
		XMLGregorianCalendar xmlSearchFromTimeCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(searchFromTimeCal);
		return xmlSearchFromTimeCal;
	}

	private HovedOplysningerType getHeaderInfo() throws Exception {
		final String prefix = "ACME_01_";
		String transactionID = UUID.randomUUID().toString();
		if (prefix != null) {
			transactionID = prefix + transactionID;
		}
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(new Date());
		XMLGregorianCalendar transactionTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		HovedOplysningerType headerInfo = new HovedOplysningerType();
		headerInfo.setTransaktionIdentifikator(transactionID);
		headerInfo.setTransaktionTid(transactionTime);
		return headerInfo;
	}

	private void logRequest(String newLine, USForsikringStatusAendringListeHentI usForsikringStatusAendringHentIType) {
		StringBuilder sbRequest = new StringBuilder();
		sbRequest.append("*******************************************************************").append(newLine);
		sbRequest.append("** Endpoint: ").append(endpointURL).append(newLine);
		sbRequest.append("*******************************************************************").append(newLine);
		sbRequest.append("** HovedOplysninger").append(newLine);
		sbRequest.append("**** Transaction Id: ")
				.append(usForsikringStatusAendringHentIType.getHovedOplysninger().getTransaktionIdentifikator())
				.append(newLine);
		sbRequest.append("**** Transaction Time: ")
				.append(usForsikringStatusAendringHentIType.getHovedOplysninger().getTransaktionTid()).append(newLine);
		sbRequest.append("*******************************************************************").append(newLine);
		logger.fine(newLine + sbRequest.toString());

	}

	// Added by MRS
	/*
	 * public static void main() { System.out.println("Started DMR invocation...");
	 * try { Bus bus = new SpringBusFactory().createBus("dmr-b2b-policy.xml",
	 * false); USForsikringService forsikringService = new USForsikringService();
	 * 
	 * String endpointURL =
	 * "https://dmrsit1gateway1.skat.dk/B2B/USForsikring/Service";
	 * USForsikingStatusAendringListeHentClient oioLedsageDocumentClient = new
	 * USForsikingStatusAendringListeHentClient(endpointURL);
	 * oioLedsageDocumentClient.invoke(forsikringService, bus);
	 * System.out.println("DMR invocation ended."); } catch(Exception ex) {
	 * System.out.println("DMR invocation badly!"); } }
	 */

}
