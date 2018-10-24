package com.great.bean;

public class Bullet extends Flyer {
	// 子弹的飞行间隔
	private int speed = 4;

	public Bullet() {

	}

	public Bullet(int x, int y) {
		image = Game.getBullet1();
		width = image.getWidth();
		height = image.getHeight();
		// 获取子弹产生时飞机的位置
		this.x = x;
		this.y = y;

	}

	@Override
	public void flyStep() {
		// 子弹飞行的路径
		y -= speed;
	}

	@Override
	public boolean outFrame() {
		// 子弹是否越界
		return (y + height) < 0;
	}

}
