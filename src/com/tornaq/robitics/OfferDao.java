package com.tornaq.robitics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

    private JdbcTemplate jdbc;

    @Autowired
    public void setJdbc(DataSource jdbcDataSource) {

        this.jdbc = new JdbcTemplate(jdbcDataSource) ;
    }

    public List<Offer> getOffers() {

        return jdbc.query("SELECT * FROM OFFERS", new RowMapper<Offer>() {
            @Override
            public Offer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Offer offer = new Offer();
                offer.setId(resultSet.getInt("id"));
                offer.setName(resultSet.getString("name"));
                offer.setName(resultSet.getString("email"));
                offer.setName(resultSet.getString("text"));
                return offer;
            }
        });

    }
}
