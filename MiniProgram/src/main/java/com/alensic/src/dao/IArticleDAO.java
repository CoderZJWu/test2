package com.alensic.src.dao;

import java.util.List;

import com.alensic.src.model.Article;

public interface IArticleDAO {
	/**
	 * 查询所有文章
	 * 
	 * @return
	 */
	List<Article> listAll(int lastid,int limit);

	/**
	 * 根据id查询文章
	 * 
	 * @param id
	 * @return
	 */
	Article queryById(int id);

	/**
	 * 更新
	 * 
	 * @param article
	 */
	void update(Article article);

	/**
	 * 删除
	 * 
	 * @param article
	 */
	void delete(Article article);

	/**
	 * 新增
	 * 
	 * @param article
	 */
	void save(Article article);
}
