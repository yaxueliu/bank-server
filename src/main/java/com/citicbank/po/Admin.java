package com.citicbank.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 管理员信息
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
@ApiModel(value = "管理员信息实例")
public class Admin {

  /**
   * Admin ID
   */
  @ApiModelProperty(value = "Admin ID")
  private Long adminId;

  /**
   * Admin登录名称
   */
  @ApiModelProperty(value = "Admin登录名称")
  private String adminLoginName;

  /**
   * 管理员密码
   */
  @ApiModelProperty(value = "管理员密码")
  private String adminPassword;

  /**
   * 真实姓名
   */
  @ApiModelProperty(value = "真实姓名")
  private String adminRealName;

  /**
   * 管理员编号
   */
  @ApiModelProperty(value = "管理员编号")
  private Integer adminNumber;

  public Admin setAdminId(Long adminId) {
    this.adminId = adminId;
    return this;
  }

  public Admin setAdminLoginName(String adminLoginName) {
    this.adminLoginName = adminLoginName;
    return this;
  }

  public Admin setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
    return this;
  }

  public Admin setAdminRealName(String adminRealName) {
    this.adminRealName = adminRealName;
    return this;
  }

  public Admin setAdminNumber(Integer adminNumber) {
    this.adminNumber = adminNumber;
    return this;
  }

  public Long getAdminId() {
    return adminId;
  }

  public String getAdminLoginName() {
    return adminLoginName;
  }

  public String getAdminPassword() {
    return adminPassword;
  }

  public String getAdminRealName() {
    return adminRealName;
  }

  public Integer getAdminNumber() {
    return adminNumber;
  }
}
