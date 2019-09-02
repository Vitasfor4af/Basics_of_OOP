package by.epam.basicsOfOOP.task5var2.model.entity;

import java.util.ArrayList;

import by.epam.basicsOfOOP.task5var2.model.entity.Box;

public class Gift {
	ArrayList<Box> boxList = new ArrayList<Box>();

	public void addBox(Box box) {
		if (box != null) {
			boxList.add(box);
		}
	}

	public void removeBox(Box box) {
		if (box != null) {
			boxList.remove(box);
		}
	}

	public Box getBoxByType(String type) {
		Box box = null;
		if (type != null) {
			for (int i = 0; i < boxList.size(); i++) {
				if (boxList.get(i).getType().equals(type)) {
					box = boxList.get(i);
					break;
				}
			}
		}
		return box;
	}

	public ArrayList<Box> getBoxList() {
		return boxList;
	}

	public void setBoxList(ArrayList<Box> boxList) {
		this.boxList = boxList;
	}

	@Override
	public String toString() {
		return "Gift [boxList=" + boxList + "]";
	}
}
