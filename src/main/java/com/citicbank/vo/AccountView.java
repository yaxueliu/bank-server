package com.citicbank.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Liu YaXue
 * @since 1.0.0
 */
public class AccountView {

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
   * 手机号码
   */
  @ApiModelProperty(value = "手机号码")
  private String accountPhone;

  /**
   * 地址
   */
  @ApiModelProperty(value = "地址")
  private String accountAddress;


  public AccountView setAccountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  public AccountView setIdCard(String idCard) {
    this.idCard = idCard;
    return this;
  }

  public AccountView setAccountRealName(String accountRealName) {
    this.accountRealName = accountRealName;
    return this;
  }

  public AccountView setAccountPhone(String accountPhone) {
    this.accountPhone = accountPhone;
    return this;
  }

  public AccountView setAccountAddress(String accountAddress) {
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

  public String getAccountPhone() {
    return accountPhone;
  }

  public String getAccountAddress() {
    return accountAddress;
  }
}
