/**
 * 
 */
package slice;

import java.awt.Color;

import tower.Tower;

/**
 * @author Fry
 *
 */
public interface Slice {
	
	public int getWidth();
	public Color getColor();
	public boolean isAttachedToTower(Tower tower);
	public boolean isDragged();
	public boolean canPop();

}
