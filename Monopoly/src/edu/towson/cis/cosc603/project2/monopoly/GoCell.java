package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class GoCell.
 */
public class GoCell extends Cell {
	
	/** The available. */
	private boolean available = true;

	/**
	 * Instantiates a new go cell.
	 */
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
	 */
	public void playAction() {
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#setName(java.lang.String)
	 */
	void setName(String name) {
	}
}
