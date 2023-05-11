package tamara.facio.dto;

import lombok.*;
import tamara.facio.model.Dependency;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DependencyRequest {
    private String name;
    private List<Dependency> dependencies;
}


