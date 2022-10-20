package tw.com.flypa.flypayichi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tw.com.flypa.flypayichi.dao.ContinentDao;
import tw.com.flypa.flypayichi.dto.ContinentRequest;
import tw.com.flypa.flypayichi.model.Continent;
import tw.com.flypa.flypayichi.service.ContinentService;

@Component
public class ContinentServiceImpl implements ContinentService {
    
    @Autowired
    private ContinentDao continentDao;

    @Override
    public List<Continent> getContinents() {
        return continentDao.getContinents();
    }

    @Override
    public String createContinent(ContinentRequest continentRequest) {
        return continentDao.createContinent(continentRequest);
    }

    @Override
    public Continent getContinent(String continentCode) {
        return continentDao.getContinent(continentCode);
    }
    
    
}
