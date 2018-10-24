package com.great.main;

import com.great.ui.MainUI.MainFrame;
import com.great.ui.loginUI.LoginFrame;

public class FlyMain {

	private LoginFrame loginFrame;

	public FlyMain() {
		loginFrame = LoginFrame.createLoginFrame();
	}

	public static void main(String[] args) {
		new FlyMain();
	}

	public LoginFrame getLoginFrame() {
		return loginFrame;
	}

	public void setLoginFrame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

	

}
