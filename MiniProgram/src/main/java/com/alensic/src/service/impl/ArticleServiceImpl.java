package com.alensic.src.service.impl;

import java.util.List;

import com.alensic.src.dao.IArticleDAO;
import com.alensic.src.model.Article;
import com.alensic.src.service.IArticleService;

import lombok.Setter;

public class ArticleServiceImpl implements IArticleService {

	@Setter
	private IArticleDAO articleDAO;

	@Override
	public List<Article> listAll(int lastid,int limit) {
		return articleDAO.listAll(lastid,limit);
	}

	@Override
	public Article queryById(int id) {
		return articleDAO.queryById(id);
	}

}
