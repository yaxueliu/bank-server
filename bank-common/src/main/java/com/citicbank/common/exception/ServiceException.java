package com.citicbank.common.exception;

/**
 * Service Exception
 *
 * @author Liu YaXue
 * @since 1.0.0
 */
public class ServiceException extends RuntimeException {

  private static final long serialVersionUID = -3845009185675207040L;

  public ServiceException() {
  }

  public ServiceException(String message) {
    super(message);
  }

  public ServiceException(String message, Throwable cause) {
    super(message, cause);
  }

  public ServiceException(Throwable cause) {
    super(cause);
  }

  public ServiceException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
