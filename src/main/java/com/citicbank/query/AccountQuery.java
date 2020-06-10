package com.citicbank.query;

import com.citicbank.common.domain.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 账号查询实例
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
@ApiModel(value = "账号查询实例")
public class AccountQuery extends PageQuery {

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


  public AccountQuery setIdCard(String idCard) {
    this.idCard = idCard;
    return this;
  }

  public AccountQuery setAccountRealName(String accountRealName) {
    this.accountRealName = accountRealName;
    return this;
  }

  public AccountQuery setAccountPassword(String accountPassword) {
    this.accountPassword = accountPassword;
    return this;
  }

  public AccountQuery setAccountPhone(String accountPhone) {
    this.accountPhone = accountPhone;
    return this;
  }

  public AccountQuery setAccountAddress(String accountAddress) {
    this.accountAddress = accountAddress;
    return this;
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
