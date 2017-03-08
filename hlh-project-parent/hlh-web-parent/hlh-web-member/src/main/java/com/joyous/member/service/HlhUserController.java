package com.joyous.member.service;

import com.joyous.common.client.BusinessClient;
import com.joyous.common.constant.Status;
import com.joyous.common.constant.UserType;
import com.joyous.common.entity.BaseQueryEntity;
import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.common.form.member.HlhUserEntityFrom;
import com.joyous.common.request.HlhUserRequest;
import com.joyous.common.vo.BaseResultVO;
import com.joyous.common.vo.BaseSingleResultVO;
import com.joyous.common.vo.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/toHlhUserList")
    public String toHlhUserList(Model model){
        model.addAttribute("userTypeEnum", UserType.values());
        model.addAttribute("statusEnum", Status.values());
        return "user/user_list";
    }


    @RequestMapping("/ajaxQueryUserList")
    @ResponseBody
    public BaseResultVO<? extends Response> queryHlhUserList(HlhUserEntityFrom userEntityFrom){
        BaseQueryEntity<HlhUserRequest> baseQueryEntity =
                new BaseQueryEntity<HlhUserRequest>( userEntityFrom.getPaging(), new HlhUserRequest(userEntityFrom.getHlhUserEntity()));
        BaseResultVO<HlhUserEntity> userList= businessClient.queryUpdateUserList(baseQueryEntity);
        return null;
    }

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
