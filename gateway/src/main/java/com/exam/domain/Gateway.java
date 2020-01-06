/**
 * 
 */
package com.exam.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author JANMICHAEL.GABIONZA
 *
 */
@Entity
@Table(name = "Gateways")
public class Gateway {
	
	@Id
	private String serialNumber;
	private String name;
	private String ipv4;
	
	@OneToMany(mappedBy="gateway", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
    @JsonSerialize(as = List.class)
	private List<Peripheral> peripherals;

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIpv4() {
		return ipv4;
	}

	public void setIpv4(String ipv4) {
		this.ipv4 = ipv4;
	}

	public List<Peripheral> getPeripherals() {
		return peripherals;
	}

	public void setPeripherals(List<Peripheral> peripherals) {
		this.peripherals = peripherals;
	}

	@Override
	public String toString() {
		return "Gateway [serialNumber=" + serialNumber + ", name=" + name + ", ipv4=" + ipv4 + ", peripherals="
				+ peripherals + "]";
	}
	
	

}
