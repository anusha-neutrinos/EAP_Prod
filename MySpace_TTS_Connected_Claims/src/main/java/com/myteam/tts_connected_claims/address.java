package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class address implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("suburb")
	private java.lang.String suburb;

	@org.kie.api.definition.type.Label("city")
	private java.lang.String city;

	@org.kie.api.definition.type.Label("province")
	private java.lang.String province;

	@org.kie.api.definition.type.Label("town")
	private java.lang.String town;

	@org.kie.api.definition.type.Label("streetName")
	private java.lang.String streetName;

	@org.kie.api.definition.type.Label("postalCode")
	private java.lang.String postalCode;

	@org.kie.api.definition.type.Label("unitNumber")
	private String unitNumber;

	@org.kie.api.definition.type.Label("streetNumber")
	private java.lang.String streetNumber;

	public address() {
	}

	public java.lang.String getSuburb() {
		return this.suburb;
	}

	public void setSuburb(java.lang.String suburb) {
		this.suburb = suburb;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.String getProvince() {
		return this.province;
	}

	public void setProvince(java.lang.String province) {
		this.province = province;
	}

	public java.lang.String getTown() {
		return this.town;
	}

	public void setTown(java.lang.String town) {
		this.town = town;
	}

	public java.lang.String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(java.lang.String streetName) {
		this.streetName = streetName;
	}

	public java.lang.String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(java.lang.String postalCode) {
		this.postalCode = postalCode;
	}

	public java.lang.String getStreetNumber() {
		return this.streetNumber;
	}

	public void setStreetNumber(java.lang.String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public java.lang.String getUnitNumber() {
		return this.unitNumber;
	}

	public void setUnitNumber(java.lang.String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public address(java.lang.String suburb, java.lang.String city,
			java.lang.String province, java.lang.String town,
			java.lang.String streetName, java.lang.String postalCode,
			java.lang.String unitNumber, java.lang.String streetNumber) {
		this.suburb = suburb;
		this.city = city;
		this.province = province;
		this.town = town;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.unitNumber = unitNumber;
		this.streetNumber = streetNumber;
	}

}