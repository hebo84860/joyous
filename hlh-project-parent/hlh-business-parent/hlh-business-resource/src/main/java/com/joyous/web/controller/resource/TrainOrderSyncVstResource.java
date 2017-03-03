package com.joyous.web.controller.resource;

import com.joyous.common.client.path.BusinessClientPath;
import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.web.controller.service.HlhUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * Created by hebo on 2017/2/28.
 */
@Component
@Path("/")
public class TrainOrderSyncVstResource {

    @Autowired
    private HlhUserService hlhUserService;

    /**
     * 人工同步订单状态到vst
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path(BusinessClientPath.Path.MANUAL_ORDER_STATE_TO_VST)
    public Response manualSyncTrainOrderStatusToVst() {
        System.out.println("============= testSaveUser begin...");
        HlhUserEntity userEntity = new HlhUserEntity();
        userEntity.setId(2);
        userEntity.setUsername("test");
        userEntity.setPassword("asddsa");
        userEntity.setNickname("testSa==========veUser");
        hlhUserService.saveUserEntity(userEntity);
        System.out.println("============= testSaveUser end.");
//        BaseSingleResultDto baseResultDto=trainOrderSyncVstService.manualSyncTrainOrderStatusToVst(trainOrderStateSyncRequest);
        return Response.ok(Response.ok()).build();
    }

}
