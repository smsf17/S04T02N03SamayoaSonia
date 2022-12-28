package cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fruita")
public class Fruita {
	
	@Id
    private String id;

    private String nom;
    private int quilos;
	
    public Fruita(String id, String nom, int quilos) {
		this.id = id;
		this.nom = nom;
		this.quilos = quilos;
	}

	public Fruita() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuilos() {
		return quilos;
	}

	public void setQuilos(int quilos) {
		this.quilos = quilos;
	}

	@Override
	public String toString() {
		return "Fruita [id=" + id + ", nom=" + nom + ", quilos=" + quilos + "]";
	}
    
    
    
    
}
