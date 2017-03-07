package com.joyous.member.service;

import com.joyous.common.client.BusinessClient;
import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.common.vo.BaseSingleResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * Created by hebo on 2017/3/3.
 */
@RequestMapping("/user")
@Controller
public class HlhUserController {
    private Logger logger = LoggerFactory.getLogger(HlhUserController.class);

    @Autowired
    private BusinessClient businessClient;

    @RequestMapping("/saveOrUpdateUser")
    @ResponseBody
    public BaseSingleResultVO<HlhUserEntity> saveOrUpdateHlhUser(){

        logger.info(" saveOrUpdateHlhUser controller info _ _ _");
        logger.error(" saveOrUpdateHlhUser controller error _ _ _");
        HlhUserEntity hlhUserEntity = new HlhUserEntity();
        hlhUserEntity.setId(3);
        hlhUserEntity.setNickname("fengxng");
        hlhUserEntity.setUsername("fengxing");
        hlhUserEntity.setAddress("hunan");
        hlhUserEntity.setCardNo("430522196303302369");
        return businessClient.saveOrUpdateHlhUser(hlhUserEntity);
    }

}
