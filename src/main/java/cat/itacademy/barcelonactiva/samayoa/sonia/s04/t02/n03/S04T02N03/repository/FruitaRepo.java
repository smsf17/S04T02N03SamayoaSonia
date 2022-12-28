package cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.domain.Fruita;

@Repository
public interface FruitaRepo extends MongoRepository<Fruita, String> {
	
}

