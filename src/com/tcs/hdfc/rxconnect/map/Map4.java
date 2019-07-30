package com.tcs.hdfc.rxconnect.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import java.util.Objects;

/**
 * city: Station
 * 
 * Hahsing: List: remove last element .equals : O(n) Linear put: 1) key :
 * hashcode 4667657567 2) key : hash value : hascode >>> 16 : 75765765 3) key :
 * find index for array : entry set : 3 , 8 4) array[index] = ? 4.1) No value at
 * array[index] : array[index] = value 4.2) array[index] is not empty : hash
 * collision : oldKey == key ? yes replace 4.3) linked list [key1,val1],
 * [key2,val2]
 * 
 * 
 * rule 1: hashcode 1: 232343 index : 4 : station 2 hashcode 1: 23234345353
 * index : 9 station x removing station x and station 2 are internally same
 * (equals are same then there hashcode should also be same) : index 4
 */
class Station implements Comparable<Station> {
	private int id;
	private String stationName;
	private String pincode;

	public Station(int id, String stationName, String pincode) {
		this.id = id;
		this.stationName = stationName;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Station [id=" + id + ", stationName=" + stationName + ", pincode=" + pincode + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Station st = (Station) obj;
		boolean isSame = false;
		if (this.id == st.id && this.pincode.equals(st.pincode) && this.stationName.equals(stationName)) {
			isSame = true;
		}
		return isSame;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, stationName, pincode);
	}

	@Override
	public int compareTo(Station o) {

		return o.getId() - this.getId();
	}

}

public class Map4 {
	public static void main(String[] args) {

		// learning_cityWasKey_stationWasValue();

		// learning_stationWasKey();
		// make key : station value : city
		Map<Station, String> stationCityMap = new TreeMap<Station, String>();

		Station station1 = new Station(1, "NZM", "2323432");
		Station station2 = new Station(45, "JPR", "87878");
		Station station3 = new Station(23, "CHN", "45456");
		Station station4 = new Station(90, "MUM", "6778787");
		Station station5 = new Station(12, "PUB", "4346557");

		stationCityMap.put(station1, "Delhi");
		stationCityMap.put(station2, "Jaipur");
		stationCityMap.put(station3, "Chennai");
		stationCityMap.put(station4, "Mumbai");
		stationCityMap.put(station5, "Punjab");

		for (Map.Entry<Station, String> entry : stationCityMap.entrySet()) {
			System.out.println("City is " + entry.getKey());
			System.out.println("Value is " + entry.getValue());

		}

	}

	private static void learning_stationWasKey() {

		// make key : station value : city
		Map<Station, String> stationCityMap = new HashMap<Station, String>(10);

		Station station1 = new Station(1, "NZM", "2323432");
		Station station2 = new Station(45, "JPR", "87878");
		Station station3 = new Station(23, "CHN", "45456");
		Station station4 = new Station(90, "MUM", "6778787");
		Station station5 = new Station(12, "PUB", "4346557");

		stationCityMap.put(station1, "Delhi");
		stationCityMap.put(station2, "Jaipur");
		stationCityMap.put(station3, "Chennai");
		stationCityMap.put(station4, "Mumbai");
		stationCityMap.put(station5, "Punjab");

		stationCityMap.forEach((st, city) -> {
			System.out.println("Station is " + st);
			System.out.println("City is " + city);
		});

		Station stationx = new Station(45, "JPR", "87878");
		// remove based on key
		System.out.println("Hashcode of station 2 is " + station2.hashCode());
		System.out.println("Hashcode of station x is " + stationx.hashCode());

		stationCityMap.remove(stationx);
		System.out.println("After removal");
		for (Map.Entry<Station, String> map : stationCityMap.entrySet()) {
			System.out.println("Station is " + map.getKey());
			System.out.println("City is " + map.getValue());
		}
	}

	private static void learning_cityWasKey_stationWasValue() {

		Map<String, Station> cityStationMap = new HashMap<String, Station>(5);

		Station station1 = new Station(1, "NZM", "2323432");
		Station station2 = new Station(45, "JPR", "87878");
		Station station3 = new Station(23, "CHN", "45456");
		Station station4 = new Station(90, "MUM", "6778787");
		Station station5 = new Station(12, "PUB", "4346557");

		cityStationMap.put("Delhi", station1);
		cityStationMap.put("Jaipur", station2);
		cityStationMap.put("Chennai", station3);
		cityStationMap.put("Mumbai", station4);
		cityStationMap.put("Punjab", station5);

		System.out.println("Java 7 for each loop");
		for (Map.Entry<String, Station> city : cityStationMap.entrySet()) {
			System.out.println("City is " + city.getKey());
			System.out.println("Station is " + city.getValue());

		}

		System.out.println("Java 8 for each loop");
		cityStationMap.forEach((c, s) -> {
			System.out.println("City is " + c);
			System.out.println("Station is " + s.getStationName());

		});

	}

}
