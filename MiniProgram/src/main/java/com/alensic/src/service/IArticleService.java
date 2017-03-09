package com.alensic.src.service;

import java.util.List;

import com.alensic.src.model.Article;

public interface IArticleService {
	/**
	 * 查询所有文章
	 * @return
	 */
	List<Article> listAll(int lastid,int limit);

	/**
	 * 根据id查询文章
	 * @param id
	 * @return
	 */
	Article queryById(int id);
}
