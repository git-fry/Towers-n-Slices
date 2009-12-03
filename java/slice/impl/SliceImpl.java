/**
 * 
 */
package slice.impl;

import java.awt.Color;

import javax.swing.JPanel;

import slice.Slice;
import tower.Tower;

/**
 * @author Fry
 *
 */
public class SliceImpl extends JPanel implements Slice {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4691533046646204059L;

	/* (non-Javadoc)
	 * @see slice.Slice#canPop()
	 */
	@Override
	public boolean canPop() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see slice.Slice#getColor()
	 */
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see slice.Slice#isAttachedToTower(tower.Tower)
	 */
	@Override
	public boolean isAttachedToTower(Tower tower) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see slice.Slice#isDragged()
	 */
	@Override
	public boolean isDragged() {
		// TODO Auto-generated method stub
		return false;
	}

}
