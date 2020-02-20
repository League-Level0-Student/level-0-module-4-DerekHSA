package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score=JOptionPane.showInputDialog("<<<INSERT YOU TEST SCORE>>>");
	double Score=Double.parseDouble(score);
	if (Score<=100.0&&Score>=90.0) {
		JOptionPane.showMessageDialog(null, "<<GOOD JOB HUMAN>>");
	} else if (Score<=89.9&&Score>=70.0) {
		JOptionPane.showMessageDialog(null, "<<NICE TRY HUMAN>>");
	} else if (Score<=69.9&&Score>=50.0) {
		JOptionPane.showMessageDialog(null, "<<REDO IT HUMAN>>");
	} else if (Score<=49.9&&Score>=30.0) {
		JOptionPane.showMessageDialog(null, "<<GO AWAY HUMAN>>");
	} else if (Score<=29.9&&Score>=10.0) {
		JOptionPane.showMessageDialog(null, "<<THINK ABOUT YOUR LIFE CHOICES HUMAN>>");
	}else {
		JOptionPane.showMessageDialog(null, "I don't know what to say");
	}
	
}
}
