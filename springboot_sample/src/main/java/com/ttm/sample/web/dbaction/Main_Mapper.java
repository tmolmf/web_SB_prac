package com.ttm.sample.web.dbaction;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Main_Mapper {
	HashMap selectObjectById(String id);
	List<HashMap> selectObjects();
}
