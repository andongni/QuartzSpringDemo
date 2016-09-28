package com.hyy.base.task.dao;

import com.hyy.base.task.domain.ScheduleJob;

import java.util.List;

/**
 * 自定义任务相关的mapper
 */
public interface ScheduleJobMapper {
	int deleteByPrimaryKey(Long jobId);

	int insert(ScheduleJob record);

	int insertSelective(ScheduleJob record);

	ScheduleJob selectByPrimaryKey(Long jobId);

	int updateByPrimaryKeySelective(ScheduleJob record);

	int updateByPrimaryKey(ScheduleJob record);

	List<ScheduleJob> getAll();
}