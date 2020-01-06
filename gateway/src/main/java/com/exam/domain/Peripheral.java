/**
 * 
 */
package com.exam.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author JANMICHAEL.GABIONZA
 *
 */
@Entity
@Table(name = "Peripherals")
public class Peripheral {

	@Id
	private String uid;
	private String vendor;
	private String createDate;
	private String status;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="serial_number", nullable=false)
	@JsonBackReference
	private Gateway gateway;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Gateway getGateway() {
		return gateway;
	}

	public void setGateway(Gateway gateway) {
		this.gateway = gateway;
	}

	@Override
	public String toString() {
		return "Peripheral [uid=" + uid + ", vendor=" + vendor + ", createDate=" + createDate + ", status=" + status + "]";
	}

}
