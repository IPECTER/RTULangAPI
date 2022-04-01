package com.github.ipecter.rtu.langAPI.tool;

import java.io.*;


public class MakeCode {

    public static void main(String[] args) throws IOException {
            genLangCode();
            genEntityCode();
            genItemCode();
            genEnchantmentCode();

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
    public static void genEnchantmentCode() throws IOException {
        File langFile = new File("optimizedLangs/en_us.lang");
        BufferedReader reader = new BufferedReader(new FileReader(langFile));
        File output1 = new File("enchantment.txt");
        File output2 = new File("enchantmentlevel.txt");
        PrintWriter writer1 = new PrintWriter(output1, "UTF-8");
        PrintWriter writer2 = new PrintWriter(output2, "UTF-8");
        String temp = reader.readLine();
        while (temp != null) {
            if (temp.contains("=")) {
                String[] tempStringArr = temp.split("=");
                if (tempStringArr[0].startsWith("enchantment.") && !tempStringArr[0].startsWith("enchantment.level.") )
                    writer1.println(getEnchantmentCode(tempStringArr[0], tempStringArr[1]));
                else if(tempStringArr[0].startsWith("enchantment.level.")){
                    writer2.println(getEnchantmentLevelCode(tempStringArr[0]));

                }
            }
            temp = reader.readLine();
        }
        writer1.close();
        writer2.close();
        reader.close();
    }

    private static String getEnchantmentCode(String unlocalized, String name) {
        return name.replaceAll(" ", "_").toUpperCase() + "(Enchantment." + name.replaceAll(" ", "_").toUpperCase() + " , " + "\"" + unlocalized + "\"" + "),";
    }

    private static String getEnchantmentLevelCode(String unlocalized) {
        return "LEVEL"+unlocalized.replaceAll(" ", "_").replace("enchantment.level.", "") + "(" + unlocalized.replaceAll(" ", "_").replace("enchantment.level.", "") + " , " + "\"" + unlocalized + "\"" + "),";
    }
}
