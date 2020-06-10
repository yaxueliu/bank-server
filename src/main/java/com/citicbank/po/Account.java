package com.citicbank.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 银行账户信息
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
@ApiModel(value = "银行账户信息实例")
public class Account {

  /**
   * 账户ID
   */
  @ApiModelProperty(value = "账户ID")
  private Long accountId;

  /**
   * 身份证号
   */
  @ApiModelProperty(value = "身份证号")
  private String idCard;

  /**
   * 真实姓名
   */
  @ApiModelProperty(value = "真实姓名")
  private String accountRealName;

  /**
   * 密码，已加密
   */
  @ApiModelProperty(value = "密码，已加密")
  private String accountPassword;

  /**
   * 手机号码
   */
  @ApiModelProperty(value = "手机号码")
  private String accountPhone;

  /**
   * 地址
   */
  @ApiModelProperty(value = "地址")
  private String accountAddress;

  public Account() {
  }

  public Account setAccountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  public Account setIdCard(String idCard) {
    this.idCard = idCard;
    return this;
  }

  public Account setAccountRealName(String accountRealName) {
    this.accountRealName = accountRealName;
    return this;
  }

  public Account setAccountPassword(String accountPassword) {
    this.accountPassword = accountPassword;
    return this;
  }

  public Account setAccountPhone(String accountPhone) {
    this.accountPhone = accountPhone;
    return this;
  }

  public Account setAccountAddress(String accountAddress) {
    this.accountAddress = accountAddress;
    return this;
  }

  public Long getAccountId() {
    return accountId;
  }

  public String getIdCard() {
    return idCard;
  }

  public String getAccountRealName() {
    return accountRealName;
  }

  public String getAccountPassword() {
    return accountPassword;
  }

  public String getAccountPhone() {
    return accountPhone;
  }

  public String getAccountAddress() {
    return accountAddress;
  }
}