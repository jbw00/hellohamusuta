package com.hamusuta.hellohamusuta.vo.responseVo;

/**
 * <pre>定义响应状态规范的接口。</pre>
 * <pre>在后台服务以 REST API 形式提供服务接口的模式下，除非后台服务下线或宕机，其他任何情况，后台服务都必须响应请求方。</pre>
 *
 * <pre>
 * 通常情况下，后台服务在响应请求中，设置标准的 HTTP Status Code，绝大部分请求方都能理解收到的 Http 状态码，
 * 作为提供 REST API 接口的服务方，希望能够尽可能的规范服务响应信息，能提供更多的信息给请求方，便于请求方快速、便捷、高效的使用 REST API 接口
 * 但是，标准的 HTTP 状态码不可能定义所有的状态码来满足各种的服务需求，对此，定义本接口的目的是希望尽可能的规范服务方的响应消息。
 * </pre>
 *
 * <pre>
 * 本接口主要有以下方法：
 * getCode() 返回请求状态代码，由服务方自行确定
 * getMessage() 返回请求状态代码的描述消息，由服务方自行确定
 * </pre>
 *
 * @author Floki
 */
public interface Status {
    /**
     * 返回请求状态代码
     *
     * @return 当前请求状态代码。比如201005等等之类的，由服务方自行确定
     */
    Integer getCode();

    /**
     * 返回请求状态代码的描述消息
     *
     * @return 当前请求状态代码的描述消息。比如：用户名或者密码错误等等之类的，由服务方自行确定
     */
    String getMessage();

    /**
     * 设置自定义的状态描述消息
     *
     * @param message 自定义的状态描述消息
     */
    void setMessage(String message);

}
