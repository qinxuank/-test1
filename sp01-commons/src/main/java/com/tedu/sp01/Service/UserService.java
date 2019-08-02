package com.tedu.sp01.Service;

import com.tedu.sp01.pojo.User;

import com.tedu.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}