package tw.com.flypa.flypayichi.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import tw.com.flypa.flypayichi.model.Continent;

public class ContinentRowMapper implements RowMapper<Continent> {

    @Override
    @Nullable
    public Continent mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        Continent continent = new Continent();

        continent.setContinentCode(rs.getString("continent_code"));
        continent.setContinentName(rs.getString("continent_name"));
        continent.setCreatedDate(rs.getTimestamp("created_date"));
        continent.setLastModifiedDate(rs.getTimestamp("last_modified_date"));

        return continent;
    }
    
    
}
