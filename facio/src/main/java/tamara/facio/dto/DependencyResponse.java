package tamara.facio.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DependencyResponse {
    private List<String> installationOrder;
}
