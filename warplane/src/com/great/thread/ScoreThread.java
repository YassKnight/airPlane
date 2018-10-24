package com.great.thread;

import java.awt.Font;
import java.awt.Graphics;

import com.great.bean.Game;

public class ScoreThread {
	private Game game;

	// 设置字体
	Font font = new Font(Font.SANS_SERIF, Font.BOLD, 14);

	public ScoreThread(Game game) {
		this.game = game;
	}

	// 设置面板显示英雄飞机生命和得分
	public void paintScore_Life(Graphics g) {
		// 设置得分和生命数的坐标
		int x = 10;
		int y = 15;
		g.setFont(font);
		g.drawString("得分：" + game.hero.getScore(), x, y);
		y += 20;
		g.drawString("生命数：" + game.hero.getLife(), x, y);
	}

	/*
	 * // 设置最近五次历史分数面板 public void paintAllScore(Graphics g) { // 设置面板坐标 int x = 10;
	 * int y = 500; g.setFont(font); g.drawString("历史得分：", x, y-20);
	 * 
	 * //g.drawString("<"+i+">"+panel.historyScore.get(i)+"分", x, y); for (int i =
	 * 0; i < panel.historyScore.size(); i++) {
	 * g.drawString("<"+i+">"+panel.historyScore.get(i)+"分", x, y+i*10);
	 * 
	 * }//s.run();
	 * 
	 * }
	 */
}
