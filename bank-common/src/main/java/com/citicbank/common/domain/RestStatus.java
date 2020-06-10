package com.citicbank.common.domain;

/**
 * RESTful Status
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
public enum RestStatus {

  /**
   * OK.
   */
  OK(2000, "OK."),

  /**
   * CREATE SUCCESS.
   */
  CREATE_SUCCESS(2001, "CREATE SUCCESS."),

  /**
   * DELETE SUCCESS.
   */
  DELETE_SUCCESS(2002, "DELETE SUCCESS."),

  /**
   * UPDATE SUCCESS.
   */
  UPDATE_SUCCESS(2003, "UPDATE SUCCESS."),

  /**
   * VALIDATION FAILED.
   */
  VALIDATION_FAILED(4001, "VALIDATION FAILED."),

  /**
   * Server Error.
   */
  ERROR(5000, "Server Error."),

  /**
   * SERVICE ERROR.
   */
  SERVICE_ERROR(5001, "SERVICE ERROR.");

  /**
   * Response Result Status
   */
  private int status;

  /**
   * Response Result Message
   */
  private String message;

  RestStatus(int status, String message) {
    this.status = status;
    this.message = message;
  }

  public int getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }
}
