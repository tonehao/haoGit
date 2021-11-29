package com.baomidou.entity;


import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * tsm_staff (人员表); InnoDB free: 7168 kB
 * </p>
 *
 *@author Admin
 * @since 2021-11-29
 */
@TableName("tsm_staff")
public class TsmStaff extends Model<TsmStaff> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("id_")
   private Long id;
    /**
     * 登录账号
     */
   private String account;
    /**
     * 登录密码
     */
   private String password;
    /**
     * 姓名
     */
   @TableField("user_name")
   private String userName;
    /**
     * 性别，0男，1女，2其他
     */
   private Integer sex;
    /**
     * 身份证号码
     */
   @TableField("id_card")
   private String idCard;
    /**
     * 角色ID
     */
   @TableField("role_id")
   private Long roleId;
    /**
     * 手机号码
     */
   private String phone;
    /**
     * 状态 1.正常 0.冻结 2.离职
     */
   private Integer status;
    /**
     * 省份
     */
   private String province;
    /**
     * 城市
     */
   private String city;
    /**
     * 入职时间
     */
   @TableField("entry_date")
   private Date entryDate;
    /**
     * 离职时间
     */
   @TableField("leave_date")
   private Date leaveDate;
    /**
     * 工作邮箱
     */
   private String email;
    /**
     * 上级Id
     */
   @TableField("leader_id")
   private Long leaderId;
    /**
     * 是否为管理账号 1.是 0.否
     */
   @TableField("is_admin")
   private Integer isAdmin;
    /**
     * 最近修改时间
     */
   @TableField("change_date")
   private Date changeDate;
    /**
     * 人员唯一标识
     */
   @TableField("change_by")
   private Long changeBy;
    /**
     * 创建时间
     */
   @TableField("create_date")
   private Date createDate;
    /**
     * 创建人
     */
   @TableField("create_by")
   private Long createBy;
    /**
     * 是否有效 默认 1. 有效 0.无效
     */
   @TableField("is_active")
   private Integer isActive;
    /**
     * (人员类别：0门店,1商户,2.内部人员)
     */
   private Integer category;
    /**
     * (是否设置用户权限1：是，0：否)
     */
   @TableField("is_setting_role")
   private Integer isSettingRole;


   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getAccount() {
      return account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public Integer getSex() {
      return sex;
   }

   public void setSex(Integer sex) {
      this.sex = sex;
   }

   public String getIdCard() {
      return idCard;
   }

   public void setIdCard(String idCard) {
      this.idCard = idCard;
   }

   public Long getRoleId() {
      return roleId;
   }

   public void setRoleId(Long roleId) {
      this.roleId = roleId;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public Integer getStatus() {
      return status;
   }

   public void setStatus(Integer status) {
      this.status = status;
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

   public Date getEntryDate() {
      return entryDate;
   }

   public void setEntryDate(Date entryDate) {
      this.entryDate = entryDate;
   }

   public Date getLeaveDate() {
      return leaveDate;
   }

   public void setLeaveDate(Date leaveDate) {
      this.leaveDate = leaveDate;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Long getLeaderId() {
      return leaderId;
   }

   public void setLeaderId(Long leaderId) {
      this.leaderId = leaderId;
   }

   public Integer getIsAdmin() {
      return isAdmin;
   }

   public void setIsAdmin(Integer isAdmin) {
      this.isAdmin = isAdmin;
   }

   public Date getChangeDate() {
      return changeDate;
   }

   public void setChangeDate(Date changeDate) {
      this.changeDate = changeDate;
   }

   public Long getChangeBy() {
      return changeBy;
   }

   public void setChangeBy(Long changeBy) {
      this.changeBy = changeBy;
   }

   public Date getCreateDate() {
      return createDate;
   }

   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   public Long getCreateBy() {
      return createBy;
   }

   public void setCreateBy(Long createBy) {
      this.createBy = createBy;
   }

   public Integer getIsActive() {
      return isActive;
   }

   public void setIsActive(Integer isActive) {
      this.isActive = isActive;
   }

   public Integer getCategory() {
      return category;
   }

   public void setCategory(Integer category) {
      this.category = category;
   }

   public Integer getIsSettingRole() {
      return isSettingRole;
   }

   public void setIsSettingRole(Integer isSettingRole) {
      this.isSettingRole = isSettingRole;
   }

   public static final String ID_ = "id_";

   public static final String ACCOUNT = "account";

   public static final String PASSWORD = "password";

   public static final String USER_NAME = "user_name";

   public static final String SEX = "sex";

   public static final String ID_CARD = "id_card";

   public static final String ROLE_ID = "role_id";

   public static final String PHONE = "phone";

   public static final String STATUS = "status";

   public static final String PROVINCE = "province";

   public static final String CITY = "city";

   public static final String ENTRY_DATE = "entry_date";

   public static final String LEAVE_DATE = "leave_date";

   public static final String EMAIL = "email";

   public static final String LEADER_ID = "leader_id";

   public static final String IS_ADMIN = "is_admin";

   public static final String CHANGE_DATE = "change_date";

   public static final String CHANGE_BY = "change_by";

   public static final String CREATE_DATE = "create_date";

   public static final String CREATE_BY = "create_by";

   public static final String IS_ACTIVE = "is_active";

   public static final String CATEGORY = "category";

   public static final String IS_SETTING_ROLE = "is_setting_role";

   @Override
   protected Serializable pkVal() {
      return this.id;
   }

   @Override
   public String toString() {
      return "TsmStaff{" +
         ", id=" + id +
         ", account=" + account +
         ", password=" + password +
         ", userName=" + userName +
         ", sex=" + sex +
         ", idCard=" + idCard +
         ", roleId=" + roleId +
         ", phone=" + phone +
         ", status=" + status +
         ", province=" + province +
         ", city=" + city +
         ", entryDate=" + entryDate +
         ", leaveDate=" + leaveDate +
         ", email=" + email +
         ", leaderId=" + leaderId +
         ", isAdmin=" + isAdmin +
         ", changeDate=" + changeDate +
         ", changeBy=" + changeBy +
         ", createDate=" + createDate +
         ", createBy=" + createBy +
         ", isActive=" + isActive +
         ", category=" + category +
         ", isSettingRole=" + isSettingRole +
         "}";
   }
}
