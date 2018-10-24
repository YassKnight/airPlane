package com.great.ui.MainUI;

import javax.print.attribute.standard.MediaName;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	// 版本标识
	private static final long serialVersionUID = 1L;
	private MainPanel panel;
	public static MainFrame mainFrame;

	public MainFrame() {
		panel = new MainPanel();
		panel.creatPanel();
		this.add(panel);
		// 设置窗口标题
		setTitle("飞机大战");
		// 设置不可改变大小
		// setResizable(false);
		// 设置打叉关闭
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// 设置包裹
		pack();
		// 设置居中
		setLocationRelativeTo(null);
		// 事件
		panel.getGame().action();

	}

	public MainFrame(MainPanel panel) {
		super();
		this.panel = panel;
	}

	public static MainFrame getonlyMainFrame() {
		if (mainFrame == null) {
			mainFrame = new MainFrame();

		}
		return mainFrame;
	}

	// ---------------------------------------------
	public MainPanel getPanel() {
		return panel;
	}

	public void setPanel(MainPanel panel) {
		this.panel = panel;

	}

}
