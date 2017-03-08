package com.joyous.common.entity.member;

import com.joyous.common.constant.Status;
import com.joyous.common.constant.UserType;
import com.joyous.common.entity.Entity;

public class HlhUserEntity extends Entity {
    private static final long serialVersionUID = -6392087777310502315L;
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String realname;

    private String email;

    private String phone;

    private String province;

    private String city;

    private String district;

    private String address;

    private UserType userType;

    private Integer belongSalesman;

    private Integer belongFirstDistribution;

    private String wechatNo;

    private String cardNo;

    private Status status;

    private String description;

    private String updateBy;

    private String createBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Integer getBelongSalesman() {
        return belongSalesman;
    }

    public void setBelongSalesman(Integer belongSalesman) {
        this.belongSalesman = belongSalesman;
    }

    public Integer getBelongFirstDistribution() {
        return belongFirstDistribution;
    }

    public void setBelongFirstDistribution(Integer belongFirstDistribution) {
        this.belongFirstDistribution = belongFirstDistribution;
    }

    public String getWechatNo() {
        return wechatNo;
    }

    public void setWechatNo(String wechatNo) {
        this.wechatNo = wechatNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }


    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

}