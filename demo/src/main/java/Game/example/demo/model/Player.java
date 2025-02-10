package Game.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "players")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Player {
    @Id
    private String id;

    private String palyerId;
    private String userName;
    private String character;
}
