package com.great.bean;

import java.util.Random;

import com.great.ui.MainUI.MainPanel;

public class Enemy extends Flyer {
	// 设置敌机速度
	private static int speed = 1;
	// 设置敌机的分数
	private int score = 20;

	public Enemy() {
		image = Game.getEnemy1();
		width = image.getWidth();
		height = image.getHeight();
		y = -height;
		Random random = new Random();
		x = random.nextInt(MainPanel.WIDTH - width);
	}

	// 敌机飞行路径
	@Override
	public void flyStep() {
		y += speed;
	}

	// 越界检测
	@Override
	public boolean outFrame() {
		return y > MainPanel.HEIGHT;
	}

	// ---------------------------------------------------
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
