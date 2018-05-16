package kr.green.spring.dao;

import org.apache.ibatis.annotations.Param;

public interface Mapper {
	public String getId(@Param("id") String id);
}
