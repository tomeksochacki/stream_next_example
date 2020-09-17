package fileandcatalog;

import java.io.File;
import java.io.IOException;

class Main3 {
    public static void main(String[] args) {

        try {
            File nDirectory = new File("demoDirectory");
            if (!nDirectory.exists()){
                nDirectory.mkdir();
            }

            File nDirectory2 = new File("example1"+File.separator+"example2"+File.separator+"example3");
            if (!nDirectory2.exists()){
                nDirectory2.mkdirs();
            }

            File nFile = new File("demoFile.txt");
            if (!nFile.exists()) {
                nFile.createNewFile();
            }

            Main3.writeAllPathsN(new File(System.getProperty("user.dir")));
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void writeAllPathsN(File adressPath){
        String [] tabN = adressPath.list();
        for (int i = 0; i<tabN.length; i++){
            File n = new File(adressPath.getPath(), tabN[i]);
            System.out.println(n);
        }
    }
}
