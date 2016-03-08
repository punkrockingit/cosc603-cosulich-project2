package edu.towson.cis.cosc603.project2.monopoly;

import java.util.ArrayList;
import java.util.Hashtable;

// TODO: Auto-generated Javadoc
/**
 * The Class GameBoard.
 */
public class GameBoard {

	private GameBoardProduct2 gameBoardProduct2 = new GameBoardProduct2();

	private GameBoardProduct gameBoardProduct = new GameBoardProduct();

	/** The cells. */
	private ArrayList<Cell> cells = new ArrayList<Cell>();
    
    /** The chance cards. */
    private ArrayList<Card> chanceCards = new ArrayList<Card>();
	/**
	 * Instantiates a new game board.
	 */
	public GameBoard() {
		Cell go = new GoCell();
		addCell(go);
	}

    /**
     * Adds the card.
     *
     * @param card the card
     */
    public void addCard(Card card) {
        chanceCards(card);
		if(card.getCardType() == Card.TYPE_CC) {
            gameBoardProduct2.getCommunityChestCards().add(card);
        } else {
        }
    }

	private void chanceCards(Card card) {
		if (card.getCardType() == Card.TYPE_CC) {
		} else {
			chanceCards.add(card);
		}
	}
	
	/**
	 * Adds the cell.
	 *
	 * @param cell the cell
	 */
	public void addCell(Cell cell) {
		cells.add(cell);
	}
	
	/**
	 * Adds the cell.
	 *
	 * @param cell the cell
	 */
	public void addCell(PropertyCell cell) {
		gameBoardProduct.addCell(cell, cells);
	}

    /**
     * Draw cc card.
     *
     * @return the card
     */
    public Card drawCCCard() {
        return gameBoardProduct2.drawCCCard(this);
    }

    /**
     * Draw chance card.
     *
     * @return the card
     */
    public Card drawChanceCard() {
        Card card = (Card)chanceCards.get(0);
        chanceCards.remove(0);
        addCard(card);
        return card;
    }

	/**
	 * Gets the cell.
	 *
	 * @param newIndex the new index
	 * @return the cell
	 */
	public Cell getCell(int newIndex) {
		return (Cell)cells.get(newIndex);
	}
	
	/**
	 * Gets the cell number.
	 *
	 * @return the cell number
	 */
	public int getCellNumber() {
		return cells.size();
	}
	
	/**
	 * Gets the properties in monopoly.
	 *
	 * @param color the color
	 * @return the properties in monopoly
	 */
	public PropertyCell[] getPropertiesInMonopoly(String color) {
		return gameBoardProduct.getPropertiesInMonopoly(color, this);
	}
	
	/**
	 * Gets the property number for color.
	 *
	 * @param name the name
	 * @return the property number for color
	 */
	public int getPropertyNumberForColor(String name) {
		return gameBoardProduct.getPropertyNumberForColor(name);
	}

	/**
	 * Query cell.
	 *
	 * @param string the string
	 * @return the cell
	 */
	public Cell queryCell(String string) {
		for(int i = 0; i < cells.size(); i++){
			Cell temp = (Cell)cells.get(i); 
			if(temp.getName().equals(string)) {
				return temp;
			}
		}
		return null;
	}
	
	/**
	 * Query cell index.
	 *
	 * @param string the string
	 * @return the int
	 */
	public int queryCellIndex(String string){
		for(int i = 0; i < cells.size(); i++){
			IOwnable temp = (IOwnable)cells.get(i); 
			if(temp.getName().equals(string)) {
				return i;
			}
		}
		return -1;
	}

    /**
     * Removes the cards.
     */
    public void removeCards() {
        gameBoardProduct2.removeCards();
    }
}
