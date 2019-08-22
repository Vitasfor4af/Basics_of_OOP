package by.epam.basicsOfOOP.task4.model.entity;

import java.util.ArrayList;

public class DragonCave {
	ArrayList<Treasure> treasureList = new ArrayList<Treasure>(100);

	public ArrayList<Treasure> getTreasureList() {
		return treasureList;
	}

	public void setTreasureList(ArrayList<Treasure> treasureList) {
		this.treasureList = treasureList;
	}

	@Override
	public String toString() {
		return "Cave [treasureList=" + treasureList + "]";
	}
}
