package fileandcatalog;

import java.io.File;
import java.io.IOException;
import java.util.Date;

class Main {
    public static void main(String[] args) {

        try {
            File catalog = new File("something"+File.separator+"php"+File.separator+"mysql");
            System.out.println("Catalog exist? " + catalog.isDirectory());
            catalog.mkdirs();

            File file2 = new File("something"+File.separator+"php"+File.separator+"mysql", "lesson1.txt");
            if (!file2.exists()){
                file2.createNewFile();
            }

            File file = new File("test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println("------------");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath());
            System.out.println("-------------");

            System.out.println("Can write? " + file.canWrite());
            System.out.println("Can execute? " + file.canExecute());
            System.out.println("Can read? " + file.canRead());
            System.out.println("Is hidden? " + file.isHidden());
            System.out.println("Is file? " + file.isFile());
            System.out.println("Last modified " + new Date(file.lastModified()));
            System.out.println("Lenght file with byte " + file.length());

            System.out.println("-------------");
            Main.writeAllPath(new File(System.getProperty("user.dir")));


            //System.out.println("***************");
            //System.out.println(file.list());
            //file.delete();

        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //System.out.println(System.getProperty("user.dir"));
        //System.out.println(System.getProperty("user.home"));
        //System.out.println(System.getProperty("java.home"));
    }

    public static void writeAllPath(File namePath){
        String [] nameFileAndDirectory = namePath.list();
        //System.out.println(namePath.getPath());
        for (int i = 0; i<nameFileAndDirectory.length; i++){
            File p = new File(namePath.getPath(), nameFileAndDirectory[i]);

            //if (p.isFile()){ //aby znaleźć tylko pliki
            //System.out.println(p.getPath());
            //}
            if (p.isDirectory()){
                System.out.println(p.getPath());
                writeAllPath(new File(p.getPath()));
            }
        }
    }
}
