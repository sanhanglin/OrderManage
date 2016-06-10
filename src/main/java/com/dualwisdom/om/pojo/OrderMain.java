package com.dualwisdom.om.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrderMain implements Serializable {

	private static final long serialVersionUID = 2652668703105629745L;

	private String orderKey;
	private String externOrderKey;
	private String customerNumber;
	private String customerName;
	private String shipToAddr1;
	private String shipToAddr2;
	private String shipToAddr3;
	private String shipToAddr4;
	private String shipToAddr5;
	private Date etd;
	private Date eta;
	private Date invoiceDate;
	private String invoiceNumber;
	private Date creationDate;
	private String createdBy;
	private Date lastUpdateDate;
	private String lastUpdatedBy;
	
	public String getOrderKey() {
		return orderKey;
	}
	public void setOrderKey(String orderKey) {
		this.orderKey = orderKey;
	}
	public String getExternOrderKey() {
		return externOrderKey;
	}
	public void setExternOrderKey(String externOrderKey) {
		this.externOrderKey = externOrderKey;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getShipToAddr1() {
		return shipToAddr1;
	}
	public void setShipToAddr1(String shipToAddr1) {
		this.shipToAddr1 = shipToAddr1;
	}
	public String getShipToAddr2() {
		return shipToAddr2;
	}
	public void setShipToAddr2(String shipToAddr2) {
		this.shipToAddr2 = shipToAddr2;
	}
	public String getShipToAddr3() {
		return shipToAddr3;
	}
	public void setShipToAddr3(String shipToAddr3) {
		this.shipToAddr3 = shipToAddr3;
	}
	public String getShipToAddr4() {
		return shipToAddr4;
	}
	public void setShipToAddr4(String shipToAddr4) {
		this.shipToAddr4 = shipToAddr4;
	}
	public String getShipToAddr5() {
		return shipToAddr5;
	}
	public void setShipToAddr5(String shipToAddr5) {
		this.shipToAddr5 = shipToAddr5;
	}
	public Date getEtd() {
		return etd;
	}
	public void setEtd(Date etd) {
		this.etd = etd;
	}
	public Date getEta() {
		return eta;
	}
	public void setEta(Date eta) {
		this.eta = eta;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	
	
}
