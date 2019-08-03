package by.epam.basicsOfOOP.task5var2.model.entity;

import java.util.ArrayList;

public class Box {
	private String type;
	ArrayList<Sweet> sweetList = new ArrayList<Sweet>();

	public Box(String type) {
		this.type = type;
	}

	public void addSweet(Sweet sweet) {
		if (sweet != null) {
			sweetList.add(sweet);
		}
	}

	public void removeSweet(Sweet sweet) {
		if (sweet != null) {
			sweetList.remove(sweet);
		}
	}

	public Sweet getSweetByName(String name) {
		Sweet sweet = null;
		if (name != null) {
			for (int i = 0; i < sweetList.size(); i++) {
				if (sweetList.get(i).getName().equals(name)) {
					sweet = sweetList.get(i);
					break;
				}
			}
		}
		return sweet;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Sweet> getSweetList() {
		return sweetList;
	}

	public void setSweetList(ArrayList<Sweet> sweetList) {
		this.sweetList = sweetList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sweetList == null) ? 0 : sweetList.hashCode());
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
		if (sweetList == null) {
			if (other.sweetList != null)
				return false;
		} else if (!sweetList.equals(other.sweetList))
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
