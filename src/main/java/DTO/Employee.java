package DTO;

import lombok.*;

import java.util.Date;

/**
 * @author George C. Geschwend
 * @date 4/30/2023 3:50 PM
 * @project OralceService
 */

@Data
@ToString
public class Employee {

    private Long empno;
    private String ename;
    private String job;
    private Long mgr;
    private Date hiredate;
    private Long sal;
    private Long comm;
    private Long deptno;

}
