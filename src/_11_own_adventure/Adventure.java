package _11_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
public static void main(String[] args) {
	String Name=JOptionPane.showInputDialog("What is your name?");
	//int o=0;
	int o=0;
	while(o==0) {
		int Q1 = JOptionPane.showOptionDialog(null, "Are you ready to dream?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Yes", "No" }, null);
		
if (Q1==0) {
	int Q2 = JOptionPane.showOptionDialog(null, "What do you want to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Fly", "Breathe Underwater" }, null);
	if (Q2==0) {//AIRBORNE ADVENTURE
		JOptionPane.showMessageDialog(null, "Congrats! You are flying through the sky!");
		int Q3 = JOptionPane.showOptionDialog(null, "Now where do you want to go?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "The Clouds", "Gothom City" }, null);
		if (Q3==0) {
			JOptionPane.showMessageDialog(null, "The world looks so small!!");
			int Q4 = JOptionPane.showOptionDialog(null, "Do you want to wake up?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Yes", "No" }, null);
			if (Q4==0) {//Ending 2
				JOptionPane.showMessageDialog(null, "Thank you for playing!!");
				break;
				}else {}
		}else if (Q3==1) {//CROSS FIRE!!
			JOptionPane.showMessageDialog(null, "You are caught in crossfire between Batman and the Joker!!");
			int Q4 = JOptionPane.showOptionDialog(null, "Do you want to wake up?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Yes", "No" }, null);
			if (Q4==0) {//Ending 2
				JOptionPane.showMessageDialog(null, "Thank you for playing!!");
				break;
			}else if(Q4==1){//Crazy 2
				JOptionPane.showMessageDialog(null, "You are insane "+Name+". Good luck on this endless nightmare.");
				JOptionPane.showMessageDialog(null, "Thank you for playing!!");
				break;}}
	}else if(Q2==1){//UNDERWATER ADVENTURE
		JOptionPane.showMessageDialog(null, "Isn't it amazing to be able to breathe underwater?");
		int Q6 = JOptionPane.showOptionDialog(null, "Now where do you want to go?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Atlantis", "Trench" }, null);
		if (Q6==0) {//THE LOST CITY OF ATLANTIS
			JOptionPane.showMessageDialog(null, "Isn't Atlantis beautiful?");
			int Q5 = JOptionPane.showOptionDialog(null, "Do you want to wake up?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Yes", "No" }, null);
			if (Q5==0) {//Ending 2
				JOptionPane.showMessageDialog(null, "Thank you for playing!!");
				break;
				}else {}
			}else if (Q6==1) {//Freaky Monsters
				JOptionPane.showMessageDialog(null, "There is a gigantic angler fish trying to eat you!!");
				int Q5 = JOptionPane.showOptionDialog(null, "Do you want to wake up?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Yes", "No" }, null);
				if (Q5==0) {//Ending 2
					JOptionPane.showMessageDialog(null, "Thank you for playing!!");
					break;
				}else if(Q5==1){//Crazy 2
					JOptionPane.showMessageDialog(null, "You are insane "+Name+". Good luck on this endless nightmare.");
					JOptionPane.showMessageDialog(null, "Thank you for playing!!");
					break;
				}
			}
		}
}else {//Crazy 1
	JOptionPane.showMessageDialog(null, "Sorry, "+Name+" you really needed sleep. You missed out!");
	int L1 = JOptionPane.showOptionDialog(null, "Do you want to try again?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Yes", "No" }, null);
		if (L1==0) {
			
		}else {
			JOptionPane.showMessageDialog(null, "Thank you for playing!!");
			break;
}}}}}
