package com.citicbank.service;

import com.citicbank.common.domain.ModifyResult;
import com.citicbank.common.domain.Page;
import com.citicbank.po.Admin;
import com.citicbank.query.AdminQuery;
import com.citicbank.vo.AdminView;
import java.util.List;

/**
 * Admin Service
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
public interface AdminService {

  /**
   * 新增Admin
   *
   * @param admin {@link Admin}实例
   * @return 修改表数量
   */
  ModifyResult insert(Admin admin);

  /**
   * 删除Admin
   *
   * @param adminId Admin ID
   * @return 修改表数量
   */
  ModifyResult delete(Long adminId);

  /**
   * 修改admin信息
   *
   * @param admin {@link Admin}实例
   * @return 修改表数量
   */
  ModifyResult update(Admin admin);

  /**
   * 通过ID获取admin实例
   *
   * @param adminId Admin ID
   * @return {@link Admin}实例
   */
  Admin getById(Long adminId);

  /**
   * 通过登录名称获取Admin实例
   *
   * @param adminLoginName 登录名称
   * @return {@link Admin}实例
   */
  Admin getByLoginName(String adminLoginName);

  /**
   * 按条件查询admin列表
   *
   * @param adminQuery {@link AdminQuery}实例
   * @return {@link AdminView}实例列表
   */
  List<AdminView> list(AdminQuery adminQuery);

  /**
   * 按条件查询admin列表
   *
   * @param adminQuery {@link AdminQuery}实例
   * @return {@link AdminView}实例列表
   */
  Page<AdminView> page(AdminQuery adminQuery);

  /**
   * 管理员确认
   *
   * @param admin {@link Admin}实例
   * @return 确认成功
   */
  Boolean confirm(Admin admin);
}
