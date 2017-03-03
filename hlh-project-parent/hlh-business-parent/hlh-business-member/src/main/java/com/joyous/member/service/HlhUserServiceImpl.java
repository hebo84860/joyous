package com.joyous.member.service;

import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.web.controller.service.HlhUserService;
import com.joyous.persistence.mybatis.mapper.HlhUserEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * Created by hebo on 2017/3/1.
 */
@Service("hlhUserService")
public class HlhUserServiceImpl implements HlhUserService {

    @Autowired
    private HlhUserEntityMapper userEntityMapper;

    @Value("${test}")
    private String test ;

    public HlhUserEntity saveUserEntity(HlhUserEntity userEntity) {
        if (userEntity!=null){
            if (userEntity.getId()==null){
                userEntityMapper.insertSelective(userEntity);
            }else {
                userEntityMapper.updateByPrimaryKeySelective(userEntity);
            }
        }
        return userEntity;
    }
}
