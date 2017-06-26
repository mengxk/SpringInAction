package mxk.com.api;

import javax.swing.tree.RowMapper;
import java.math.BigDecimal;
import java.sql.*;

/**
 * Created by 10056 on 2017/6/25.
 */
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;

    public Employee getEmployeeById(long id, DatabaseMetaData dataSource) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("SELECT id, firstName, lastName, salary FROM employee where id=?");
            stmt.setLong(1, id);
            rs = stmt.executeQuery();
            Employee employee = null;
            if (rs.next()) {
                employee = new Employee();
                employee.setId(rs.getLong("id"));
                employee.setFirstName(rs.getString("firstName"));
                employee.setLastName(rs.getString("lastName"));
                employee.setSalary(rs.getBigDecimal("salary"));
            }
            return employee;
        } catch (Exception e) {

        } finally {
            if (rs != null){
                try{
                    rs.close();
                }catch(Exception e){

                }
            }
            if (stmt != null){
                try{
                    stmt.close();
                }catch(Exception e){

                }
            }
            if (conn != null){
                try{
                    conn.close();
                }catch(Exception e){

                }
            }
        }
        return null;
    }

    /*public Employee getEmployeeById2(long id, Employee jdbcTemplate){
        return jdbcTemplate.queryForObject(
                "select id, firstName, lastName, salary from employee where id=?",
                new RowMapper<Employee>(){
                    public Employee mapRow(ResultSet rs, int rowNum) throws Exception{
                        Employee employee = new Employee();
                        employee.setId(rs.getLong("id"));
                        employee.setFirstName(rs.getString("firstName"));
                        employee.setLastName(rs.getString("lastName"));
                        employee.setSalary(rs.getBigDecimal("salary"));
                        return employee;
                    }
                }, id);
    }*/

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
