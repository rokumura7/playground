package flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/flyweight/char/big" + charname + ".txt"));) {
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line).append("\n");
            }
            this.fontdata = buf.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            this.fontdata = charname + "?";
            e.printStackTrace();
        }
    }
    public void print() {
        System.out.println(fontdata);
    }
}
