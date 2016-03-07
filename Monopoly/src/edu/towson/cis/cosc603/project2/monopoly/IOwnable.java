package edu.towson.cis.cosc603.project2.monopoly;

public interface IOwnable {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Gets the owner.
	 *
	 * @return the owner
	 */
	Player getOwner();

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	int getPrice();

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	boolean isAvailable();

	/**
	 * Play action.
	 * @param msg TODO
	 * @return TODO
	 */
	Boolean playAction(String msg);

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	void setAvailable(boolean available);

	/**
	 * Sets the owner.
	 *
	 * @param owner the new owner
	 */
	void setOwner(Player owner);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	String toString();

}