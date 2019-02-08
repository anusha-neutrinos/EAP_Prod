package com.myteam.rulesbase;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class dedupResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "existingCase")
	private com.myteam.rulesbase.dedupCaseParams existingCase;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "newCase")
	private com.myteam.rulesbase.dedupCaseParams newCase;

	@org.kie.api.definition.type.Label(value = "dupIncidentTime")
	private java.lang.Boolean dupIncidentTime;

	@org.kie.api.definition.type.Label(value = "dupIncidentLocation")
	private java.lang.Boolean dupIncidentLocation;

	@org.kie.api.definition.type.Label(value = "dupPolicyNumber")
	private java.lang.Boolean dupPolicyNumber;

	@org.kie.api.definition.type.Label(value = "dupVehicle")
	private java.lang.Boolean dupVehicle;

	@org.kie.api.definition.type.Label(value = "dupIncidentType")
	private java.lang.Boolean dupIncidentType;

	@org.kie.api.definition.type.Label(value = "duplicateStatus")
	private java.lang.Boolean duplicateStatus;

	@org.kie.api.definition.type.Label(value = "potentialDuplicate")
	private java.lang.Boolean potentialDuplicate;

	public dedupResponse() {
	}

	public com.myteam.rulesbase.dedupCaseParams getExistingCase() {
		return this.existingCase;
	}

	public void setExistingCase(
			com.myteam.rulesbase.dedupCaseParams existingCase) {
		this.existingCase = existingCase;
	}

	public com.myteam.rulesbase.dedupCaseParams getNewCase() {
		return this.newCase;
	}

	public void setNewCase(com.myteam.rulesbase.dedupCaseParams newCase) {
		this.newCase = newCase;
	}

	public java.lang.Boolean getDupIncidentTime() {
		return this.dupIncidentTime;
	}

	public void setDupIncidentTime(java.lang.Boolean dupIncidentTime) {
		this.dupIncidentTime = dupIncidentTime;
	}

	public java.lang.Boolean getDupIncidentLocation() {
		return this.dupIncidentLocation;
	}

	public void setDupIncidentLocation(java.lang.Boolean dupIncidentLocation) {
		this.dupIncidentLocation = dupIncidentLocation;
	}

	public java.lang.Boolean getDupPolicyNumber() {
		return this.dupPolicyNumber;
	}

	public void setDupPolicyNumber(java.lang.Boolean dupPolicyNumber) {
		this.dupPolicyNumber = dupPolicyNumber;
	}

	public java.lang.Boolean getDupVehicle() {
		return this.dupVehicle;
	}

	public void setDupVehicle(java.lang.Boolean dupVehicle) {
		this.dupVehicle = dupVehicle;
	}

	public java.lang.Boolean getDupIncidentType() {
		return this.dupIncidentType;
	}

	public void setDupIncidentType(java.lang.Boolean dupIncidentType) {
		this.dupIncidentType = dupIncidentType;
	}

	public java.lang.Boolean getDuplicateStatus() {
		return this.duplicateStatus;
	}

	public void setDuplicateStatus(java.lang.Boolean duplicateStatus) {
		this.duplicateStatus = duplicateStatus;
	}

	public java.lang.Boolean getPotentialDuplicate() {
		return this.potentialDuplicate;
	}

	public void setPotentialDuplicate(java.lang.Boolean potentialDuplicate) {
		this.potentialDuplicate = potentialDuplicate;
	}

	public dedupResponse(com.myteam.rulesbase.dedupCaseParams existingCase,
			com.myteam.rulesbase.dedupCaseParams newCase,
			java.lang.Boolean dupIncidentTime,
			java.lang.Boolean dupIncidentLocation,
			java.lang.Boolean dupPolicyNumber, java.lang.Boolean dupVehicle,
			java.lang.Boolean dupIncidentType,
			java.lang.Boolean duplicateStatus,
			java.lang.Boolean potentialDuplicate) {
		this.existingCase = existingCase;
		this.newCase = newCase;
		this.dupIncidentTime = dupIncidentTime;
		this.dupIncidentLocation = dupIncidentLocation;
		this.dupPolicyNumber = dupPolicyNumber;
		this.dupVehicle = dupVehicle;
		this.dupIncidentType = dupIncidentType;
		this.duplicateStatus = duplicateStatus;
		this.potentialDuplicate = potentialDuplicate;
	}

}