package com.citicbank.dao;

import com.citicbank.po.Account;
import com.citicbank.query.AccountQuery;
import com.citicbank.vo.AccountView;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Account DAO
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
@Mapper
@Repository
public interface AccountMapper {

  /**
   * 新增Account
   *
   * @param account {@link Account}实例
   * @return 修改表数量
   */
  int insert(Account account);

  /**
   * 删除Account
   *
   * @param accountId Account ID
   * @return 修改表数量
   */
  int delete(Long accountId);

  /**
   * 修改account信息
   *
   * @param account {@link Account}实例
   * @return 修改表数量
   */
  int update(Account account);

  /**
   * 通过ID获取account实例
   *
   * @param accountId Account ID
   * @return {@link Account}实例
   */
  Account getById(Long accountId);

  /**
   * 通过身份证号获取Account实例
   *
   * @param idCard 身份证号
   * @return {@link Account}实例
   */
  Account getByIdCard(String idCard);

  /**
   * 按条件查询account列表
   *
   * @param accountQuery {@link AccountQuery}实例
   * @return {@link AccountView}实例列表
   */
  List<AccountView> list(AccountQuery accountQuery);

  /**
   * 按条件查询account count
   *
   * @param accountQuery {@link AccountQuery}实例
   * @return 查询数量
   */
  int count(AccountQuery accountQuery);
}