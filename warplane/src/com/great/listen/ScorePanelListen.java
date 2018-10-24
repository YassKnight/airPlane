package com.great.listen;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.great.ui.loginUI.LoginFrame;
import com.great.ui.scoreUI.ScoreFrame;
import com.great.ui.scoreUI.ScorePanel;

public class ScorePanelListen implements MouseListener {

	private ScorePanel ScorePanel;

	private ScoreFrame scoreFrame;

	public ScorePanelListen(ScorePanel scorePanel) {
		super();
		this.ScorePanel = scorePanel;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

		scoreFrame = ScorePanel.getScoreFrame();
		scoreFrame.setVisible(false);
		LoginFrame loginFrame = LoginFrame.createLoginFrame();
		loginFrame.setVisible(true);

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO 自动生成的方法存根

	}

}
