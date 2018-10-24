package com.great.ui.scoreUI;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.great.listen.ScorePanelListen;
import com.great.util.InfoUtil;

public class ScorePanel extends JPanel {

	private ScoreFrame scoreFrame;
	private JButton jButton;

	public ScorePanel(ScoreFrame scoreFrame) {

		this.scoreFrame = scoreFrame;
		JLabel title = new JLabel("-----------计分榜-------------");
		this.add(title);
		InfoUtil infoUtil = InfoUtil.getonlyInfoUtil();
		List<Map<String, Object>> list=new ArrayList<>();
		list=infoUtil.getUserlist();
		for (int i = 0; i < list.size() ; i++) {
			JLabel label = new JLabel("玩家:  " + list.get(i).get("uname").toString() + "   得分：" + list.get(i).get("score").toString());
			this.add(label);
		}
		// jLabel.setText(list);

		jButton = new JButton("确定");

		// 页面添加控件

		this.add(jButton);

		// 按钮添加监听
		ScorePanelListen scorePanelListen = new ScorePanelListen(this);
		jButton.addMouseListener(scorePanelListen);

	}

	public ScoreFrame getScoreFrame() {
		return scoreFrame;
	}

	public void setScoreFrame(ScoreFrame scoreFrame) {
		this.scoreFrame = scoreFrame;
	}

	public JButton getjButton() {
		return jButton;
	}

	public void setjButton(JButton jButton) {
		this.jButton = jButton;
	}

}
