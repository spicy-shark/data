package netWorkDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.http.HttpResponse;

public class HttpServer {
  public HttpServer(){}

  public static void main(String[] args) throws Exception{
    ServerSocket serverSocket = new ServerSocket(81);

    int loop = 0;
    while (true){
      System.out.println("loop" + loop++);
      Socket socket = serverSocket.accept();
      InputStream in = socket.getInputStream();

      OutputStream os = socket.getOutputStream();
      PrintWriter writer = new PrintWriter(new OutputStreamWriter(os, "utf-8"));

      String html = "<a href='https://www.baidu.com'>百度一下</a>";
      byte[] bytes = html.getBytes("utf-8");
      int contentLength = bytes.length;
      // Content-Type: application/octet-stream;
      String response = "HTTP/1.0 200 OK\r\nContent-Type: text/html; charset=utf-8\r\nContent-Length: 49\r\n\r\n" + html;
      writer.println(response);
      writer.flush();
      socket.close();
    }
  }
}
