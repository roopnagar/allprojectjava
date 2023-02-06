package springexamplewithannotation.models;

public class Address {
	private Integer addressId;
	private String city;
	private String state;
	private String country;

	public Address() {
		super();
	}

	public Address(Integer addressId, String city, String state, String country) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}