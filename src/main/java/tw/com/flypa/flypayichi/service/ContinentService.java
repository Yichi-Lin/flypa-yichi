package tw.com.flypa.flypayichi.service;

import java.util.List;

import tw.com.flypa.flypayichi.dto.ContinentRequest;
import tw.com.flypa.flypayichi.model.Continent;

public interface ContinentService {
    
    List<Continent> getContinents();
    
    Continent getContinent(String continentCode);
    
    String createContinent(ContinentRequest continentRequest);
}
