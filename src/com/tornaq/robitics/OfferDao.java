package com.tornaq.robitics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import java.util.List;

/**
 * Created by dovw on 11/16/15.
 */
@Component
public class OfferDao {

    private JdbcTemplate jdbc;

    @Autowired
    public void setJdbc(DataSource jdbcDataSource) {
        this.jdbc = new JdbcTemplate(jdbcDataSource) ;
    }

    public List<Offer> getOffers() {
        return null;
    }
}
