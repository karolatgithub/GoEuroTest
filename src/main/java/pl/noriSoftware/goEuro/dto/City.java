package pl.noriSoftware.goEuro.dto;

public class City {
	private int __id = -1;
	private String name;
	private String type;
	private GeoPosition geoPosition;

	/**
	 * @param __id
	 *            the __id to set
	 */
	public void set__id(int __id) {
		this.__id = __id;
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
	 * @return the __id
	 */
	public int get__id() {
		return __id;
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
				+ __id
				+ " name="
				+ name
				+ " type="
				+ type
				+ " geoPos{"
				+ (String) ((geoPosition == null) ? "null" : geoPosition
						.toString()) + "}";
	}

	/**
	 * 
	 * @return to csv array of string
	 */
	public String[] toStrings() {
		return new String[] {
				String.valueOf(__id),
				name,
				type,
				(geoPosition == null) ? "" : String.valueOf(geoPosition
						.getLatitude()),
				(geoPosition == null) ? "" : String.valueOf(geoPosition
						.getLongitude()) };
	}
}
