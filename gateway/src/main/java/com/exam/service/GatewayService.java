/**
 * 
 */
package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.exam.domain.Gateway;

/**
 * Inteface for the Gateway Service layer
 * 
 * @author JANMICHAEL.GABIONZA
 *
 */
@Component
public interface GatewayService {
	
	/**
	 * Processes the gateway for saving
	 * 
	 * @param gateway
	 */
	public void addGateway(Gateway gateway);
	
	/**
	 * Gets all the saved gateways in the database
	 * 
	 * @return a List of all gateways
	 */
	public List<Gateway> displayAllGateways();
	
	/**
	 * Gets the gateway details by serial number
	 * 
	 * @param serialNumber
	 * @returns gateway details
	 */
	public Gateway displayGatewayBySerialNumber(String serialNumber);
	
	public void removeGatewayBySerialNumber(String serialNumber);

}
