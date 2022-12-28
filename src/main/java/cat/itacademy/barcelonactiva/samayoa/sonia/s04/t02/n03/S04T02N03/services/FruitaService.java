package cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.domain.Fruita;

public interface FruitaService {

	//http://localhost:8080/fruita/add
	public Fruita addFruita(Fruita fruita);

		//http://localhost:8080/fruita/update
	public String updateFruita(Fruita fruitaUpdate);

		//http://localhost:8080/fruita/delete/{id}
	public String deleteFruita(String id);

		//http://localhost:8080/fruita/getOne/{id}
	public Optional<Fruita> getOneFruita(String id);

		//http://localhost:8080/fruita/getAll
	public List<Fruita> getAllFruita();

}
