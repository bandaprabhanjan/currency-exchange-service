package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurExchangeRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);

}
