package com.fedpartner.model;

public class SpPartnerDetails {
	private String metadataB64;
	private String partnerName;
	private String nameIDFormat;
	private String ssoProfile;
	private String providerID;
	private String ssoURL;
	private String logoutRequestURL;
	private String logoutResponseURL;
	private boolean isEnabled;
	private boolean isDefault;
	private boolean adminManualCreation;
	private String displaySigningCertDN;
	private String displaySigningCertIssuerDN;
	private String displaySigningCertStart;
	private String displaySigningCertExpiration;
	private String displayEncryptionCertDN;
	private String displayEncryptionCertIssuerDN;
	private String displayEncryptionCertStart;
	private String displayEncryptionCertExpiration;

	public SpPartnerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpPartnerDetails(String metadataB64, String partnerName, String nameIDFormat, String ssoProfile,
			String providerID, String ssoURL, String logoutRequestURL, String logoutResponseURL, boolean isEnabled,
			boolean isDefault, boolean adminManualCreation, String displaySigningCertDN,
			String displaySigningCertIssuerDN, String displaySigningCertStart, String displaySigningCertExpiration,
			String displayEncryptionCertDN, String displayEncryptionCertIssuerDN, String displayEncryptionCertStart,
			String displayEncryptionCertExpiration) {
		super();
		this.metadataB64 = metadataB64;
		this.partnerName = partnerName;
		this.nameIDFormat = nameIDFormat;
		this.ssoProfile = ssoProfile;
		this.providerID = providerID;
		this.ssoURL = ssoURL;
		this.logoutRequestURL = logoutRequestURL;
		this.logoutResponseURL = logoutResponseURL;
		this.isEnabled = isEnabled;
		this.isDefault = isDefault;
		this.adminManualCreation = adminManualCreation;
		this.displaySigningCertDN = displaySigningCertDN;
		this.displaySigningCertIssuerDN = displaySigningCertIssuerDN;
		this.displaySigningCertStart = displaySigningCertStart;
		this.displaySigningCertExpiration = displaySigningCertExpiration;
		this.displayEncryptionCertDN = displayEncryptionCertDN;
		this.displayEncryptionCertIssuerDN = displayEncryptionCertIssuerDN;
		this.displayEncryptionCertStart = displayEncryptionCertStart;
		this.displayEncryptionCertExpiration = displayEncryptionCertExpiration;
	}

	public String getMetadataB64() {
		return metadataB64;
	}

	public void setMetadataB64(String metadataB64) {
		this.metadataB64 = metadataB64;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getNameIDFormat() {
		return nameIDFormat;
	}

	public void setNameIDFormat(String nameIDFormat) {
		this.nameIDFormat = nameIDFormat;
	}

	public String getSsoProfile() {
		return ssoProfile;
	}

	public void setSsoProfile(String ssoProfile) {
		this.ssoProfile = ssoProfile;
	}

	public String getProviderID() {
		return providerID;
	}

	public void setProviderID(String providerID) {
		this.providerID = providerID;
	}

	public String getSsoURL() {
		return ssoURL;
	}

	public void setSsoURL(String ssoURL) {
		this.ssoURL = ssoURL;
	}

	public String getLogoutRequestURL() {
		return logoutRequestURL;
	}

	public void setLogoutRequestURL(String logoutRequestURL) {
		this.logoutRequestURL = logoutRequestURL;
	}

	public String getLogoutResponseURL() {
		return logoutResponseURL;
	}

	public void setLogoutResponseURL(String logoutResponseURL) {
		this.logoutResponseURL = logoutResponseURL;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public boolean isAdminManualCreation() {
		return adminManualCreation;
	}

	public void setAdminManualCreation(boolean adminManualCreation) {
		this.adminManualCreation = adminManualCreation;
	}

	public String getDisplaySigningCertDN() {
		return displaySigningCertDN;
	}

	public void setDisplaySigningCertDN(String displaySigningCertDN) {
		this.displaySigningCertDN = displaySigningCertDN;
	}

	public String getDisplaySigningCertIssuerDN() {
		return displaySigningCertIssuerDN;
	}

	public void setDisplaySigningCertIssuerDN(String displaySigningCertIssuerDN) {
		this.displaySigningCertIssuerDN = displaySigningCertIssuerDN;
	}

	public String getDisplaySigningCertStart() {
		return displaySigningCertStart;
	}

	public void setDisplaySigningCertStart(String displaySigningCertStart) {
		this.displaySigningCertStart = displaySigningCertStart;
	}

	public String getDisplaySigningCertExpiration() {
		return displaySigningCertExpiration;
	}

	public void setDisplaySigningCertExpiration(String displaySigningCertExpiration) {
		this.displaySigningCertExpiration = displaySigningCertExpiration;
	}

	public String getDisplayEncryptionCertDN() {
		return displayEncryptionCertDN;
	}

	public void setDisplayEncryptionCertDN(String displayEncryptionCertDN) {
		this.displayEncryptionCertDN = displayEncryptionCertDN;
	}

	public String getDisplayEncryptionCertIssuerDN() {
		return displayEncryptionCertIssuerDN;
	}

	public void setDisplayEncryptionCertIssuerDN(String displayEncryptionCertIssuerDN) {
		this.displayEncryptionCertIssuerDN = displayEncryptionCertIssuerDN;
	}

	public String getDisplayEncryptionCertStart() {
		return displayEncryptionCertStart;
	}

	public void setDisplayEncryptionCertStart(String displayEncryptionCertStart) {
		this.displayEncryptionCertStart = displayEncryptionCertStart;
	}

	public String getDisplayEncryptionCertExpiration() {
		return displayEncryptionCertExpiration;
	}

	public void setDisplayEncryptionCertExpiration(String displayEncryptionCertExpiration) {
		this.displayEncryptionCertExpiration = displayEncryptionCertExpiration;
	}

	@Override
	public String toString() {
		return "SpPartnerDetails [metadataB64=" + metadataB64 + ", partnerName=" + partnerName + ", nameIDFormat="
				+ nameIDFormat + ", ssoProfile=" + ssoProfile + ", providerID=" + providerID + ", ssoURL=" + ssoURL
				+ ", logoutRequestURL=" + logoutRequestURL + ", logoutResponseURL=" + logoutResponseURL + ", isEnabled="
				+ isEnabled + ", isDefault=" + isDefault + ", adminManualCreation=" + adminManualCreation
				+ ", displaySigningCertDN=" + displaySigningCertDN + ", displaySigningCertIssuerDN="
				+ displaySigningCertIssuerDN + ", displaySigningCertStart=" + displaySigningCertStart
				+ ", displaySigningCertExpiration=" + displaySigningCertExpiration + ", displayEncryptionCertDN="
				+ displayEncryptionCertDN + ", displayEncryptionCertIssuerDN=" + displayEncryptionCertIssuerDN
				+ ", displayEncryptionCertStart=" + displayEncryptionCertStart + ", displayEncryptionCertExpiration="
				+ displayEncryptionCertExpiration + "]";
	}

}