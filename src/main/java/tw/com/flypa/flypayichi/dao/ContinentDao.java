package tw.com.flypa.flypayichi.dao;

import java.util.List;

import tw.com.flypa.flypayichi.dto.ContinentRequest;
import tw.com.flypa.flypayichi.model.Continent;

public interface ContinentDao {
    
    List<Continent> getContinents();
    
    Continent getContinent(String continentCode);

    String createContinent(ContinentRequest continentRequest);
}
