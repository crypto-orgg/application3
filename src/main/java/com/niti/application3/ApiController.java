package com.niti.application3;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/v1")
public class ApiController {

    @GetMapping("/application3")
    public ResponseEntity<Map<String, Object>> getSuccess() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Operation completed successfully");
        response.put("timestamp", LocalDateTime.now().toString());

        return ResponseEntity.ok(response);
    }
}
