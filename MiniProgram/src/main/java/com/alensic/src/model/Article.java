package com.alensic.src.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Article {
	private int id;
	private String title;
	private String img;
	private Date cTime;
	private String content;

	public Date getcTime() {
		return cTime;
	}

	public void setcTime(Date cTime) {
		this.cTime = cTime;
	}

}
