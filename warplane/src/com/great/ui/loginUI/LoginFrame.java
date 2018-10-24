package com.great.ui.loginUI;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LoginFrame extends JFrame{
	
	private LoginPanel loginPanel;
	private static LoginFrame loginFrame;
	public  LoginFrame( )
	{
		loginPanel=new LoginPanel(this);
		this.add(loginPanel);
		setTitle("登陆界面");
		//设置大小不可改变
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置包裹
		pack();
		// 设置居中
		setLocationRelativeTo(null);
		// 设置可见
		setVisible(true);
	}
	public static LoginFrame createLoginFrame()
	{
		if(loginFrame==null)
			loginFrame=new LoginFrame();
		return loginFrame;
	}
	public LoginPanel getLoginPanel() {
		return loginPanel;
	}
	public void setLoginPanel(LoginPanel loginPanel) {
		this.loginPanel = loginPanel;
	}

}
