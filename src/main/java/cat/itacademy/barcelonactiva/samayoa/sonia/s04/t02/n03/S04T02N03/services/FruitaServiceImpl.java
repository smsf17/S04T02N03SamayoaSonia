package cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.domain.Fruita;
import cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.repository.FruitaRepo;

@Service
public class FruitaServiceImpl implements FruitaService {
	
	@Autowired
	private FruitaRepo fruitaRepo;
	

	@Override
	public Fruita addFruita(Fruita fruita) {

	    Fruita nuevaFruita = fruitaRepo.save(new Fruita(fruita.getId(), fruita.getNom(), fruita.getQuilos()));

		return nuevaFruita;
	}

	@Override
	public String updateFruita(Fruita fruitaUpdate) {

		String num = fruitaUpdate.getId();
		
		if(fruitaRepo.findById(num).isPresent()) {
			Fruita fr = new Fruita();
			fr=fruitaRepo.findById(num).get();
			fr.setNom(fruitaUpdate.getNom());
			fr.setQuilos(fruitaUpdate.getQuilos());
			fruitaRepo.save(fr);
		return "Fruita modificada";
			
		}else {
			return "Fruita con Id: " + num + " no encontrado!";
	
		}
	}

	@Override
	public String deleteFruita(String id) {
		fruitaRepo.deleteById(id);
		return "Fruta con Id: "+id+" eliminada correctamente!";
	}

	@Override
	public Optional<Fruita> getOneFruita(String id) {
		
		if(fruitaRepo.findById(id).isPresent()) {
			
		return fruitaRepo.findById(id);
			
		}else {
			return null;
	
		}
	}

	@Override
	public List<Fruita> getAllFruita() {
		
		return fruitaRepo.findAll();
	}

}
