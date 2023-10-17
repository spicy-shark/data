package tools;

import java.io.*;

public class IODemo {

  public static void main(String[] args) throws IOException {
    IODemo ioDemo = new IODemo();
    ioDemo.readDemo();
  }

  void writeDemo() throws IOException {
    FileOutputStream fileOutputStream = new FileOutputStream("javaDemo/src/tools/output.txt");
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
    bufferedOutputStream.write("output-test".getBytes());
    bufferedOutputStream.close();
  }

  void readDemo() throws IOException {
    FileReader fileReader = new FileReader("javaDemo/src/tools/output.txt");
    char[] chars = new char[fileReader.read()];
    fileReader.read(chars);
    System.out.println(String.copyValueOf(chars));
  }
}
