/**
 * 
 */
package controller.impl;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import controller.Controller;

import tower.Tower;

/**
 * @author Fry
 *
 */
public class Main extends JApplet implements Controller {

	/**
	 * 
	 */
	private static final long serialVersionUID = -995199956205934258L;
	
	private Set<Tower> towers = null;
	private JPanel panel = null;
	private GridBagConstraints gbc = null;
	private JButton startButton = null;

	public void register(Tower tower) {
		
		getTowers().add(tower);
		if (getTowers().size() == 3) {
			getStartButton().setEnabled(true);
		} else {
			getStartButton().setEnabled(false);
		}
		
	}
	
	public void unregister(Tower tower) {
		
		getTowers().remove(tower);
		if (getTowers().size() == 3) {
			getStartButton().setEnabled(true);
		} else {
			getStartButton().setEnabled(false);
		}
		
	}

	/**
	 * @param towers the towers to set
	 */
	public void setTowers(Set<Tower> towers) {
		this.towers = towers;
	}

	/**
	 * @return the towers
	 */
	public Set<Tower> getTowers() {
		return towers;
	}

	/**
	 * @return the panel
	 */
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

	protected JButton getStartButton() {
		
		if (startButton == null) {
			startButton = new JButton("Start!");
			startButton.setEnabled(false);
			startButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					initializeTowers();
				}
			});
		}
		return startButton;
		
	}

	
	
	private void initializeTowers() {
		
		if(getTowers().size() == 3) {
		
			double minX = Double.MAX_VALUE;
			double maxX = 0.0;
			Tower sourceTower = null;
			Tower targetTower = null;
		
			for(Iterator<Tower> i = towers.iterator(); i.hasNext(); i.next()) {
				Tower tmpTower = i.next();
				double tmpX = tmpTower.getPosition().getX();
				if(minX > tmpX) {
					minX = tmpX;
					sourceTower = tmpTower;
				}
				if(maxX < tmpX) {
					maxX = tmpX;
					targetTower = tmpTower;
				}
			}
		
			if (!sourceTower.equals(targetTower)) {
				sourceTower.setSourceTower();
				sourceTower.fillWithSlices();
				targetTower.setTargetTower();
			}
		}
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

		JButton startButton = getStartButton();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		panel.add(startButton);
		
		getContentPane().add(panel);
		
	}

	
}
