package eu.contentcloud.abac.opa.rego.ast;

import java.util.List;
import lombok.Data;

@Data
public class Package {
    private List<Rule> path;
}
