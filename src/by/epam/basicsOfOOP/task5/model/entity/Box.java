package by.epam.basicsOfOOP.task5.model.entity;

import java.util.ArrayList;

public class Box {
	private String type;
	ArrayList<Flower> flowerList = new ArrayList<Flower>();

	public Box() {
		this.type = "Undefined";
	}

	public Box(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Flower> getFlowerList() {
		return flowerList;
	}

	public void setFlowerList(ArrayList<Flower> flowerList) {
		this.flowerList = flowerList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowerList == null) ? 0 : flowerList.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (flowerList == null) {
			if (other.flowerList != null)
				return false;
		} else if (!flowerList.equals(other.flowerList))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Box [type=" + type + "]";
	}
}
