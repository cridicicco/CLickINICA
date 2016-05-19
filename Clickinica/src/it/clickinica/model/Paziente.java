package it.clickinica.model;

import java.util.List;

public class Paziente {

private String password;
private List<Esame> esamiInProgramma;
private List<Esame> esamiPassati;


public boolean checkPassword(String password){
	return this.password.equals(password);
}


public List<Esame> getEsamiInProgramma() {
	return esamiInProgramma;
}


public void setEsamiInProgramma(List<Esame> esamiInProgramma) {
	this.esamiInProgramma = esamiInProgramma;
}


public List<Esame> getEsamiPassati() {
	return esamiPassati;
}


public void setEsamiPassati(List<Esame> esamiPassati) {
	this.esamiPassati = esamiPassati;
}



}
