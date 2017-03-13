package com.joyous.common.vo.member;

import com.joyous.common.constant.Status;
import com.joyous.common.constant.UserType;
import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.common.vo.Response;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by hebo on 2017/3/8.
 */
public class HlhUserEntityReponse implements Serializable, Response {
    private static final long serialVersionUID = 661545602232501494L;

    private HlhUserEntity hlhUserEntity;

    private String statusStr;
    private String userTypeStr;
    private String createTimeStr;
    private String updateTimeStr;

    public HlhUserEntityReponse(){

    }
    public HlhUserEntityReponse(HlhUserEntity hlhUserEntity){
        this.hlhUserEntity = hlhUserEntity;
    }

    public HlhUserEntity getHlhUserEntity() {
        return hlhUserEntity;
    }

    public void setHlhUserEntity(HlhUserEntity hlhUserEntity) {
        this.hlhUserEntity = hlhUserEntity;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getUserTypeStr() {
        return userTypeStr;
    }

    public void setUserTypeStr(String userTypeStr) {
        this.userTypeStr = userTypeStr;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getUpdateTimeStr() {
        return updateTimeStr;
    }

    public void setUpdateTimeStr(String updateTimeStr) {
        this.updateTimeStr = updateTimeStr;
    }

    public Integer getId() {
        return hlhUserEntity.getId();
    }

    public void setCreateBy(String createBy) {
        hlhUserEntity.setCreateBy(createBy);
    }

    public Date getUpdateTime() {
        return hlhUserEntity.getUpdateTime();
    }

    public Date getCreateTime() {
        return hlhUserEntity.getCreateTime();
    }

    public Integer getBelongFirstDistribution() {
        return hlhUserEntity.getBelongFirstDistribution();
    }

    public Status getStatus() {
        return hlhUserEntity.getStatus();
    }

    public void setRealname(String realname) {
        hlhUserEntity.setRealname(realname);
    }

    public String getDistrict() {
        return hlhUserEntity.getDistrict();
    }

    public String getUsername() {
        return hlhUserEntity.getUsername();
    }

    public void setPassword(String password) {
        hlhUserEntity.setPassword(password);
    }

    public void setPhone(String phone) {
        hlhUserEntity.setPhone(phone);
    }

    public void setProvince(String province) {
        hlhUserEntity.setProvince(province);
    }

    public void setDistrict(String district) {
        hlhUserEntity.setDistrict(district);
    }

    public String getUpdateBy() {
        return hlhUserEntity.getUpdateBy();
    }

    public void setEmail(String email) {
        hlhUserEntity.setEmail(email);
    }

    public String getAddress() {
        return hlhUserEntity.getAddress();
    }

    public void setAddress(String address) {
        hlhUserEntity.setAddress(address);
    }

    public String getCreateBy() {
        return hlhUserEntity.getCreateBy();
    }

    public UserType getUserType() {
        return hlhUserEntity.getUserType();
    }

    public void setId(Integer id) {
        hlhUserEntity.setId(id);
    }

    public String getNickname() {
        return hlhUserEntity.getNickname();
    }

    public String getProvince() {
        return hlhUserEntity.getProvince();
    }

    public void setBelongSalesman(Integer belongSalesman) {
        hlhUserEntity.setBelongSalesman(belongSalesman);
    }

    public void setUsername(String username) {
        hlhUserEntity.setUsername(username);
    }

    public Integer getBelongSalesman() {
        return hlhUserEntity.getBelongSalesman();
    }

    public String getPhone() {
        return hlhUserEntity.getPhone();
    }

    public void setUserType(UserType userType) {
        hlhUserEntity.setUserType(userType);
    }

    public String getWechatNo() {
        return hlhUserEntity.getWechatNo();
    }

    public String getPassword() {
        return hlhUserEntity.getPassword();
    }

    public void setWechatNo(String wechatNo) {
        hlhUserEntity.setWechatNo(wechatNo);
    }

    public String getDescription() {
        return hlhUserEntity.getDescription();
    }

    public void setUpdateBy(String updateBy) {
        hlhUserEntity.setUpdateBy(updateBy);
    }

    public void setStatus(Status status) {
        hlhUserEntity.setStatus(status);
    }

    public void setUpdateTime(Date updateTime) {
        hlhUserEntity.setUpdateTime(updateTime);
    }

    public String getEmail() {
        return hlhUserEntity.getEmail();
    }

    public void setCity(String city) {
        hlhUserEntity.setCity(city);
    }

    public void setCreateTime(Date createTime) {
        hlhUserEntity.setCreateTime(createTime);
    }

    public String getCity() {
        return hlhUserEntity.getCity();
    }

    public void setCardNo(String cardNo) {
        hlhUserEntity.setCardNo(cardNo);
    }

    public void setDescription(String description) {
        hlhUserEntity.setDescription(description);
    }

    public void setBelongFirstDistribution(Integer belongFirstDistribution) {
        hlhUserEntity.setBelongFirstDistribution(belongFirstDistribution);
    }

    public void setNickname(String nickname) {
        hlhUserEntity.setNickname(nickname);
    }

    public String getCardNo() {
        return hlhUserEntity.getCardNo();
    }

    public String getRealname() {
        return hlhUserEntity.getRealname();
    }
}
