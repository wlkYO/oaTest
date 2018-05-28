package com.ssm.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.ssm.entity.Dept;

public class DeptDao {
	private SqlSessionTemplate sqlSessionTemplate;

	public Dept selectDept(Integer deptId) {
		Dept dept = sqlSessionTemplate.selectOne("com.ssm.entity.DeptMapper.selectDept", deptId);
		return dept;
	}

	/**
	 * 添加部门信息
	 */
	public int insertDept(Dept dept) {
		System.out.println("------dao.dept:" + dept);
		return sqlSessionTemplate.insert("com.ssm.entity.DeptMapper.insertDept", dept);
	}

}
