package entity1;

public class ContactDetails {
	private String localityName1;
	private String cityName1;
	private String stateName1;
	private String countryName1;
	private long phoneNumber1;
	private long pincode1;
	private String emailId1;
private String houseNumber1;
public ContactDetails(String city, String state, String country, long mobileno,long pincode,String mailid) {
	// TODO Auto-generated constructor stub
	this.cityName1=city;
	this.stateName1=state;
	this.countryName1=country;
	this.phoneNumber1=mobileno;
	this.pincode1=pincode;
	this.emailId1=mailid;

}
public String getHouseNumber1() {
	return houseNumber1;
}
public void setHouseNumber1(String houseNumber1) {
	this.houseNumber1 = houseNumber1;
}
public String getLocalityName1() {
	return localityName1;
}
public void setLocalityName(String localityName1) {
	this.localityName1 = localityName1;
}
public String getCityName1() {
	return cityName1;
}
public void setCityName1(String cityName1) {
	this.cityName1 = cityName1;
}
public String getStateName1() {
	return stateName1;
}
public void setStateName1(String stateName1) {
	this.stateName1 = stateName1;
}
public String getCountryName1() {
	return countryName1;
}
public void setCountryName1(String countryName1) {
	this.countryName1 = countryName1;
}
public long getPhoneNumber1() {
	return phoneNumber1;
}
public void setPhoneNumber1(long phoneNumber1) {
	this.phoneNumber1 = phoneNumber1;
}
public long getPincode1() {
	return pincode1;
}
public void setPincode1(long pincode1) {
	this.pincode1 = pincode1;
}
public String getEmailId1() {
	return emailId1;
}
public void setEmailId1(String emailId1) {
	this.emailId1 = emailId1;
}
	@Override
	public String toString() {
		return "ContactDetails[localityName1 ="+localityName1+",CityName1 ="+cityName1+",stateName1="+stateName1+",countryName1="+countryName1+",phoneNumber1="+phoneNumber1+", pincode1="+ pincode1+",emailId1="+emailId1+",houseNumber1="+houseNumber1+"]";
	
}
	
	}
