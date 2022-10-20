package tw.com.flypa.flypayichi.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import tw.com.flypa.flypayichi.dao.ContinentDao;
import tw.com.flypa.flypayichi.dto.ContinentRequest;
import tw.com.flypa.flypayichi.model.Continent;
import tw.com.flypa.flypayichi.rowmapper.ContinentRowMapper;

@Component
public class ContinentDaoImpl implements ContinentDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<Continent> getContinents() {
        String sql = "SELECT continent_Code, continent_name, created_date, last_modified_date FROM continent";

        Map<String, Object> map = new HashMap<>();

        List<Continent> continentList = namedParameterJdbcTemplate.query(sql, map, new ContinentRowMapper());
        
        return continentList;
    }

    @Override
    public Continent getContinent(String continentCode) {
        String sql = "SELECT continent_Code, continent_Name, created_date, last_modified_date FROM continent WHERE continent_Code = :continentCode";

        Map<String, Object> map = new HashMap<>();

        map.put("continentCode", continentCode);

        List<Continent> continentList = namedParameterJdbcTemplate.query(sql, map, new ContinentRowMapper());

        if (continentList.size() > 0)
        {
            return continentList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public String createContinent(ContinentRequest continentRequest) {
        String sql = "INSERT INTO continent (continent_Code, continent_Name, created_date, last_modified_date) " +
        " VALUES(:continentCode , :continentName, :createdDate, :lastModifiedDate) ";

        Map<String, Object> map = new HashMap<>();

        map.put("continentCode", continentRequest.getContinentCode());
        map.put("continentName", continentRequest.getContinentName());

        Date now = new Date();

        map.put("createdDate", now);
        map.put("lastModifiedDate", now);

        namedParameterJdbcTemplate.update(sql, map);

        return continentRequest.getContinentCode();
    }
    
    
}
