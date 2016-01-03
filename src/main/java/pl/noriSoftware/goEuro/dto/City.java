package pl.noriSoftware.goEuro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {
	@JsonProperty("_id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("type")
	private String type;
	@JsonProperty("geo_position")
	private GeoPosition geoPosition;
	@JsonProperty("iata_airport_code")
	private String iataAirportCode;
	@JsonProperty("locationId")
	private Integer locationId = -1;

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param geoPosition
	 *            the geoPosition to set
	 */
	public void setGeoPosition(GeoPosition geoPosition) {
		this.geoPosition = geoPosition;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the geoPosition
	 */
	public GeoPosition getGeoPosition() {
		return geoPosition;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "id="
				+ id
				+ " name="
				+ name
				+ " type="
				+ type
				+ " geo_pos{"
				+ (String) ((geoPosition == null) ? "null" : geoPosition
						.toString()) + "}" + " iataAirportCode="
				+ iataAirportCode + " locationId=" + locationId;
	}

	/**
	 * 
	 * @return to csv array of string
	 */
	public String[] toStrings() {
		return new String[] {
				(id == null) ? null : String.valueOf(id),
				name,
				type,
				(geoPosition == null) ? null : String.valueOf(geoPosition
						.getLatitude()),
				(geoPosition == null) ? null : String.valueOf(geoPosition
						.getLongitude()) };
	}

	/**
	 * @return the iataAirportCode
	 */
	public String getIataAirportCode() {
		return iataAirportCode;
	}

	/**
	 * @param iataAirportCode
	 *            the iataAirportCode to set
	 */
	public void setIataAirportCode(String iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	/**
	 * @return the locationId
	 */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId
	 *            the locationId to set
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
}
