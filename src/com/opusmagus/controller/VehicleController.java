package com.opusmagus.controller;

import java.util.logging.Logger;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import dk.skat.dmr._2007._05._31.USForsikringService;
import dk.skat.dmr.b2b.sample.USForsikingStatusAendringListeHentClient;

@Controller
public class VehicleController {
	private static final Logger logger = Logger.getLogger("VehicleControllerLogger");
	private static final String endpointURL = "https://dmrsit1gateway1.skat.dk/B2B/USForsikring/Service";
	private Bus bus = null;
	private USForsikringService vehicleService = null;
	private USForsikingStatusAendringListeHentClient vehicleServiceClient = null; 

	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		return new ModelAndView("welcome");
	}

	@RequestMapping("/status")
	public @ResponseBody String status() {
		return "{\"status\":\"success\"}";
	}

	@RequestMapping("/changes")
	public @ResponseBody String getChanges(String fromDate) {
		logger.fine("Started DMR invocation...");
		try {
			if (bus == null)
				bus = new SpringBusFactory().createBus("dmr-b2b-policy.xml", false);
			if (vehicleService == null)
				vehicleService = new USForsikringService();			
			if(vehicleServiceClient == null)
				vehicleServiceClient = new USForsikingStatusAendringListeHentClient(endpointURL);
			
			String vehicleInsuranceChangeResponse = vehicleServiceClient.invoke(vehicleService, bus, fromDate);
			logger.fine("DMR invocation ended.");
			return vehicleInsuranceChangeResponse;
		} catch (Exception ex) {
			logger.severe(ex.getMessage());
			ex.printStackTrace();
		}

		return "{\"status\":\"failed\"}";
	}
}
