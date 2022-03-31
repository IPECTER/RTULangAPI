package com.github.ipecter.rtu.langAPI.tool;

import java.io.*;


public class MakeCode {

    public static void main(String[] args) throws IOException {
            genLangCode();
            genEntityCode();
            genItemCode();

    }


    private static void genLangCode() throws IOException {
        File folder = new File("optimizedLangs/");
        File[] langs = folder.listFiles();
        File output = new File("lang.txt");
        PrintWriter writer = new PrintWriter(output, "UTF-8");
        if (langs != null)
            for (File file : langs) {
                if (file.isFile())
                    writer.println(getLangCode(file));
            }
        writer.close();

    }

    private static String getLangCode(File file) {
        StringBuilder code = new StringBuilder();
        String name = file.getName().replaceAll(".lang", "");
        code.append(name.toUpperCase());
        code.append("(");
        code.append("\"").append(name).append("\"");
        code.append(", new HashMap<String, String>()),");
        return code.toString();
    }

    public static void genEntityCode() throws IOException {
        File langFile = new File("optimizedLangs/en_us.lang");
        BufferedReader reader = new BufferedReader(new FileReader(langFile));
        File output = new File("entity.txt");
        PrintWriter writer = new PrintWriter(output, "UTF-8");
        String temp = reader.readLine();
        while (temp != null) {
            if (temp.contains("=")) {
                String[] tempStringArr = temp.split("=");
                if (tempStringArr[0].startsWith("entity."))
                    writer.println(getEntityCode(tempStringArr[0], tempStringArr[1]));
            }
            temp = reader.readLine();
        }
        writer.close();
        reader.close();
    }

    private static String getEntityCode(String unlocalized, String name) {
        return name.replaceAll(" ", "_").toUpperCase() + "(EntityType." + " , " + "\"" + unlocalized + "\"" + "),";
    }

    public static void genItemCode() throws IOException {
        File langFile = new File("optimizedLangs/en_us.lang");
        BufferedReader reader = new BufferedReader(new FileReader(langFile));
        File output = new File("item.txt");
        PrintWriter writer = new PrintWriter(output, "UTF-8");
        String temp = reader.readLine();
        while (temp != null) {
            if (temp.contains("=")) {
                String[] tempStringArr = temp.split("=");
                if (tempStringArr[0].startsWith("item."))
                    writer.println(getItemCode(tempStringArr[0], tempStringArr[1]));
            }
            temp = reader.readLine();
        }
        writer.close();
        reader.close();
    }

    private static String getItemCode(String unlocalized, String name) {
        StringBuilder code = new StringBuilder();
        code.append(name.replaceAll(" ", "_").toUpperCase());
        code.append("(Material.").append(" ,").append("\"").append(unlocalized).append("\"").append("),");
        return code.toString();
    }
}
