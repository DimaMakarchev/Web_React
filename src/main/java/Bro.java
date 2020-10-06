import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "mybro")
public class Bro {
    @Id
    private int id;

    @NotBlank
    @Size(max = 20)
    private String name_bro;
    private String power;


}
