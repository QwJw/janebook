package com.xycode.janebook.service;

import com.xycode.janebook.mapper.TUserMapper;
import com.xycode.janebook.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    TUserMapper tUserMapper;

    //通过username选择user信息
    public TUser getUserByUserName(String username){
        return tUserMapper.selectByPrimaryKey(username);
    }

    //添加user
    public String addUser(TUser tUser){
        if(tUserMapper.insertSelective(tUser)>0){
            return "add success!";
        }else{
            return "add failed";
        }
    }

    //更新user
    public String updateUser(TUser tUser){
        if(tUserMapper.updateByPrimaryKeySelective(tUser)>0){
            return "update success!";
        }else{
            return "update failed";
        }
    }

    //删除user
    public String delUser(String username){
        if(tUserMapper.deleteByPrimaryKey(username)>0){
            return "delete success!";
        }else{
            return "delete failed";
        }
    }




}
