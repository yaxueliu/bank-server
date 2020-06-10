package com.citicbank.common.exception;

/**
 * Request Validation Exception
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
public class ValidationException extends RuntimeException {

  private static final long serialVersionUID = 4175710831959517879L;

  public ValidationException() {
  }

  public ValidationException(String message) {
    super(message);
  }

  public ValidationException(String message, Throwable cause) {
    super(message, cause);
  }

  public ValidationException(Throwable cause) {
    super(cause);
  }

  public ValidationException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
