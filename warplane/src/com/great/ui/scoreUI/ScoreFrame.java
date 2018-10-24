package com.great.ui.scoreUI;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class ScoreFrame extends JFrame {

	private ScorePanel scorePanel;

	public ScoreFrame() {
		scorePanel = new ScorePanel(this);
		this.add(scorePanel);
		// 设置大小
		setPreferredSize(new Dimension(100, 300));
		setTitle("计分榜");
		// 设置不可更改大小
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 打包
		pack();
		// 设置窗口居中
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public ScorePanel getScorePanel() {
		return scorePanel;
	}

	public void setScorePanel(ScorePanel scorePanel) {
		this.scorePanel = scorePanel;
	}

}
