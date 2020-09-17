package fileandcatalog;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.regex.Pattern;

class Main2 {
    public static void main(String[] args) {

        try {

            File catalog = new File("catalogExample" + File.separator + "nextCatalogExample" + File.separator + "nextNextCatalogExample");
            catalog.mkdirs();

            File fileExmple2 = new File("catalogExample" + File.separator + "nextCatalogExample" + File.separator + "nextNextCatalogExample", "exampleLesson.txt");
            if (!fileExmple2.exists()) {
                fileExmple2.createNewFile();
            }

            File fileExample = new File("example.txt");
            if (!fileExample.exists()) {
                fileExample.createNewFile();
            }
            System.out.println("----------------");
            System.out.println(fileExample.getPath());
            System.out.println(fileExample.getAbsolutePath());
            System.out.println(fileExample.getCanonicalPath());
            System.out.println("----------------");
            System.out.println("Can write? " + fileExample.canWrite());
            System.out.println("Can read? " + fileExample.canRead());
            System.out.println("Can execute? " + fileExample.canExecute());
            System.out.println("Is file? " + fileExample.isFile());
            System.out.println("Is hidden? " + fileExample.isHidden());
            System.out.println("Length file: " + fileExample.length());
            System.out.println("Last modified: " + new Date(fileExample.lastModified()));

            //fileExample.delete();
            fileExample.list();
            System.out.println("----------------");
            Main2.writeAllPaths(new File(System.getProperty("user.dir")));
            //Main2.writeAllPath(new File(System.getProperty("user.dir")));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //System.out.println(System.getProperty("user.home"));
        //System.out.println(System.getProperty("user.dir"));
        //System.out.println(System.getProperty("os.name"));
        //System.out.println(System.getProperty("java.home"));
    }

    public static void writeAllPaths(File namePath) {
        String[] nameFileAndCatalog = namePath.list();
        System.out.println(namePath.getPath());
        for (int i = 0; i < nameFileAndCatalog.length; i++) {
            File p = new File(namePath.getPath(), nameFileAndCatalog[i]);
            System.out.println(p.getPath());

            //if (p.isFile()) { aby znaleźć tylko pliki
            //    System.out.println(p.getPath());
            //}

            if (p.isDirectory()) {
                System.out.println(p.getPath());
                writeAllPaths(new File(p.getPath()));
            }
        }
    }

    public static void writeAllPath(File namePath) {
        String[] tab = namePath.list();
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
