package com.bbva.egpi.server.log.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import com.bbva.egpi.server.log.beans.LogData;

@Component("logWriter")
public class LogWriter {

	private Logger logger = Logger.getLogger(LogWriter.class.getName());

    private final static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMddhhmmssSSS");
	
	public final static String OK_STATUS = "OK";
	public final static String KO_STATUS = "KO";
	
	public String print(LogData logData) {
		String output = OK_STATUS;
		
		LocalDateTime date = LocalDateTime.now();
        String timestamp = date.format(fmt);
  
		PrintWriter writer = null;
		try {
			logger.log(Level.INFO, "DATA FILE: " + logData.getFile(timestamp));
			
			logger.log(Level.INFO, "DATA: " + logData.getPath());
			logger.log(Level.INFO, "DATA: " + logData.getComponente());
			logger.log(Level.INFO, "DATA: " + logData.getTexto());
			logger.log(Level.INFO, "DATA: " + logData.toString());
			
			writer = new PrintWriter(new BufferedWriter(new FileWriter(logData.getFile(timestamp))));
			writer.write(logData.toString());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			output = KO_STATUS;
			Logger.getLogger(LogWriter.class.getName()).log(Level.INFO, "ERROR", e);
		} finally {
			if(writer != null) {
				writer.close();
			}
		}
		
		return output;
	}
}