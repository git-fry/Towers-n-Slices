/**
 * 
 */
package tower;

import java.awt.Point;

import slice.Slice;

/**
 * @author Fry
 *
 */
public interface Tower {
	
	public boolean isEmpty();
	public boolean isFull();
	public void pushSlice(Slice slice);
	public Slice popSlice();
	public void fillWithSlices();
	public boolean isSourceTower();
	public void setSourceTower();
	public boolean isTargetTower();
	public void setTargetTower();
	public Point getPosition();

}
