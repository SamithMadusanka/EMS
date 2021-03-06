package com.samith.employeems.controller;

import com.samith.employeems.dto.EmployeeDTO;
import com.samith.employeems.service.EmployeeService;
import com.samith.employeems.util.AbstractController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author - Samith Madusanka on 2020-06-27
 * @project - employee-ms
 **/
@RestController
@RequestMapping("emp")
public class EmployeeController extends AbstractController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        LOGGER.info("request   - saveEmployee | url - emp/save | payload : {}", employeeDTO);
        employeeService.saveEmployee(employeeDTO);
        LOGGER.info("response  - saveEmployee | url - emp/save | success");
        return sendSuccessResponse("Employee saved successfully");
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        LOGGER.info("request   - updateEmployee | url - emp/update | payload : {}", employeeDTO);
        employeeService.updateEmployee(employeeDTO);
        LOGGER.info("response  - updateEmployee | url - emp/update | success");
        return sendSuccessResponse("Employee updated successfully");
    }

    @DeleteMapping("/remove")
    public ResponseEntity<?> removeEmployee(@Param("employeeId") int employeeId) {
        LOGGER.info("request   - removeEmployee | url - emp/remove | employeeId : {}", employeeId);
        employeeService.removeEmployee(employeeId);
        LOGGER.info("response  - removeEmployee | url - emp/remove | success");
        return sendSuccessResponse("Employee removed successfully");
    }

    @GetMapping("/findById")
    public ResponseEntity<?> findByEmployeeId(@Param("employeeId") int employeeId) {
        LOGGER.info("request   - findByEmployeeId | url - emp/findById | employeeId : {}", employeeId);
        EmployeeDTO byEmployeeId = employeeService.findByEmployeeId(employeeId);
        LOGGER.info("response  - findByEmployeeId | url - emp/findById | success");
        return sendSuccessResponse(byEmployeeId);
    }

}
