package br.com.peladas.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "peladas")
public class PeladasController {

	private String value = "teste";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
