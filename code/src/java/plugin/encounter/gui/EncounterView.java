/*
 * EncounterView.java
 *
 * Created on June 27, 2003, 2:26 PM
 */
package plugin.encounter.gui;

import javax.swing.*;
import pcgen.gui2.tools.Icons;

/**
 *
 * @author  Soulcatcher
 */
public class EncounterView extends javax.swing.JPanel
{
	private javax.swing.JButton addCreature;
	private javax.swing.JButton generateEncounter;
	private javax.swing.JButton removeCreature;
	private javax.swing.JButton transferToTracker;
	private javax.swing.JComboBox environment;
	private javax.swing.JLabel encounterLevel;
	private javax.swing.JLabel jLabel3;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel numberLabel;
	private javax.swing.JLabel targetLabel;
	private javax.swing.JList encounterCreatures;
	private javax.swing.JList libraryCreatures;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextField numberOfCreatures;
	private javax.swing.JTextField targetEncounterLevel;

	/** Creates new form EnvounterView */
	public EncounterView()
	{
		initComponents();
	}

	/**
	 * Get add creature
	 * @return addCreature
	 */
	public JButton getAddCreature()
	{
		return addCreature;
	}

	/**
	 * getEncounterCreatures
	 * @return encounterCreatures
	 */
	public JList getEncounterCreatures()
	{
		return encounterCreatures;
	}

	/**
	 * Set encounter Model
	 * @param model
	 */
	public void setEncounterModel(javax.swing.DefaultListModel model)
	{
		encounterCreatures.setModel(model);
	}

	/**
	 * Get environment
	 * @return environment
	 */
	public JComboBox getEnvironment()
	{
		return environment;
	}

	/**
	 * Get generate encounter
	 * @return generate encounter
	 */
	public JButton getGenerateEncounter()
	{
		return generateEncounter;
	}

	/**
	 * Get library creatures
	 * @return library creatures
	 */
	public JList getLibraryCreatures()
	{
		return libraryCreatures;
	}

	/**
	 * Set library model
	 * @param model
	 */
	public void setLibraryModel(javax.swing.AbstractListModel model)
	{
		libraryCreatures.setModel(model);
	}

	/**
	 * Get number label
	 * @return number label
	 */
	public JLabel getNumberLabel()
	{
		return numberLabel;
	}

	/**
	 * Get number of creatures
	 * @return number of creatures
	 */
	public JTextField getNumberOfCreatures()
	{
		return numberOfCreatures;
	}

	/**
	 * Get number of creatures text
	 * @return number of creatures text
	 */
	public String getNumberOfCreaturesText()
	{
		return numberOfCreatures.getText();
	}

	/**
	 * Get remove creature
	 * @return remove creature
	 */
	public JButton getRemoveCreature()
	{
		return removeCreature;
	}

	/**
	 * Get target EL
	 * @return target EL
	 */
	public String getTargetEL()
	{
		return targetEncounterLevel.getText();
	}

	/**
	 * Get target encounter level
	 * @return target encounter level
	 */
	public JTextField getTargetEncounterLevel()
	{
		return targetEncounterLevel;
	}

	/**
	 * Get target label
	 * @return target label
	 */
	public JLabel getTargetLabel()
	{
		return targetLabel;
	}

	/**
	 * Sets the totalEncounterLevel.
	 * @param totalEncounterLevel The totalEncounterLevel to set
	 */
	public void setTotalEncounterLevel(String totalEncounterLevel)
	{
		this.encounterLevel.setText(totalEncounterLevel);
	}

	/**
	 * Get transfer to tracker
	 * @return transfer to tracker
	 */
	public JButton getTransferToTracker()
	{
		return transferToTracker;
	}

	private void generateEncounterActionPerformed(java.awt.event.ActionEvent evt)
	{
		//GEN-FIRST:event_generateEncounterActionPerformed

		// Add your handling code here:
	}

	//GEN-LAST:event_generateEncounterActionPerformed

	/** This method is called from within the constructor to
	 * initialize the form.
	 */
	private void initComponents()
	{
		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		targetLabel = new javax.swing.JLabel();
		targetEncounterLevel = new javax.swing.JTextField();
		numberLabel = new javax.swing.JLabel();
		numberOfCreatures = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		environment = new javax.swing.JComboBox();
		generateEncounter = new javax.swing.JButton();
		transferToTracker = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		libraryCreatures = new javax.swing.JList();
		jPanel6 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		addCreature = new javax.swing.JButton();
		removeCreature = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		encounterCreatures = new javax.swing.JList();
		jPanel5 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		encounterLevel = new javax.swing.JLabel();

		setLayout(new java.awt.BorderLayout());

		jPanel1.setLayout(new java.awt.GridBagLayout());

		targetLabel.setText("Target EL");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		jPanel1.add(targetLabel, gridBagConstraints);

		targetEncounterLevel.setText("1");
		targetEncounterLevel
			.addActionListener(new java.awt.event.ActionListener()
			{
            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt)
				{
					targetEncounterLevelActionPerformed(evt);
				}
			});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
		jPanel1.add(targetEncounterLevel, gridBagConstraints);

		numberLabel.setText("Number of Creatures");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		jPanel1.add(numberLabel, gridBagConstraints);

		numberOfCreatures.setText("1");
		numberOfCreatures.addActionListener(new java.awt.event.ActionListener()
		{
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				numberOfCreaturesActionPerformed(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
		jPanel1.add(numberOfCreatures, gridBagConstraints);

		jLabel3.setText("Environment");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		jPanel1.add(jLabel3, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
		jPanel1.add(environment, gridBagConstraints);

		generateEncounter.setText("New Encounter");
		generateEncounter.addActionListener(new java.awt.event.ActionListener()
		{
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				generateEncounterActionPerformed(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
		jPanel1.add(generateEncounter, gridBagConstraints);

		transferToTracker.setText("Begin Combat");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 7;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		jPanel1.add(transferToTracker, gridBagConstraints);

		add(jPanel1, java.awt.BorderLayout.EAST);

		jPanel4.setLayout(new java.awt.BorderLayout());

		jPanel2.setLayout(new java.awt.GridLayout(1, 0));

		jScrollPane1.setViewportView(libraryCreatures);

		jPanel2.add(jScrollPane1);

		jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6,
			javax.swing.BoxLayout.X_AXIS));

		jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3,
			javax.swing.BoxLayout.Y_AXIS));

		addCreature.setIcon(Icons.Forward16.getImageIcon());
		addCreature.setMaximumSize(new java.awt.Dimension(50, 50));
		addCreature.setMinimumSize(new java.awt.Dimension(50, 50));
		jPanel3.add(addCreature);

		removeCreature.setIcon(Icons.Back16.getImageIcon());
		removeCreature.setMaximumSize(new java.awt.Dimension(50, 50));
		removeCreature.setMinimumSize(new java.awt.Dimension(50, 50));
		jPanel3.add(removeCreature);

		jPanel6.add(jPanel3);

		jScrollPane2.setViewportView(encounterCreatures);

		jPanel6.add(jScrollPane2);

		jPanel2.add(jPanel6);

		jPanel4.add(jPanel2, java.awt.BorderLayout.CENTER);

		jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

		jLabel4.setText("Total Encounter Level: ");
		jPanel5.add(jLabel4);

		encounterLevel.setText("0");
		jPanel5.add(encounterLevel);

		jPanel4.add(jPanel5, java.awt.BorderLayout.SOUTH);

		add(jPanel4, java.awt.BorderLayout.CENTER);
	}

	private void numberOfCreaturesActionPerformed(java.awt.event.ActionEvent evt)
	{
		//GEN-FIRST:event_numberOfCreaturesActionPerformed

		// Add your handling code here:
	}

	//GEN-LAST:event_numberOfCreaturesActionPerformed

	private void targetEncounterLevelActionPerformed(
		java.awt.event.ActionEvent evt)
	{
		//GEN-FIRST:event_targetEncounterLevelActionPerformed

		// Add your handling code here:
	}
	//GEN-LAST:event_targetEncounterLevelActionPerformed
}
