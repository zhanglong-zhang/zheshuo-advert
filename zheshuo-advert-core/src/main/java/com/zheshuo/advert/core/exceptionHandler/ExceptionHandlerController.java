package com.zheshuo.advert.core.exceptionHandler;

import com.zheshuo.advert.core.common.OutputDTO;

import com.zheshuo.advert.core.exception.BizException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * created by zhanglong and since  2019/12/12  10:57 上午
 * @description: 描述
 */
@ControllerAdvice("com.zheshuo.advert.controller")
public class ExceptionHandlerController {
    /**
     * description BizException业务异常响应
     */
    @ResponseBody
    @ExceptionHandler({BizException.class}) //指定拦截异常的类型
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) //自定义浏览器返回状态码
    public OutputDTO<?> customExceptionHandler( BizException e ) {
        return new OutputDTO<>().fail(e.getMessage());
    }

}
