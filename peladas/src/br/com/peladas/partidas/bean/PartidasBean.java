package br.com.peladas.partidas.bean;

public class PartidasBean {
	
	
	private Partidas partidas = new Partidas();
	
	public Partidas getPartidas(){
		return partidas;
	}
	
	
	public void gravar() {
        System.out.println("Gravando Partida");
    }


}
