package by.epam.basicsOfOOP.task5.model.entity;

import java.util.ArrayList;

public class FlowerComposition {
	ArrayList<Box> boxList = new ArrayList<Box>();

	public ArrayList<Box> getBoxList() {
		return boxList;
	}

	public void setBoxList(ArrayList<Box> boxList) {
		this.boxList = boxList;
	}

	@Override
	public String toString() {
		return "FlowerComposition [boxList=" + boxList + "]";
	}
}
