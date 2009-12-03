/**
 * 
 */
package tower.impl;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import slice.Slice;
import tower.Tower;

/**
 * @author Fry
 *
 */
public class Main extends JApplet implements Tower {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2137998837477473175L;
	
	private JPanel panel = null;
	private GridBagConstraints gbc = null;

	@Override
	public void fillWithSlices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSourceTower() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTargetTower() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Slice popSlice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pushSlice(Slice slice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSourceTower() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTargetTower() {
		// TODO Auto-generated method stub
		
	}
	
	protected JPanel getPanel() {
		
		if (panel == null) {
			panel = new JPanel(new GridBagLayout());
		}
		return panel;
		
	}

	protected GridBagConstraints getGridBagConstraints() {

		if (gbc == null) {
			gbc = new GridBagConstraints();
		}
		return gbc;
		
	}
	public void init() {
		
		System.err.println("init");
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				createAndShowGUI();
			}
	
		});
		
	}
	
	public void start() {
		
		System.err.println("start");
    	repaint();
    	setVisible(true);
		
	}

	public void stop() {
		
	}

	public void destroy() {
		
	}

	private void createAndShowGUI() {

		System.err.println("creating gui");
		GridBagConstraints gbc = getGridBagConstraints();
		
		JPanel panel = getPanel();
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.ipadx = 0;
		gbc.ipady = 0;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		getContentPane().add(panel);
		
	}


}
