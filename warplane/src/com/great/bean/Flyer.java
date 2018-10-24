package com.great.bean;

import java.awt.image.BufferedImage;

/**
 * 封装飞行物共同父类
 */
public abstract class Flyer {
	// 定义飞行物的x,y坐标
	public int x;
	public int y;
	// 定义飞行物的宽，长
	protected int width;
	protected int height;
	// 飞行物的图片加载
	public BufferedImage image;

	// 飞行物的移动方式
	public abstract void flyStep();

	// 判断飞行物是否越界
	public abstract boolean outFrame();

	// 判断两个飞行物是否相撞
	public static boolean crash(Flyer f1, Flyer f2) {
		// 计算飞行物的中心点
		int f1x = f1.x;
		int f1y = f1.y;

		int f2x = f2.x;
		int f2y = f2.y;
		// 计算飞行物横向是否相碰
		boolean hor = Math.abs(f1x - f2x) < (f1.width + f2.width) / 2 +20;
		// 计算飞行物竖向是否相碰
		boolean ver = Math.abs(f1y - f2y) < (f1.height + f2.height) / 2 +20;
		// 返回两个飞行物横竖向都相碰，才认为是碰撞
		boolean flag;
		flag = ver && hor;
		return flag;
	}

	// ---------------------------------------------------------
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

}
