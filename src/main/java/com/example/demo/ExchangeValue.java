package com.example.demo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	private Long id;
	@Column(name = "Exchange_From")
	private String from;
	@Column(name = "Exchange_To")
	private String to;
	@Column(name = "convertMultiple")
	private BigDecimal convertMultiple;
	@Column(name = "port")
	private int port;

	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", convertMultiple=" + convertMultiple
				+ ", port=" + port + "]";
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConvertMultiple() {
		return convertMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ExchangeValue() {
		super();
	}

	public ExchangeValue(Long Id, String from, String to, BigDecimal convertMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertMultiple = convertMultiple;
		this.port = port;
	}

}
