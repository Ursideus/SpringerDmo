package com.tornaq.robitics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by dovw on 11/16/15.
 */

/// set bean id explicitly
@Component("offerDao")
public class OfferDao {

    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setJdbc(DataSource jdbcDataSource) {

        this.jdbc = new NamedParameterJdbcTemplate(jdbcDataSource) ;
    }

    public Offer getOffer(int id) {
        MapSqlParameterSource namedParamSource = new MapSqlParameterSource("id", id);
        namedParamSource.addValue("email", "jsmith@mail.com");

        return jdbc.queryForObject("SELECT * FROM OFFERS WHERE ID = :id", namedParamSource, new RowMapper<Offer>() {
            @Override
            public Offer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Offer offer = new Offer();
                offer.setId(resultSet.getInt("id"));
                offer.setName(resultSet.getString("name"));
                offer.setEmail(resultSet.getString("email"));
                offer.setText(resultSet.getString("text"));
                return offer;
            }
        });

    }

    public List<Offer> getOffers() {

        return jdbc.query("SELECT * FROM OFFERS", new RowMapper<Offer>() {
            @Override
            public Offer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Offer offer = new Offer();
                offer.setId(resultSet.getInt("id"));
                offer.setName(resultSet.getString("name"));
                offer.setEmail(resultSet.getString("email"));
                offer.setText(resultSet.getString("text"));
                return offer;
            }
        });

    }

    public boolean create(Offer offer) {

        BeanPropertySqlParameterSource sqlParamSource = new BeanPropertySqlParameterSource(offer);
        return jdbc.update("INSERT INTO OFFERS (ID, NAME, EMAIL, TEXT) VALUES (:id, :name, :email, :text)", sqlParamSource) == 1;
    }


    public boolean updateOffer(int id, String text) {

        MapSqlParameterSource namedParamSource = new MapSqlParameterSource("id", id);
        namedParamSource.addValue("text", text);

        return jdbc.update("UPDATE OFFERS SET TEXT = :text WHERE ID = :id", namedParamSource) == 1;
    }

    public boolean delete(int id) {

        MapSqlParameterSource namedParamSource = new MapSqlParameterSource("id", id);

        return jdbc.update("DELETE FROM OFFERS WHERE ID = :id", namedParamSource) == 1;

    }

}
