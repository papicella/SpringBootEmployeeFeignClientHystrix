package pas.au.scs.hystrix.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pas.au.scs.hystrix.demo.employee.Employee;
import pas.au.scs.hystrix.demo.employee.EmployeeServiceClient;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeFeignRest
{
    Logger logger = LoggerFactory.getLogger(EmployeeFeignRest.class);

    @Autowired
    private EmployeeServiceClient employeeServiceClient;

    @RequestMapping(value = "/allemps", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "emptyList")
    public List<Employee> allEmps()
    {
        List<Employee> emps = employeeServiceClient.listEmployees();

        return emps;
    }

    public List<Employee> emptyList()
    {
        List<Employee> emptyList = new ArrayList<Employee>();

        logger.warn("Empty Employee List being returned due to service issue");
        return emptyList;
    }

}
