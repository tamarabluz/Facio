package tamara.facio.model;

import lombok.Data;

import java.util.List;

@Data
public class Dependency {

    private String name;
    private List<String> dependencies;
}

