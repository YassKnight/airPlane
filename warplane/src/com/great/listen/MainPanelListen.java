package com.great.listen;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.great.bean.Bullet;
import com.great.bean.Enemy;
import com.great.bean.Game;
import com.great.bean.Hero;
import com.great.ui.MainUI.MainFrame;
import com.great.ui.MainUI.MainPanel;
import com.great.ui.scoreUI.ScoreFrame;
import com.great.util.InfoUtil;

public class MainPanelListen extends MouseAdapter {

	private MainPanel panel;
	private Game game;

	public MainPanelListen(Game game, MainPanel panel) {
		this.game = game;
		this.panel = panel;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		super.mouseMoved(e);
		if (game.getState() == game.getRunning()) {
			game.hero.MoveTo(e.getX(), e.getY());
			panel.repaint();
		}

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (game.getState() == game.getStart())
			game.setState(game.getRunning());
		if (game.getState() == game.getEnding()) {
			game.setState(game.getStart());

			// 游戏结束，就接收游戏的分数，和玩家姓名
			String uname = game.getUname();
			int score = game.getHero().getScore();
			List<Map<String, Object>> list = new ArrayList<>();
			Map<String, Object> map = new HashMap<>();
			map.put("uname", uname);
			map.put("score", score);
			list.add(map);
			//System.out.println(list);
			InfoUtil infoUtil = InfoUtil.getonlyInfoUtil();
			infoUtil.setlist(map);
			MainFrame mainFrame = MainFrame.getonlyMainFrame();
			mainFrame.setVisible(false);
			ScoreFrame scoreFrame = new ScoreFrame();
			scoreFrame.getScorePanel().repaint();
			scoreFrame.setVisible(true);
			
			// 重新实例游戏
			game.hero = new Hero();
			game.bulletThread.bullets = new ArrayList<Bullet>();
			game.enemyThread.enemies = new ArrayList<Enemy>();

		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

		if (game.getState() == game.getPause())
			game.setState(game.getRunning());
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		if (game.getState() == game.getRunning()) {
			game.setState(game.getPause());
		}
	}
}
