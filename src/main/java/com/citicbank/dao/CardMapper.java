package com.citicbank.dao;

import com.citicbank.po.Card;
import com.citicbank.query.CardQuery;
import com.citicbank.vo.CardView;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Card DAO
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
@Mapper
@Repository
public interface CardMapper {

  /**
   * 新增Card
   *
   * @param card {@link Card}实例
   * @return 修改表数量
   */
  int insert(Card card);

  /**
   * 删除Card
   *
   * @param cardId Card ID
   * @return 修改表数量
   */
  int delete(Long cardId);

  /**
   * 修改card信息
   *
   * @param card {@link Card}实例
   * @return 修改表数量
   */
  int update(Card card);

  /**
   * 通过ID获取card实例
   *
   * @param cardId Card ID
   * @return {@link Card}实例
   */
  Card getById(Long cardId);

  /**
   * 根据银行卡号查询银行卡信息
   *
   * @param cardNumber 银行卡号
   * @return {@link Card}实例
   */
  Card getByCardNumber(String cardNumber);

  /**
   * 按条件查询card列表
   *
   * @param cardQuery {@link CardQuery}实例
   * @return {@link Card}实例列表
   */
  List<CardView> list(CardQuery cardQuery);

}