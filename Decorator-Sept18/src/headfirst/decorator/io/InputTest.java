package headfirst.decorator.io;

import java.io.*;

public class InputTest {
  public static void main(String[] args) throws IOException {
    int c;

    if (args.length == 1) {

      try {
        InputStream in =
          new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(
            args[0])));

        while ((c = in.read()) >= 0) {
          System.out.print((char) c);
        }

        in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
