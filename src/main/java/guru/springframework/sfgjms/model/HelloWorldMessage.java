package guru.springframework.sfgjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = 4062736190844001421L;

    private UUID id;
    private String message;
}
