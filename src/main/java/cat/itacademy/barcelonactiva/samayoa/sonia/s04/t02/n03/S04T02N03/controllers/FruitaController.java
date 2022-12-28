package cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.domain.Fruita;
import cat.itacademy.barcelonactiva.samayoa.sonia.s04.t02.n03.S04T02N03.services.FruitaService;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/fruita")
public class FruitaController {
	
	@Autowired
    FruitaService fruitaService;

	 @PostMapping("/add")
	    public ResponseEntity<Fruita> addFruita(@RequestBody Fruita fruita)
	    {
	        try
	        {
	            Fruita fr = fruitaService.addFruita(fruita);
	            return new ResponseEntity<>(fr, HttpStatus.CREATED);
	        }
	        catch (Exception e)
	        {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	
	 @PutMapping("/update")
	    public String updateFruuta(@RequestBody Fruita fruita)
	    {
		 return fruitaService.updateFruita(fruita);
	    }
    
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity deleteFruita(@PathVariable("id") String id)
	    {
	        try
	        {
	            fruitaService.deleteFruita(id);
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }
	        catch (Exception e)
	        {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 @GetMapping("/getOne/{id}")
	    public ResponseEntity getOneFruitaById(@PathVariable("id") String id)
	    {
	        try
	        {
	            Fruita fr = fruitaService.getOneFruita(id).orElse(null);
	            return new ResponseEntity<>(fr, HttpStatus.OK);
	        }
	        catch (Exception e)
	        {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	
	@GetMapping("/getAll")
    public ResponseEntity<List<Fruita>> getAllFruites(){
		
		
		try
        {
            if(fruitaService.getAllFruita().isEmpty())
            {
            	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else
            	{              	
            	
            	return new ResponseEntity<>(fruitaService.getAllFruita(), HttpStatus.OK);
            	
            	}
        }    
        catch (Exception e)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}

}
