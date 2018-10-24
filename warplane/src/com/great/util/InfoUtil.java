package com.great.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InfoUtil {

	public static InfoUtil infoUtil;

	private List<Map<String, Object>> userlist;

	public InfoUtil() {
		userlist = new ArrayList<>();
	}

	public void setlist(Map<String, Object> map) {
		this.userlist.add(map);
		// 判断游戏记录是否等于5条，如果等于，就删除第一条
		if (userlist.size() == 6) {
			userlist.remove(0);
		}
	}

	// 单例实现存储游戏分数
	public static InfoUtil getonlyInfoUtil() {
		if (infoUtil == null) {
			infoUtil = new InfoUtil();

		}
		return infoUtil;
	}

	public List<Map<String, Object>> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<Map<String, Object>> userlist) {
		this.userlist = userlist;
	}

}
