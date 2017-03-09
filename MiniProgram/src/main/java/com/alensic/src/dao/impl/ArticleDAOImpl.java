package com.alensic.src.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.alensic.src.dao.IArticleDAO;
import com.alensic.src.model.Article;

import lombok.Setter;

@SuppressWarnings("all")
public class ArticleDAOImpl implements IArticleDAO {

	@Setter
	SessionFactory sessionFactory;

	public List<Article> listAll(int lastid, int limit) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("SELECT obj FROM Article obj");
		query.setFirstResult(lastid);
		query.setMaxResults(limit);
		return query.list();
	}

	public Article queryById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return (Article) session.get(Article.class, id);
	}

	@Override
	public void update(Article article) {
		Session session = sessionFactory.getCurrentSession();
		session.update(article);
	}

	@Override
	public void delete(Article article) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(article);

	}

	@Override
	public void save(Article article) {
		Session session = sessionFactory.getCurrentSession();
		session.save(article);
	}

}
