/**
 * 
 */
package com.exam.service;

import com.exam.domain.Peripheral;

/**
 * @author JANMICHAEL.GABIONZA
 *
 */
public interface PeripheralService {
	
	public void removePeripheralById(String uid);
	
	public void addPeripheral(String serialNumber, Peripheral peripheral);

}
