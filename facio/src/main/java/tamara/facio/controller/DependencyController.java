package tamara.facio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tamara.facio.dto.DependencyRequest;
import tamara.facio.dto.DependencyResponse;
import tamara.facio.service.DependencyService;

import java.util.List;

@RestController
@RequestMapping("/dependencies")
public class DependencyController {

    private final DependencyService dependencyService;

    @Autowired
    public DependencyController(DependencyService dependencyService) {
        this.dependencyService = dependencyService;
    }

    @PostMapping("/installation-order")
    public ResponseEntity<DependencyResponse> postInstallationOrder(@RequestBody DependencyRequest dependencyRequest) {
        DependencyResponse response = dependencyService.getInstallationOrder(dependencyRequest);
        return ResponseEntity.ok(response);
    }
}

