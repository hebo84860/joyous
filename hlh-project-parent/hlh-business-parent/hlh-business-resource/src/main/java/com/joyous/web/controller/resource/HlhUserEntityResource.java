package com.joyous.web.controller.resource;

import com.joyous.common.client.path.BusinessClientPath;
import com.joyous.common.vo.BaseSingleResultVO;
import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.web.controller.service.HlhUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 会员相关resource
 * Created by hebo on 2017/2/28.
 */
@Controller
@Path("/")
public class HlhUserEntityResource {

    @Autowired
    private HlhUserService hlhUserService;

    /**
     * 保存或者修改会员信息
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path(BusinessClientPath.Path.SAVE_OR_UPDATE_USERS)
    public Response saveOrUpdateUsers(HlhUserEntity userEntity) {
        System.out.println("============= testSaveUser begin...");
        BaseSingleResultVO baseResultDto = hlhUserService.saveUserEntity(userEntity);
        System.out.println("============= testSaveUser end.");
        return Response.ok(baseResultDto).build();
    }

}
