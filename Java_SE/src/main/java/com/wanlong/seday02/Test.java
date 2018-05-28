package com.wanlong.seday02;

/**
 * www.baidu.com/index.html
 *
 *
 *
 * 解析HTTP请求中的请求行信息
 * 请求行格式:
 * method uri protocol-version
 * 方法 资源路径 协议版本
 *
 * 例如:
 * GET /index.html HTTP/1.1
 *
 *
 *
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String method;
        String uri;
        String protocol;

        String request = "GET /reg?username=fanchuanqi&password=123456 HTTP/1.1";

        String[] data = request.split("\\s");
        method = data[0];
        uri = data[1];
        protocol = data[2];
        System.out.println("method:"+method);
        System.out.println("uri:"+uri);
        System.out.println("protocol:"+protocol);

        parseUri(uri);
    }

    public static void parseUri(String uri){
        /**
         * /reg?username=fanchuanqi&password=123456;
         * loc:/reg
         * username:fanchuanqi
         * password:123456
         */
        //1先按照?拆分
        String[] data = uri.split("\\?");
        System.out.println("loc:"+data[0]);

        //2按照&拆分所有参数
        data = data[1].split("&");
        for(int i=0;i<data.length;i++){
            //将每一个参数按照=拆分
            String[] arr = data[i].split("=");
            System.out.println(arr[0]+":"+arr[1]);
        }
    }
}
