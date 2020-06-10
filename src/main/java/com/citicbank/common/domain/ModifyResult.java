package com.citicbank.common.domain;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * Modify DataBase Result Object
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
public class ModifyResult {

  /**
   * Modify ID
   */
  private Long id;

  public ModifyResult() {
  }

  public ModifyResult(Long id) {
    this.id = id;
  }

  public ModifyResult setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ModifyResult)) {
      return false;
    }
    ModifyResult that = (ModifyResult) o;
    return Objects.equals(getId(), that.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ModifyResult.class.getSimpleName() + "[", "]")
        .add("id=" + id)
        .toString();
  }
}
