package com.bbva.egpi.server.log.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.egpi.server.log.beans.LogData;
import com.bbva.egpi.server.log.controller.LogWriter;

@RestController
public class RestControllerServer {

	@Autowired
    private LogWriter logWriter;
	
//	@RequestMapping("/logData")
//	public LogData logData(@RequestParam(value = "timestamp", defaultValue = "notFound") String timestamp,
//			@RequestParam(value = "componente", defaultValue = "EGPIXXX") String componente,
//			@RequestParam(value = "texto", defaultValue = "notTextFound") String texto) {
//
//		return new LogData(timestamp, componente, texto);
//	}

	@RequestMapping(value = "/logData", method = RequestMethod.POST, consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public String create(@RequestBody LogData logData) {
		return logWriter.print(logData);
	}
}