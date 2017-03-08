package com.joyous.common.request;

import com.joyous.common.constant.Status;
import com.joyous.common.constant.UserType;
import com.joyous.common.entity.Dto;
import com.joyous.common.entity.member.HlhUserEntity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by hebo on 2017/3/8.
 */
public class HlhUserRequest implements Serializable,Dto {
    private static final long serialVersionUID = 3517726678569264739L;

    public HlhUserRequest(){}
    public HlhUserRequest(HlhUserEntity hlhUserEntity){
        this.hlhUserEntity = hlhUserEntity;
    }

    private HlhUserEntity hlhUserEntity;

    public HlhUserEntity getHlhUserEntity() {
        return hlhUserEntity;
    }

    public void setHlhUserEntity(HlhUserEntity hlhUserEntity) {
        this.hlhUserEntity = hlhUserEntity;
    }

    public String getPhone() {
        return hlhUserEntity.getPhone();
    }

    public String getWechatNo() {
        return hlhUserEntity.getWechatNo();
    }

    public void setUpdateTime(Date updateTime) {
        hlhUserEntity.setUpdateTime(updateTime);
    }

    public Date getUpdateTime() {
        return hlhUserEntity.getUpdateTime();
    }

    public void setUpdateBy(String updateBy) {
        hlhUserEntity.setUpdateBy(updateBy);
    }

    public void setPhone(String phone) {
        hlhUserEntity.setPhone(phone);
    }

    public Integer getBelongFirstDistribution() {
        return hlhUserEntity.getBelongFirstDistribution();
    }

    public String getEmail() {
        return hlhUserEntity.getEmail();
    }

    public void setProvince(String province) {
        hlhUserEntity.setProvince(province);
    }

    public void setBelongSalesman(Integer belongSalesman) {
        hlhUserEntity.setBelongSalesman(belongSalesman);
    }

    public void setDistrict(String district) {
        hlhUserEntity.setDistrict(district);
    }

    public Integer getBelongSalesman() {
        return hlhUserEntity.getBelongSalesman();
    }

    public String getCity() {
        return hlhUserEntity.getCity();
    }

    public void setUsername(String username) {
        hlhUserEntity.setUsername(username);
    }

    public String getPassword() {
        return hlhUserEntity.getPassword();
    }

    public void setCreateBy(String createBy) {
        hlhUserEntity.setCreateBy(createBy);
    }

    public void setUserType(UserType userType) {
        hlhUserEntity.setUserType(userType);
    }

    public void setAddress(String address) {
        hlhUserEntity.setAddress(address);
    }

    public String getDescription() {
        return hlhUserEntity.getDescription();
    }

    public void setDescription(String description) {
        hlhUserEntity.setDescription(description);
    }

    public String getUsername() {
        return hlhUserEntity.getUsername();
    }

    public void setCity(String city) {
        hlhUserEntity.setCity(city);
    }

    public String getProvince() {
        return hlhUserEntity.getProvince();
    }

    public String getCardNo() {
        return hlhUserEntity.getCardNo();
    }

    public Status getStatus() {
        return hlhUserEntity.getStatus();
    }

    public void setCreateTime(Date createTime) {
        hlhUserEntity.setCreateTime(createTime);
    }

    public String getNickname() {
        return hlhUserEntity.getNickname();
    }

    public String getCreateBy() {
        return hlhUserEntity.getCreateBy();
    }

    public void setWechatNo(String wechatNo) {
        hlhUserEntity.setWechatNo(wechatNo);
    }

    public Date getCreateTime() {
        return hlhUserEntity.getCreateTime();
    }

    public String getDistrict() {
        return hlhUserEntity.getDistrict();
    }

    public String getUpdateBy() {
        return hlhUserEntity.getUpdateBy();
    }

    public void setRealname(String realname) {
        hlhUserEntity.setRealname(realname);
    }

    public void setCardNo(String cardNo) {
        hlhUserEntity.setCardNo(cardNo);
    }

    public void setBelongFirstDistribution(Integer belongFirstDistribution) {
        hlhUserEntity.setBelongFirstDistribution(belongFirstDistribution);
    }

    public void setEmail(String email) {
        hlhUserEntity.setEmail(email);
    }

    public String getAddress() {
        return hlhUserEntity.getAddress();
    }

    public void setId(Integer id) {
        hlhUserEntity.setId(id);
    }

    public void setNickname(String nickname) {
        hlhUserEntity.setNickname(nickname);
    }

    public void setStatus(Status status) {
        hlhUserEntity.setStatus(status);
    }

    public void setPassword(String password) {
        hlhUserEntity.setPassword(password);
    }

    public UserType getUserType() {
        return hlhUserEntity.getUserType();
    }

    public String getRealname() {
        return hlhUserEntity.getRealname();
    }

    @Override
    public Integer getId() {
        return hlhUserEntity.getId();
    }
}
