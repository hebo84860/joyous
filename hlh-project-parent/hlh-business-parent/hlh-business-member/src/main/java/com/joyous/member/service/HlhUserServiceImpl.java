package com.joyous.member.service;

import com.joyous.common.constant.CodeEnum;
import com.joyous.common.vo.BaseSingleResultVO;
import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.web.controller.service.HlhUserService;
import com.joyous.persistence.mybatis.mapper.HlhUserEntityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * Created by hebo on 2017/3/1.
 */
@Service("hlhUserService")
public class HlhUserServiceImpl implements HlhUserService {

    private Logger logger = LoggerFactory.getLogger(HlhUserServiceImpl.class);

    @Autowired
    private HlhUserEntityMapper userEntityMapper;

    @Value("${login.url}")
    private String test ;

    public BaseSingleResultVO<HlhUserEntity> saveUserEntity(HlhUserEntity userEntity) {
        logger.error("saveUserEntity userEntity = " + userEntity);
        BaseSingleResultVO<HlhUserEntity> baseSingleResultDto = new BaseSingleResultVO<HlhUserEntity>();
        try {
            if (userEntity!=null){
                if (userEntity.getId()==null){
                    userEntityMapper.insertSelective(userEntity);
                }else {
                    userEntityMapper.updateByPrimaryKeySelective(userEntity);
                }
            }
            baseSingleResultDto.setResult(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
            baseSingleResultDto.setErrorMessage(CodeEnum.SYSTEM_ERROR.getValueStr());
        }
        return baseSingleResultDto;
    }
}
