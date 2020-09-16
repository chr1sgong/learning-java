package io.chr1s.netty;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gongqi
 * @since 2019-09-04
 */
public class ServerSocketDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9527);
        // 一直阻塞到一个连接创建
        Socket clientSocket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String request, response;

        while ((request = in.readLine()) != null) {
            if (StringUtils.equals(request, "Done")) {
                break;
            }
            // 请求被传递给服务器的处理方法
            response = processRequest(request);
            out.print(response);
        }
    }

    private static String processRequest(String request) {
        return request;
    }
}
