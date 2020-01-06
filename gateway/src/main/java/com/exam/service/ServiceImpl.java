/**
 * 
 */
package com.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.exam.domain.Gateway;
import com.exam.domain.Peripheral;
import com.exam.repository.GatewayRepository;
import com.exam.repository.PeripheralRepository;

/**
 * The service layer of the application
 * 
 * @author JANMICHAEL.GABIONZA
 *
 */
@Component
public class ServiceImpl implements GatewayService, PeripheralService {

	@Autowired
	GatewayRepository gatewayRepository;
	
	@Autowired
	PeripheralRepository peripheralRepository;
		
	public void addGateway(Gateway gateway) {
		gatewayRepository.save(gateway);
	
	}

	public List<Gateway> displayAllGateways() {
		List<Gateway> gateways = new ArrayList<Gateway>();
		gatewayRepository.findAll().forEach(gateway -> gateways.add(gateway));
		return gateways;
	}

	public Gateway displayGatewayBySerialNumber(String serialNumber) {
		Gateway gateway = gatewayRepository.findById(serialNumber).orElse(null);
		return gateway;
	}

	public void removeGatewayBySerialNumber(String serialNumber) {
		gatewayRepository.deleteById(serialNumber);	
	}

	@Override
	public void removePeripheralById(String uid) {
		peripheralRepository.deleteById(uid);
	}

	@Override
	public void addPeripheral(String serialNumber, Peripheral peripheral) {
		Gateway gateway = gatewayRepository.findById(serialNumber).orElse(null);
		peripheral.setGateway(gateway);
		
		peripheralRepository.save(peripheral);
	}
}
