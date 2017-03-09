package com.alensic.src.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import com.alensic.src.model.Article;
import com.alensic.src.service.IArticleService;
import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

/**
 * 文章控制器
 * 
 * @author Jason
 *
 */
public class ArticleController extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Setter
	@Getter
	private IArticleService articleService;

	@Setter
	@Getter
	private List<Article> listAll;
	
	@Setter
	@Getter
	private Article queryById;
	
	@Getter
	@Setter
	private int id;
	
	@Getter
	@Setter
	private int limit;
	
	@Getter
	@Setter
	private int lastid;

	public String listAll() throws Exception {
		listAll = articleService.listAll(lastid,limit);
		/*
		 * for (Article article : listAll) { System.out.println(article); }
		 */
		/*
		 * Article article = articleService.queryById(1);
		 * System.out.println(article);
		 */
		return SUCCESS;
	}

	public String queryById() throws Exception {
		queryById = articleService.queryById(id);
		return SUCCESS;
	}
}
