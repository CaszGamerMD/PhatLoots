package de.articdive.phatloots.events;

import de.articdive.phatloots.PhatLootChest;

/**
 * The basis of a PhatLootChest Event
 *
 * @author Codisimus
 */
public abstract class PhatLootChestEvent extends PhatLootsEvent {
	protected PhatLootChest chest;

	/**
	 * Returns the chest that broke
	 *
	 * @return The PhatLootChest that has been broken
	 */
	public PhatLootChest getChest() {
		return chest;
	}
}
