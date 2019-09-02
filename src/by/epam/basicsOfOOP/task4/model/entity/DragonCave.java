package by.epam.basicsOfOOP.task4.model.entity;

import java.util.ArrayList;

public class DragonCave {
	ArrayList<Treasure> treasureList = new ArrayList<Treasure>(100);

	public void addTreasure(Treasure treasure) {
		if (treasure != null) {
			treasureList.add(treasure);
		}
	}

	public void removeTreasure(Treasure treasure) {
		if (treasure != null) {
			treasureList.remove(treasure);
		}
	}

	public Treasure getTreasureByName(String name) {
		Treasure treasure = null;
		if (name != null) {
			for (int i = 0; i < treasureList.size(); i++) {
				if (treasureList.get(i).getName().equals(name)) {
					treasure = treasureList.get(i);
					break;
				}
			}
		}
		return treasure;
	}

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
