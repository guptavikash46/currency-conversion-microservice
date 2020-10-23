package com.vikas.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

//    @Query(value = "select * from Exchange_Value where from_currency =:fromCr and to_currency =:toCr", nativeQuery = true)
//    ExchangeValue getArowByFromAndTo(@Param("fromCr") String fromCr, @Param("toCr") String toCr);

    @Query("select e from ExchangeValue e where e.fromCurrency =:fromCr and e.toCurrency =:toCr")
    ExchangeValue getArowByFromAndTo(@Param("fromCr") String fromCr, @Param("toCr") String toCr);
}
