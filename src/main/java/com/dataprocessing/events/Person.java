package com.dataprocessing.events;

public class Person implements Comparable<Person> {

	private int id;

	private String item;

	private String name;

	private int value1;

	private float value2;

	private float value3;

	private float value4;

	private String country;

	private String department;

	private float value5;

	public Person(int id, String item, String name, int value1, float value2, float value3, float value4,
			String country, String department, float value5) {
		super();
		this.id = id;
		this.item = item;
		this.name = name;
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		this.value4 = value4;
		this.country = country;
		this.department = department;
		this.value5 = value5;
	}

	public int getId() {
		return id;
	}

	public String getItem() {
		return item;
	}

	public String getName() {
		return name;
	}

	public int getValue1() {
		return value1;
	}

	public float getValue2() {
		return value2;
	}

	public float getValue3() {
		return value3;
	}

	public float getValue4() {
		return value4;
	}

	public String getCountry() {
		return country.replaceAll(" ", "");
	}

	public String getDepartment() {
		return department;
	}

	public float getValue5() {
		return value5;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", item=" + item + ", name=" + name + ", value1=" + value1 + ", value2=" + value2
				+ ", value3=" + value3 + ", value4=" + value4 + ", country=" + country + ", department=" + department
				+ ", value5=" + value5 + "]";
	}

	@Override
	public int compareTo(Person person) {
		return this.country.compareTo(person.getCountry());
	}

}
