package tamara.facio.model;

import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dependency {

    private String name;
    private List<Dependency> dependencies;

    public void addDependency(Dependency dependency) {
        dependencies.add(dependency);
    }
}

