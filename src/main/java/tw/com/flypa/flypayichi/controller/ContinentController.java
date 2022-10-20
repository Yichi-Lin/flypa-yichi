package tw.com.flypa.flypayichi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tw.com.flypa.flypayichi.dto.ContinentRequest;
import tw.com.flypa.flypayichi.model.Continent;
import tw.com.flypa.flypayichi.service.ContinentService;

@RestController
public class ContinentController {
    
    @Autowired
    private ContinentService continentService;

    @GetMapping("/continents")
    public ResponseEntity<List<Continent>> getContinents()
    {
        List<Continent> continentList = continentService.getContinents();

        return ResponseEntity.status(HttpStatus.OK).body(continentList);
    }

    @PostMapping("/continents")
    public ResponseEntity<Continent> createContinent(@RequestBody @Valid ContinentRequest continentRequest )
    {
        String continentCode = continentService.createContinent(continentRequest);

        Continent continent = continentService.getContinent(continentCode);

        return ResponseEntity.status(HttpStatus.CREATED).body(continent);
    }
}
