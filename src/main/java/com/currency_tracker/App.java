package com.currency_tracker;

// import org.jsoup.Jsoup;
// import org.jsoup.nodes.Document;

// import lombok.SneakyThrows;

public class App {
    public static void main(String[] args) {
        // String url = "https://www.cbr.ru/scripts/XML_daily.asp";
        // Document page = Jsoup.connect(url).timeout(5000).get();
        // var elements = page.select("html > body > div.pretty-print >
        // div#folder0.folder > div.line > span.html-tag");
        // System.out.println(elements);

        if (args.length > 0) {
            if (args[0].equals("-h")) {
                System.out.println(
                        "Интерфейс: currency_rates --code=USD --date=2022-10-08\n\n" +
                                "Описание параметров:\n" +
                                "* code - код валюты в формате ISO 4217\n* date - дата в формате YYYY-MM-DD\n\n" +
                                "Вывод: USD (Доллар США): 61,2475");
            } else if (args[0].substring(0, 7).equals("--code=")) {
                System.out.println("Нужна конкретная валюта");
            }
        } else {
            System.err.println("Отсутствуют параметры ззапуска.");
            System.out.println("Попробуйте запустить currency_rates -h для вывода документации");
        }

        // System.out.println("Argument count: " + args.length);
        // System.out.println("Argument " + 0 + ": " + args[0]);
    }
}