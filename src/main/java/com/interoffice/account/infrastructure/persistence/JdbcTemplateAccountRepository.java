package com.interoffice.account.infrastructure.persistence;

import com.interoffice.account.domain.Account;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.time.LocalDateTime;


public class JdbcTemplateAccountRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplateAccountRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Account save(Account account) {
        //Todo: parameter 너무 긴데 이거 자체 api에서 해결책 있을 것 같은데...
        this.jdbcTemplate.update(
                "insert into users (email, password, username, phonenumber, createdAt, modifiedAt) values (?, ?,?,?,?,?)",
                account.getEmail(), account.getPassword(), account.getUsername(), account.getPhoneNumber(), LocalDateTime.now(), LocalDateTime.now());
        return account;
    }

    public Account findByEmail(String email) {
        String sql = "select *  from users where email = ?";
        //Todo:queryForObject 이 메서드는 deprecated메서드
        return jdbcTemplate.queryForObject(sql, new Object[]{email}, (rs, rowNum) ->
                new Account(
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("username"),
                        rs.getString("phoneNumber")
                ));
//                .orElse(null);
    }

}
