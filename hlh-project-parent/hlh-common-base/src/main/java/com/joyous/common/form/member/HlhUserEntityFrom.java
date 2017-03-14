package com.joyous.common.form.member;

import com.joyous.common.constant.Status;
import com.joyous.common.constant.UserType;
import com.joyous.common.entity.Paging;
import com.joyous.common.entity.member.HlhUserEntity;
import com.joyous.common.form.Form;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by hebo on 2017/3/8.
 */
public class HlhUserEntityFrom implements Serializable, Form {
    private static final long serialVersionUID = -3146655753733862530L;

    private HlhUserEntity hlhUserEntity = new HlhUserEntity();
    private Paging paging = new Paging();

    public HlhUserEntity getHlhUserEntity() {
        return hlhUserEntity;
    }

    public void setHlhUserEntity(HlhUserEntity hlhUserEntity) {
        this.hlhUserEntity = hlhUserEntity;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public Integer getId() {
        return hlhUserEntity.getId();
    }

    public void setPhone(String phone) {
        hlhUserEntity.setPhone(phone);
    }

    public void setEmail(String email) {
        hlhUserEntity.setEmail(email);
    }

    public void setUpdateBy(String updateBy) {
        hlhUserEntity.setUpdateBy(updateBy);
    }

    public String getAddress() {
        return hlhUserEntity.getAddress();
    }

    public void setStatus(Status status) {
        hlhUserEntity.setStatus(status);
    }

    public String getNickname() {
        return hlhUserEntity.getNickname();
    }

    public void setCity(String city) {
        hlhUserEntity.setCity(city);
    }

    public void setCreateBy(String createBy) {
        hlhUserEntity.setCreateBy(createBy);
    }

    public String getPhone() {
        return hlhUserEntity.getPhone();
    }

    public String getDescription() {
        return hlhUserEntity.getDescription();
    }

    public String getDistrict() {
        return hlhUserEntity.getDistrict();
    }

    public void setWechatNo(String wechatNo) {
        hlhUserEntity.setWechatNo(wechatNo);
    }

    public Integer getBelongSalesman() {
        return hlhUserEntity.getBelongSalesman();
    }

    public void setBelongSalesman(Integer belongSalesman) {
        hlhUserEntity.setBelongSalesman(belongSalesman);
    }

    public Status getStatus() {
        return hlhUserEntity.getStatus();
    }

    public void setAddress(String address) {
        hlhUserEntity.setAddress(address);
    }

    public void setUsername(String username) {
        hlhUserEntity.setUsername(username);
    }

    public String getWechatNo() {
        return hlhUserEntity.getWechatNo();
    }

    public String getProvince() {
        return hlhUserEntity.getProvince();
    }

    public String getCreateBy() {
        return hlhUserEntity.getCreateBy();
    }

    public String getUpdateBy() {
        return hlhUserEntity.getUpdateBy();
    }

    public Integer getBelongFirstDistribution() {
        return hlhUserEntity.getBelongFirstDistribution();
    }

    public void setCreateTime(Date createTime) {
        hlhUserEntity.setCreateTime(createTime);
    }

    public Date getCreateTime() {
        return hlhUserEntity.getCreateTime();
    }

    public void setNickname(String nickname) {
        hlhUserEntity.setNickname(nickname);
    }

    public void setRealname(String realname) {
        hlhUserEntity.setRealname(realname);
    }

    public void setDescription(String description) {
        hlhUserEntity.setDescription(description);
    }

    public String getRealname() {
        return hlhUserEntity.getRealname();
    }

    public void setUserType(UserType userType) {
        hlhUserEntity.setUserType(userType);
    }

    public void setUpdateTime(Date updateTime) {
        hlhUserEntity.setUpdateTime(updateTime);
    }

    public void setProvince(String province) {
        hlhUserEntity.setProvince(province);
    }

    public String getEmail() {
        return hlhUserEntity.getEmail();
    }

    public String getCardNo() {
        return hlhUserEntity.getCardNo();
    }

    public String getUsername() {
        return hlhUserEntity.getUsername();
    }

    public void setDistrict(String district) {
        hlhUserEntity.setDistrict(district);
    }

    public void setPassword(String password) {
        hlhUserEntity.setPassword(password);
    }

    public UserType getUserType() {
        return hlhUserEntity.getUserType();
    }

    public Date getUpdateTime() {
        return hlhUserEntity.getUpdateTime();
    }

    public void setId(Integer id) {
        hlhUserEntity.setId(id);
    }

    public String getCity() {
        return hlhUserEntity.getCity();
    }

    public void setBelongFirstDistribution(Integer belongFirstDistribution) {
        hlhUserEntity.setBelongFirstDistribution(belongFirstDistribution);
    }

    public void setCardNo(String cardNo) {
        hlhUserEntity.setCardNo(cardNo);
    }

    public String getPassword() {
        return hlhUserEntity.getPassword();
    }

    public int getPage() {
        return paging.getPage();
    }

    public int getRows() {
        return paging.getRows();
    }

    public void setRowsByCustom(int customRows) {
        paging.setRowsByCustom(customRows);
    }

    public void setRecords(int records) {
        paging.setRecords(records);
    }

    public void setTotal(int total) {
        paging.setTotal(total);
    }

    public void countRecords(int records) {
        paging.countRecords(records);
    }

    public String getSidx() {
        return paging.getSidx();
    }

    public void setSidx(String sidx) {
        paging.setSidx(sidx);
    }

    public int getTotal() {
        return paging.getTotal();
    }

    public void setPage(int page) {
        paging.setPage(page);
    }

    public int getStartRow() {
        return paging.getStartRow();
    }

    public void setRows(int rows) {
        paging.setRows(rows);
    }

    public int getRecords() {
        return paging.getRecords();
    }

    public int getEndRow() {
        return paging.getEndRow();
    }

    public void setSord(String sord) {
        paging.setSord(sord);
    }

    public String getSord() {
        return paging.getSord();
    }
}
