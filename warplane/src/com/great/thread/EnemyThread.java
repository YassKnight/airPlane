package com.great.thread;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.great.bean.Enemy;
import com.great.bean.Flyer;
import com.great.bean.Game;

public class EnemyThread {

	public Game game;
	// 存储所有敌机对象的list集合
	public List<Enemy> enemies = new ArrayList<Enemy>();

	public EnemyThread(Game game) {
		this.game = game;
	}

	// 敌机集合添加敌机
	int index = 0;

	public void addEnemy() {
		index++;
		if (index % 42 == 0) {
			Enemy enemy = new Enemy();
			enemies.add(enemy);
		}
	}

	// 敌机移动
	public void enemyMove() {
		for (int i = 0; i < enemies.size(); i++) {
			Enemy enemy = enemies.get(i);
			enemy.flyStep();
		}
	}

	// 敌机越界删除
	public void deleteEnemy() {
		for (int i = 0; i < enemies.size(); i++) {
			Enemy enemy = enemies.get(i);
			if (enemy.outFrame())
				enemies.remove(i);

		}
	}

	// 画出敌机
	public void paintenemy(Graphics g) {
		for (int i = 0; i < enemies.size(); i++) {
			Enemy enemy = enemies.get(i);
			g.drawImage(enemy.image, enemy.x, enemy.y, null);
		}
	}

	// 子弹和敌机的碰撞检测
	public void crash() {
		for (int i = 0; i < game.bulletThread.bullets.size(); i++) {
			for (int j = 0; j < enemies.size(); j++) {
				if (Flyer.crash(game.bulletThread.bullets.get(i), enemies.get(j))) {
					// 设置英雄得分
					game.hero.setScore(game.hero.getScore() + enemies.get(j).getScore());

					// 删除碰撞的子弹和敌机
					game.bulletThread.bullets.remove(i);
					enemies.remove(j);
					break;
				}
			}
		}

	}

	// 英雄和敌机的碰撞检测
	public void heroCrash() {
		for (int i = 0; i < enemies.size(); i++) {
			if (Flyer.crash(enemies.get(i), game.hero)) {
				game.hero.setLife(game.hero.getLife() - 1);
				if (game.hero.getLife() < 0)
					game.hero.setLife(0);
				enemies.remove(i);
				break;
			}
		}
	}

}
