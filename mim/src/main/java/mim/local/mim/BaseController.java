package mim.local.mim; 

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class BaseController {

    private JdbcTemplate jdbcTemplate;

    @GetMapping("test")
    public String test() {
        String sql = "CREATE TABLE IF NOT EXISTS test_table(\n" +
             "    id INT PRIMARY KEY AUTO_INCREMENT,\n" +
             "    name VARCHAR(100)\n" +
             ")";
jdbcTemplate.execute(sql);

        return "Created test_table successfully.";
    }

}