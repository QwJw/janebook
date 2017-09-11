package com.xycode.janebook.service;

import com.xycode.janebook.mapper.TClassifyMapper;
import com.xycode.janebook.model.TClassify;
import com.xycode.janebook.model.TClassifyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassifyService {

    @Autowired
    TClassifyMapper classifyMapper;

    public List<TClassify> getClassifys(){
        TClassifyExample classifyExample = new TClassifyExample();
        return classifyMapper.selectByExample(classifyExample);
    }

    public String addClassify(TClassify classify){
        if(classifyMapper.insertSelective(classify)>0){
            return "success";
        }else{
            return "failed";
        }
    }

    public String delClassify(Integer id){
        if(classifyMapper.deleteByPrimaryKey(id)>0){
            return "success";
        }else{
            return "failed";
        }
    }

    public String updateClassify(TClassify classify){
        if(classifyMapper.updateByPrimaryKeySelective(classify)>0){
            return "success";
        }else{
            return "failed";
        }
    }
}
