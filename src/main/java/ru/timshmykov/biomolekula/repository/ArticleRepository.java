package ru.timshmykov.biomolekula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.timshmykov.biomolekula.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
