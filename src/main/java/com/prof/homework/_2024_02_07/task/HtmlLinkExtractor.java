package com.prof.homework._2024_02_07.task;

import java.util.List;

/**
 * Разберитесь с
 * HTML-кодом и извлеките все ссылки (теги <a>) с их атрибутами href.
 */
public class HtmlLinkExtractor {
    public static List<String> extractLinks(String html) {


        return null;
    }

    public static void main(String[] args) {
        String html = "<a href=\"https://www.example.com\">Example</a> " +
                      "<a href=\"https://www.google.com\">Google</a>";
        List<String> extractedLinks = extractLinks(html);
        for (String link : extractedLinks) {
            System.out.println(link);
        }
    }
}
