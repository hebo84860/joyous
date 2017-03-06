package service;

import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.web.controller.service.HlhUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by hebo on 2017/3/1.
 */
public class HlhUserServiceTest extends BaseTest{

    @Autowired
    private HlhUserService hlhUserService;


    @Test
    public void testSaveUser(){
        System.out.println("============= testSaveUser begin...");
        HlhUserEntity userEntity = new HlhUserEntity();
        userEntity.setId(2);
        userEntity.setUsername("test");
        userEntity.setPassword("asddsa");
        userEntity.setNickname("testSaveUsersss");
        hlhUserService.saveUserEntity(userEntity);
        System.out.println("============= testSaveUser end.");
    }
}
