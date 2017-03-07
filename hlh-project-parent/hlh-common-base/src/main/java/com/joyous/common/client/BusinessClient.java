package com.joyous.common.client;

import com.joyous.common.client.path.BusinessClientPath;
import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.common.exception.ExceptionWrapper;
import com.joyous.common.util.JSONMapper;
import com.joyous.common.vo.BaseSingleResultVO;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * 业务接口远程调用类
 *
 * @author yangyongni
 * @date 2015-12-10
 */

@Component
@SuppressWarnings("rawtypes")
public class BusinessClient {

    /**
     * 远程地址${test}
     */
    @Value("${business.baseUrl}")
    private String baseUrl;

    /**
     * 远程服务
     */
    @Autowired
    private RestClient restClient;

    public static final Logger logger = Logger.getLogger(BusinessClient.class);


    /**
     * 保存或者修改会员信息
     *
     * @param hlhUserEntity
     * @return
     */
    public BaseSingleResultVO<HlhUserEntity> saveOrUpdateHlhUser(HlhUserEntity hlhUserEntity) {
        BusinessClientPath command = BusinessClientPath.SAVE_OR_UPDATE_USERS;
        String url = command.url("http://localhost:8088/");
        try {
            ObjectMapper objectMapper = JSONMapper.getInstance();
            String jsonResult = restClient.post(url, String.class, hlhUserEntity);
            return objectMapper.readValue(jsonResult, new TypeReference<BaseSingleResultVO<HlhUserEntity>>() {
            });
        } catch (ExceptionWrapper ew) {
            logger.error(ew.getErrMessage(), ew);
            throw ew;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }


}

