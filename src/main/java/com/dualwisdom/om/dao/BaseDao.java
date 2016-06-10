package com.dualwisdom.om.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

public interface BaseDao<T, PK> {
	
	public T get(PK id) throws PersistenceException;
	public List<T> getAll() throws PersistenceException;
	public int create(T obj) throws PersistenceException;
	public int update(T obj) throws PersistenceException;
	public int delete(T obj) throws PersistenceException;	
}
