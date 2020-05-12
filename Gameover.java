import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionEvent;

public class Gameover extends JFrame {
	public static BufferedImage gameover;
	public static BufferedImage coin;
	private int score=GamePage.score;
	private int highestScore=0;
	private int money=GamePage.money;
	static {
		try {
			gameover=ImageIO.read(new File("/Users/zhanghaojun/Desktop/Watch_Out_Virus/gameover.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g) {
		paintGameover(g);
		paintYourscore(g);
		paintHighestScore(g);
		paintMoney(g);
	}
	
	public void paintGameover(Graphics g) {
		g.drawImage(gameover, 0, 0, null);
	}
	
	public void paintYourscore(Graphics g) {
		String yourScore = String.format("%09d",this.score);//要改成getScore
		g.setFont((new Font("Dialog", 1, 40)));
		g.drawString("Your score: "+yourScore, 70, 460);
	}
	public void paintHighestScore(Graphics g) {
		String highest= String.format("%09d", highestScore);
		g.setFont((new Font("Dialog", 1, 40)));
		g.drawString("Highest score: "+highest, 30, 530);
	}
	public void paintMoney(Graphics g) {
		String money= String.format("%04d", this.money);
		g.setFont((new Font("Dialog", 1, 40)));
		g.drawString("$: "+money, 230, 600);
	}
	/**
	/**
	 * Create the application.
	 */
	public Gameover() {
		initialize();
		setTitle("小心疫疫");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setSize(600, 800);
		setBackground(Color.black);
		setForeground(Color.white);
		getContentPane().setBackground(Color.black);
		getContentPane().setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}// 返回主畫面
		});
		button.setBounds(240, 620, 136, 39);
		getContentPane().add(button);

	}
}
