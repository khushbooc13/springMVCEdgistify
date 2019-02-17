package com.bean;
public class User 
{
	private String name;
	private String email;
	private String requestLoc;
	private String zone;
	private Integer service;
	private String serviceDate;
	private Integer RR;
	private String fileName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRequestLoc() {
		return requestLoc;
	}
	public void setRequestLoc(String requestLoc) {
		this.requestLoc = requestLoc;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public Integer getService() {
		return service;
	}
	public void setService(Integer service) {
		this.service = service;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public Integer getRR() {
		return RR;
	}
	public void setRR(Integer rR) {
		RR = rR;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
    	
	@Override
	public String toString(){
		return "{Name="+name+"}";
	}
}
