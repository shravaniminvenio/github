package com.redn.connect.util.ConnectUtilsConnector.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.Scanner;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

//import javax.xml.datatype.DatatypeConfigurationException;
//import javax.xml.datatype.DatatypeFactory;
//import javax.xml.datatype.XMLGregorianCalendar;

//import org.joda.time.DateTime;
//import org.joda.time.DateTimeZone;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

@Connector(name = "connect-utils", friendlyName = "ConnectUtils")
public class ConnectUtilsConnector {

//	@Config
//	ConnectorConfig config;
	private static DatatypeFactory DATATYPE_FACTORY;

	static {
		try {
			DATATYPE_FACTORY = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			// LOGGER.error("Unable to create a DatatypeFactory. Possible
			// classloader issues?", e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * Custom processor
	 *
	 * @param friend
	 *            Name to be used to generate a greeting message.
	 * @return A greeting message
	 * @throws ParseException
	 */
	
	/**
	 * This method formats the EDIFACT date 
	 * @param inputDTM the date to b formated
	 * @return the formatted date
	 * @throws Exception the exception
	 */
	/*-
	 * Ex:dateToBFormated  : DTM+4:20150501010101UTC?+12:304
	 * Result      : Mon May 11 01:01:01 IST 2015
	 * @throws Exception
	 */
	@Processor
	public String getFormattedDate(String inputDTM) throws ParseException {
	
		inputDTM = inputDTM.substring(7, 24);
		System.out.println(inputDTM);
		SimpleDateFormat dateObj = new SimpleDateFormat("yyyyMMddHHmmssZZZ");
		Date date = dateObj.parse(inputDTM);
		System.out.println("Converted form is :-" + date);
		return inputDTM;
	}
	/**
	 * This method is used to get the date as XMLGregorianCalendar.
	 *
	 * @param date the date
	 * @return the date as xml gregorian calendar
	 */

	/*-
	 * Ex:Result    : 2016-11-24T14:29:15.565+05:30
	 * @throws Exception
	 */

	@Processor
	public XMLGregorianCalendar getDateAsXMLGregorianCalendar(Date date) {

		final Date dateValue = date == null ? new Date() : date;
		GregorianCalendar gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
		gregorianCalendar.setTime(dateValue);
		return DATATYPE_FACTORY.newXMLGregorianCalendar(gregorianCalendar);
	}

	/*public ConnectorConfig getConfig() {
		return config;
	}

	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}*/

}