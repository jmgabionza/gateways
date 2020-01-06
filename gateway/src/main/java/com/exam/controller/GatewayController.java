/**
 * 
 */
package com.exam.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.domain.Gateway;
import com.exam.service.GatewayService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author JANMICHAEL.GABIONZA
 *
 */
@RestController
public class GatewayController {
	
	@Autowired
	private ObjectMapper mapper;
	
	@Autowired
	private GatewayService service;
	
	@RequestMapping("/")
	public String testGateway() {
		return "Spring boot is working.";
	}
	
	@RequestMapping("/save")
	public void saveGateway(@RequestBody String param) {
		try {
			Gateway gateway = mapper.readValue(param, Gateway.class);
			service.addGateway(gateway);
			
			System.out.println(gateway);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/listall")
	public String listAllGateways() {
		List<Gateway> gateways = service.displayAllGateways();
		return serialize(gateways);
	}
	
	@RequestMapping("/find")
	public String findGetway(@RequestBody String id) {
		Gateway result = service.displayGatewayBySerialNumber(id);
		System.out.println(result);
		return serialize(result);
		
	}
	
	@RequestMapping("/delete")
	public void deleteGateway(@RequestBody String id) {
		service.removeGatewayBySerialNumber(id);
	}
	
	private String serialize(Object obj) {
		String result = "";
		try {
			result = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
