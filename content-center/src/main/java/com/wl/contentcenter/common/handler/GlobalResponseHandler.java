package com.wl.contentcenter.common.handler;


import com.wl.contentcenter.common.result.RestResult;
import com.wl.contentcenter.common.result.RestResultBuilder;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @program: client_api
 * @description: 全局返回定义
 * @author: wl
 * @created: 2020/07/08 16:03
 */
@RestControllerAdvice(annotations = RestController.class)
public class GlobalResponseHandler implements ResponseBodyAdvice {


    /**
     * 此处如果返回false , 则不执行当前Advice的业务
     */
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    /**
     * 处理响应的具体方法
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof RestResult) {
            return body;
            //修改包装
        } else if (returnType.getParameterType()==String.class){
            return body;
        }else {

            return new RestResultBuilder<>().success(body);
        }
    }
}
