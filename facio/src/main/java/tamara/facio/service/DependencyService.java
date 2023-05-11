package tamara.facio.service;

import org.springframework.stereotype.Service;
import tamara.facio.dto.DependencyRequest;
import tamara.facio.dto.DependencyResponse;
import tamara.facio.model.Dependency;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class DependencyService {
    public DependencyResponse getInstallationOrder(DependencyRequest dependencyRequest) {
        List<String> installationOrder = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        for (Dependency dependency : dependencyRequest.getDependencies()) {
            visit(dependency, visited, installationOrder);
        }

        return new DependencyResponse(installationOrder);
    }

    private void visit(Dependency dependency, Set<String> visited, List<String> installationOrder) {
        String name = dependency.getName();

        if (!visited.contains(name)) {
            visited.add(name);

            for (Dependency subDependency : dependency.getDependencies()) {
                visit(subDependency, visited, installationOrder);
            }

            installationOrder.add(name);
        }
    }
}
