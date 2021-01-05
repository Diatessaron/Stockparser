package ru.fazlyev.stockparser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fazlyev.stockparser.domain.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

}
