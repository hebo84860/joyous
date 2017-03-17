package com.joyous.member.service;

import com.joyous.common.constant.CodeEnum;
import com.joyous.common.entity.BaseQueryEntity;
import com.joyous.common.entity.Paging;
import com.joyous.common.request.HlhUserRequest;
import com.joyous.common.vo.BaseResultVO;
import com.joyous.common.vo.BaseSingleResultVO;
import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.web.controller.service.HlhUserService;
import com.joyous.persistence.mybatis.mapper.HlhUserEntityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public BaseResultVO<HlhUserEntity> queryHlhUserList(BaseQueryEntity<HlhUserRequest> baseQueryEntity){
        BaseResultVO<HlhUserEntity> baseResultVO = new BaseResultVO<HlhUserEntity>();
        try {
            List<HlhUserEntity> userEntities = userEntityMapper.query(baseQueryEntity);
            int count = userEntityMapper.count(baseQueryEntity);
            Paging paging = baseQueryEntity.getPaging();
            paging.countRecords(count);
            baseResultVO.setPaging(paging);
            baseResultVO.setResults(userEntities);
        } catch (Exception e) {
            e.printStackTrace();
            baseResultVO.setErrorMessage(CodeEnum.SYSTEM_ERROR.getValueStr());
        }
        return baseResultVO;
    }

    public BaseSingleResultVO<HlhUserEntity> selectHlhUserEntityById(Integer id) {
        BaseSingleResultVO<HlhUserEntity> baseSingleResultVO = new BaseSingleResultVO<HlhUserEntity>();
        try {
            HlhUserEntity hlhUserEntity = userEntityMapper.selectByPrimaryKey(id);
            baseSingleResultVO.setResult(hlhUserEntity);
        } catch (Exception e) {
            e.printStackTrace();
            baseSingleResultVO.setErrorMessage(CodeEnum.SYSTEM_ERROR.getValueStr());
        }
        return baseSingleResultVO;
    }

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
