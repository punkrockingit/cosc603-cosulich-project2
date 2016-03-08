package edu.towson.cis.cosc603.project2.monopoly;


import java.util.Hashtable;
import java.util.ArrayList;

public class GameBoardProduct {
	private Hashtable<String, Integer> colorGroups = new Hashtable<String, Integer>();

	/**
	* Gets the property number for color.
	* @param name  the name
	* @return  the property number for color
	*/
	public int getPropertyNumberForColor(String name) {
		Integer number = (Integer) colorGroups.get(name);
		if (number != null) {
			return number.intValue();
		}
		return 0;
	}

	/**
	* Adds the cell.
	* @param cell  the cell
	*/
	public void addCell(PropertyCell cell, ArrayList<Cell> cells) {
		String colorGroup = cell.getColorGroup();
		int propertyNumber = getPropertyNumberForColor(colorGroup);
		colorGroups.put(colorGroup, new Integer(propertyNumber + 1));
		cells.add(cell);
	}

	/**
	* Gets the properties in monopoly.
	* @param color  the color
	* @return  the properties in monopoly
	*/
	public PropertyCell[] getPropertiesInMonopoly(String color, GameBoard gameBoard) {
		PropertyCell[] monopolyCells = new PropertyCell[getPropertyNumberForColor(color)];
		int counter = 0;
		for (int i = 0; i < gameBoard.getCellNumber(); i++) {
			IOwnable c = gameBoard.getCell(i);
			if (c instanceof PropertyCell) {
				PropertyCell pc = (PropertyCell) c;
				if (pc.getColorGroup().equals(color)) {
					monopolyCells[counter] = pc;
					counter++;
				}
			}
		}
		return monopolyCells;
	}
}