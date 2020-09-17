package abstarctclassstream;

import java.io.*;

class Main4 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream; //operuje na bajtach
        OutputStream outputStream; //operuje na bajtach
        Reader reader; //operuje na znakach - maja odpowiedniki znakowe
        Writer writer = new FileWriter("nameFile.txt");//operuje na znakach - maja odpowiweniki znakowe
        writer.write("something");
        writer.write("new tekst");
        writer.close();
    }

    void nameMethod(InputStream inputStream){

    }
}
