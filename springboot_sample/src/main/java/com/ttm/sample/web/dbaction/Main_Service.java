package com.ttm.sample.web.dbaction;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Main_Service {
    @Autowired
    Main_Mapper mainMapper;
    
	public HashMap getObjectbyId(String id) {
        return mainMapper.selectObjectById(id);
    }
    
	public List<HashMap> getObjects() {
        return mainMapper.selectObjects();
    }
}
