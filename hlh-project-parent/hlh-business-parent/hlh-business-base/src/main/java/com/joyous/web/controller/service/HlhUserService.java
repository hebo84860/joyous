package com.joyous.web.controller.service;

import com.joyous.common.entity.BaseQueryEntity;
import com.joyous.common.request.HlhUserRequest;
import com.joyous.common.vo.BaseResultVO;
import com.joyous.common.vo.BaseSingleResultVO;
import com.joyous.common.entity.member.HlhUserEntity;

/**
 *
 * Created by hebo on 2017/3/1.
 */
public interface HlhUserService {

    BaseSingleResultVO<HlhUserEntity> saveUserEntity(HlhUserEntity userEntity);

    BaseResultVO<HlhUserEntity> queryHlhUserList(BaseQueryEntity<HlhUserRequest> baseQueryEntity);

    BaseSingleResultVO<HlhUserEntity> selectHlhUserEntityById(Integer id);

}
