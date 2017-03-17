package com.joyous.common.domain;

import com.joyous.common.entity.BaseQueryEntity;
import com.joyous.common.entity.Dto;

import java.util.List;

/**
 * 
 * @author mashengwen
 * mybatis 的mapper继承DomainEntityMapper
 * 实现相关方法，传入和传出参数需要实现Entity接口
 *
 */
public interface DomainEntityBaseMapper<I extends Dto,Q extends BaseQueryEntity<? extends Dto>> {

	/**
	 * @param i
	 * insert
	 */
	public int insertSelective(I i);

	/**
	 * @param id
	 * getById
	 */
	public I selectByPrimaryKey(Integer id);

	/**
	 * @param id
	 * deleteById
	 */
	public int deleteByPrimaryKey(Integer id);

	/**
	 * @param i
	 * updateById
	 */
	public int updateByPrimaryKeySelective(I i);

	/**
	 * @param q
	 * @return
	 * 查询返回多个对象
	 */
	public List<I> query(Q q);

	/**
	 * @param q
	 * @return
	 * 返回总数
	 */
	public int count(Q q);
	
}
