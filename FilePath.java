package com.company;

public class FilePath {
    public static void main(String[] args) {
        //Задача 3.2.Программа должна обрабатывать все строки, подобные указанным. Из пути файла в Linux
        //извлечь каталог, краткое имя и расширение: /ets/samba/smb.conf
        final String str = "/ets/samba/smb.conf";
        Fig.FileName fileLinux = new Fig.FileName(str, '/', '.');
        System.out.println("Catalog: " + fileLinux.catalog());
        System.out.println("Filename: " + fileLinux.fileName());
        System.out.println("Extension: " + fileLinux.extension());
    }
    public static class FileName {
        private String fullPath;
        private char pathSeparator, extensionSeparator;

        public FileName(String str, char sep, char ext){
            fullPath = str;
            pathSeparator = sep;
            extensionSeparator = ext;
        }
        public String extension(){
            int dot = fullPath.lastIndexOf(extensionSeparator);
            return fullPath.substring(dot + 1);
        }
        public String fileName(){
            int dot = fullPath.lastIndexOf(extensionSeparator);
            int sep = fullPath.lastIndexOf(pathSeparator);
            return fullPath.substring(sep + 1, dot);
        }
        public String catalog(){
            int sep = fullPath.lastIndexOf(pathSeparator);
            return fullPath.substring(5, sep);
        }
    }
}
