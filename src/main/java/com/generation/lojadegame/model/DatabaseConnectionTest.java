package com.generation.lojadegame; // Substitua pelo seu pacote real

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionTest implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        try {
            String sql = "SELECT 1"; // Consulta simples para testar a conexão
            jdbcTemplate.queryForObject(sql, Integer.class);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
