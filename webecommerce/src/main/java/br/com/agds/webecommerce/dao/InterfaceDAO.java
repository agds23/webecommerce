/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agds.webecommerce.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author André
 */
public interface InterfaceDAO<T> {

    void save(T entity);

    void update(T entity);

    void remove(T entity);

    void merge(T entity);

    T getEntity(Serializable id);

    T getEntityByDetachedCriteria(DetachedCriteria criteria);

    T getEntityByHQLQuery(String stringQuery);

    List<T> getEntities();

    List<T> getListByDetachedCriteria(DetachedCriteria criteria);
}
