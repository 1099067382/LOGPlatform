package com.example.logplatform.service.ex;

public class OrderItemDeniedException extends ServiceException{
    public OrderItemDeniedException() {
        super();
    }

    public OrderItemDeniedException(String message) {
        super(message);
    }

    public OrderItemDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderItemDeniedException(Throwable cause) {
        super(cause);
    }

    protected OrderItemDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
