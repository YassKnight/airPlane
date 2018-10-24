package com.great.listen;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import com.great.ui.MainUI.MainFrame;
import com.great.ui.loginUI.LoginPanel;

public class LoginPanelListen implements MouseListener {

	private LoginPanel loginPanel;

	public LoginPanelListen(LoginPanel loginPanel) {

		super();
		this.loginPanel = loginPanel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		String uname = loginPanel.getUnameText().getText();
		// 判断用户是否输入了名字
		if ("".equals(uname)) {
			JOptionPane.showMessageDialog(null, "请输入您的名字");
		} else {
			JOptionPane.showMessageDialog(null, "正在加载");
			loginPanel.getLoginFrame().setVisible(false);
			MainFrame mainFrame = MainFrame.getonlyMainFrame();
			mainFrame.setVisible(true);
			mainFrame.getPanel().getGame().setUname(uname);
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自动生成的方法存根

	}

}
