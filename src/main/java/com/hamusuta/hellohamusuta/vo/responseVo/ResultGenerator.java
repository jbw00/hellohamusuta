package com.hamusuta.hellohamusuta.vo.responseVo;

/**
 * <pre>请求响应结果构建类</pre>
 *
 * @author Floki
 */
public class ResultGenerator {

    /**
     * 构建请求成功的响应信息
     *
     * @param data 响应数据
     * @return 响应结果
     */
    public static ResponseResult generatorSuccess(Object data) {
        return generatorSuccess().setData(data);
    }

    /**
     * 构建请求成功的响应信息
     *
     * @return 响应结果
     */
    public static ResponseResult generatorSuccess() {
        return generator(CoreStatus.SUCCESS);
    }

    /**
     * 构建请求失败的响应信息
     *
     * @param status 失败的响应状态
     * @param data 响应数据
     * @return 响应结果
     */
    public static ResponseResult generatorFail(Status status, Object data) {
        return generatorFail(status).setData(data);
    }

    /**
     * 构建请求失败的响应信息
     *
     * @param status 失败的响应状态
     * @return 响应结果
     */
    public static ResponseResult generatorFail(Status status) {
        return generator(status);
    }
    
    /**
     * 构建请求失败的响应信息
     * @param code
     * @param message
     * @param data
     * @return
     */
    public static ResponseResult generatorFail(Integer code, String message, Object data) {
        return new ResponseResult().error(code, message, data);
    }
    
    /**
     * 构建请求失败的响应信息
     * @param code
     * @param message
     * @return
     */
    public static ResponseResult generatorFail(Integer code, String message) {
        return new ResponseResult().error(code, message, null);
    }

    /**
     * 构建请求响应信息
     *
     * @param status 响应状态
     * @return 响应结果
     */
    private static ResponseResult generator(Status status) {
        return new ResponseResult().setStatus(status);
    }
}
