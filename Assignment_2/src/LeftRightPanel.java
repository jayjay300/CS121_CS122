import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class LeftRightPanel extends JPanel
{
	private JButton left;
	private JButton right;
	private JButton spooky;
	private JLabel label;
	private JLabel bottom;
	private JPanel buttonPanel;
	
/*	 public void playSound(String soundName)
     {
       try 
       {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
       }
       catch(Exception ex)
       {
         System.out.println("Error with playing sound.");
         ex.printStackTrace( );
       } */
	
	public LeftRightPanel()
	{
		left = new JButton("Left");
		left.setMnemonic('A');	
		right = new JButton("Right");
		right.setMnemonic('D');
		spooky = new JButton("Spooky");
		ButtonListener listener = new ButtonListener();
		left.addActionListener(listener);
		left.setPreferredSize(new Dimension(150,150));
		spooky.addActionListener(listener);
		spooky.setPreferredSize(new Dimension(100,100));
		right.addActionListener(listener); 
		right.setPreferredSize(new Dimension(150,150));
		label = new JLabel("Left Right");
		bottom = new JLabel("Welcome to the Jungle");
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(500,250));
		buttonPanel.setBackground(Color.green);
		buttonPanel.add(left);
		buttonPanel.add(spooky);
		buttonPanel.add(right);
		left.setToolTipText("Click this button to go left.");
		right.setToolTipText("Click this button to go right"); 
		setPreferredSize(new Dimension(800, 400));
		setBackground(Color.pink);
		add(label);
		add(buttonPanel);
		add(bottom);
	}
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == left){
				label.setText("Left");
				//playSound("C:\Users\John\workspace\Assignment_2");
				left.setEnabled(false);
				right.setEnabled(true);
			}
			else if (event.getSource() == right){
				label.setText("Right");
				//playSound("C:\Users\John\workspace\Assignment_2\AIRHORN.wav");
				left.setEnabled(true);
				right.setEnabled(false);
			}
		}
	}
}
