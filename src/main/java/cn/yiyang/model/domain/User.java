package cn.yiyang.model.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: Administrator
 * @Date: 2018/10/13 16:50
 * @Description:
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private String userId;
    //
    private String userCompany;
    //
    private String userName;
    //
    private Date createtime;
    //
    private Integer checked;
    //
    private String remark1;
    //
    private String remark2;

    /**
     * 设置：
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * 获取：
     */
    public String getUserId() {
        return userId;
    }
    /**
     * 设置：
     */
    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }
    /**
     * 获取：
     */
    public String getUserCompany() {
        return userCompany;
    }
    /**
     * 设置：
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * 获取：
     */
    public String getUserName() {
        return userName;
    }
    /**
     * 设置：
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    /**
     * 获取：
     */
    public Date getCreatetime() {
        return createtime;
    }
    /**
     * 设置：
     */
    public void setChecked(Integer checked) {
        this.checked = checked;
    }
    /**
     * 获取：
     */
    public Integer getChecked() {
        return checked;
    }
    /**
     * 设置：
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }
    /**
     * 获取：
     */
    public String getRemark1() {
        return remark1;
    }
    /**
     * 设置：
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }
    /**
     * 获取：
     */
    public String getRemark2() {
        return remark2;
    }
}

