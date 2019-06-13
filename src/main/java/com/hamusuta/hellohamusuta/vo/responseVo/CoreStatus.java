package com.hamusuta.hellohamusuta.vo.responseVo;

/**
 * <pre>定义具体 REST API 接口响应请求方状态(系统级别状态)的枚举类，实现 Status 接口。</pre>
 *
 * @author Floki
 */
public enum CoreStatus implements Status {
    /**
     * REST API 接收到请求方的请求，并成功处理返回，表示此次请求是成功的
     */
    SUCCESS(0, "操作成功")

    /**
     * 后台服务在处理请求过程中，服务内部发生了致命的或没有捕获处理的异常，导致请求方无法达到请求目的。
     * 比如：硬盘存储空间满了、内存溢出等，或者发生了空指针异常，但程序没有捕获处理
     */
    , SERVER_INTERNAL_ERROR(10100, "服务内部错误，请联系管理员")

    /** HTTP请求错误 */
    , HTTP_METHOD_ERROR(10101, "HTTP请求方法错误")

    /**
     * 方法参数类型不匹配
     */
    , METHOD_ARGUMENT_TYPE_MISMATCH(10102, "方法参数类型不匹配")

    /**
     * 请求方传递的参数有错误或者不满足服务方的规则要求。
     * 比如：传递的参数数据格式不正确等
     */
    , PARAMETER_ERROR(10103, "请求参数错误")

    /**
     * 上传文件超过限制大小。
     * 比如：系统设置上传文件大小不能超过5M，当上传文件超过5M时将会出现该异常
     */
    , UPLOAD_FILE_MORE_THAN_LIMIT_SIZE(19901, "上传文件失败：上传文件超过限制大小")

    /**
     * 上传文件失败。
     * 上传文件过程中，因其他未知原因造成文件上传失败，比如网络出现故障等
     */
    , UPLOAD_FILE_ERROR(19902, "上传文件失败：可能是因为网络出现故障")
    
    /**
     * 登录失败
     * 用户名或密码错误
     */
    , LOGIN_ERROR(10105, "用户名或密码错误")
    ;

    /**
     * 请求状态代码
     */
    private Integer code;

    /**
     * 请求状态代码的描述消息
     */
    private String message;


    /**
     * 响应状态枚举的构造类
     *
     * @param code 状态代码
     * @param message 描述消息
     */
    CoreStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
