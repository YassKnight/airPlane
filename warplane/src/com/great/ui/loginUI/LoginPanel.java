package com.great.ui.loginUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.great.listen.LoginPanelListen;

public class LoginPanel extends JPanel {

	private LoginFrame loginFrame;
	private JTextField unameText;
	private JButton startBtn;

	public LoginPanel(LoginFrame loginFrame) {

		this.loginFrame = loginFrame;
		// 设置登录界面大小
		setPreferredSize(new Dimension(300, 80));
		// 设置布局为边界布局
		setLayout(new BorderLayout());
		// 实例控件
		JLabel jLabel = new JLabel("请输入您的名字:");
		unameText = new JTextField(12);
		startBtn = new JButton("开始游戏");

		// 往页面添加控件
		this.add(jLabel, BorderLayout.WEST);
		this.add(unameText, BorderLayout.EAST);
		this.add(startBtn, BorderLayout.SOUTH);
		
		
		LoginPanelListen loginPanelListen=new LoginPanelListen(this);
		startBtn.addMouseListener(loginPanelListen);

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO 自动生成的方法存根
		super.paintComponent(g);
		g.drawImage(new ImageIcon("image/3.jpg ").getImage(), 0, 0, 300, 200, this);
	}

	public JTextField getUnameText() {
		return unameText;
	}

	public void setUnameText(JTextField unameText) {
		this.unameText = unameText;
	}

	public JButton getStartBtn() {
		return startBtn;
	}

	public void setStartBtn(JButton startBtn) {
		this.startBtn = startBtn;
	}

	public LoginFrame getLoginFrame() {
		return loginFrame;
	}

	public void setLoginFrame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

}
