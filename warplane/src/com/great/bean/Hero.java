package com.great.bean;

import com.great.ui.MainUI.MainPanel;

public class Hero extends Flyer {

	// 定义生命和分数
	private int life;
	private int score;

	public Hero() {
		// 设置图片
		image = Game.getHero1();
		// 设置飞机初始位置
		x = 150;
		y = 600;
		// 设置飞机大小
		width = image.getWidth();
		// System.out.println(width);
		height = image.getHeight();
		// System.out.println(height);
		// 设置飞机的生命数和分数
		life = 3;
		score = 0;
	}

	public void MoveTo(int x, int y) {
		this.x = x - width / 2;
		this.y = y - height / 2;
	}

	@Override
	public void flyStep() {
		// TODO 自动生成的方法存根

	}

	@Override
	public boolean outFrame() {
		// 判断飞机是否越界

		// 判断飞机横向是否越界
		boolean flag1 = (x - width / 2) < 0;
		boolean flag2 = (x + width / 2) > MainPanel.WIDTH;
		// 判断飞机竖向是否越界
		boolean flag3 = (y - height / 2) < 0;
		boolean flag4 = (y + height / 2) > MainPanel.HEIGHT;
		return flag1 || flag2 || flag3 || flag4;

	}

	/*
	 * public Bullet[] shoot() { Bullet[] bullets = null; // 子弹位置x坐标：x+width/2 //
	 * 子弹位置y坐标：y-子弹图片的高度 bullets = new Bullet[1]; bullets[0] = new Bullet(x + width
	 * / 2, y); return bullets; }
	 */
	// -------------------------------------------------------------------
	// 外部获取生命
	public int getLife() {
		return life;
	}

	// 外部获取分数
	public int getScore() {
		return score;
	}

	// 外部设置生命
	public void setLife(int life) {
		this.life = life;
	}

	// 外部设置生命分数
	public void setScore(int score) {
		this.score = score;
	}

}