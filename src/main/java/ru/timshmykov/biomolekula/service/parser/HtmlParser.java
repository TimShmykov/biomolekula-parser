package ru.timshmykov.biomolekula.service.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HtmlParser {
    public List<Object> parse(String html) {
        Document document = Jsoup.parse(html);

        Elements articleEls = document.select(".tm-articles-list__item");

        return null;
    }

}
