package tamara.facio.model;

import lombok.Data;

import java.util.List;

@Data
public class Dependency {

    private String name;
    private List<Dependency> dependencies;

    public void addDependency(Dependency dependency) {
        dependencies.add(dependency);
    }
}

