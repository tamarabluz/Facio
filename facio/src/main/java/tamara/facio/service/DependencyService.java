package tamara.facio.service;

import org.springframework.stereotype.Service;
import tamara.facio.model.Dependency;

import java.util.ArrayList;
import java.util.List;

@Service
public class DependencyService {
        public List<String> getInstallationOrder(Dependency project) {
            List<String> installationOrder = new ArrayList<>();
            List<Dependency> remainingDependencies = new ArrayList<>(project.getDependencies());

            while (!remainingDependencies.isEmpty()) {
                boolean addedDependency = false;
                for (Dependency dependency : remainingDependencies) {
                    if (installationOrder.containsAll(dependency.getDependencies())) {
                        installationOrder.add(dependency.getName());
                        remainingDependencies.remove(dependency);
                        addedDependency = true;
                        break;
                    }
                }
                if (!addedDependency) {
                    throw new RuntimeException("Circular dependency detected!");
                }
            }

            installationOrder.add(project.getName());
            return installationOrder;
        }
    }
