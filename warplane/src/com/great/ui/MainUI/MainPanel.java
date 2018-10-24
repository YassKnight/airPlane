package com.great.ui.MainUI;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import com.great.bean.Game;

public class MainPanel extends JPanel {
	// 版本标识
	private static final long serialVersionUID = 1L;

	// 定义界面固定大小
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700;

	private Game game = new Game(this);

	public MainPanel() {
	}

	public void creatPanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	// 绘制图片
	public void paint(Graphics g) {
		// 画出背景地图
		g.drawImage(getGame().getBackground(), 0, 0, null);
		//游戏得分到达100分时画出第二张地图
		if(getGame().hero.getScore()>100)
		{
			g.drawImage(getGame().getBackground2(), 0, 0, null);
		}
		// 画出英雄机
		paintHero(g);
		
		
		// 画出敌机
		getGame().enemyThread.paintenemy(g);
		// 画出子弹
		getGame().bulletThread.paintBullets(g);
		// 画出得分和生命数
		getGame().scoreThread.paintScore_Life(g);
		// 画出开始，暂停，结束界面
		if (getGame().getState() == getGame().getStart()) {
			g.drawImage(getGame().getStart1(), 0, 0, null);
			g.drawString("\"点击屏幕开始游戏!!\"" , 180, 400);
		} else if (getGame().getState() == getGame().getPause()) {
			g.drawImage(getGame().getPause1(), 0, 0, null);
		} else if (getGame().getState() == getGame().getEnding()) {
			g.drawImage(getGame().getEnding1(), 0, 0, null);
			g.drawString("您的得分：" + getGame().hero.getScore(), 240, 300);
			/*
			 * historyScore.add(hero.getscore()); scoreThread.paintAllScore(g);
			 */

		}
	}

	// 画出英雄飞机
	int index = 0;

	private void paintHero(Graphics g) {

			g.drawImage(Game.getHero1(), getGame().hero.x, getGame().hero.y, this);
		
	}

	// -----------------------------------------------
	public Game getGame() {
		
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

}
