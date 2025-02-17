package model;

import lombok.*;

@Data
@NoArgsConstructor
public class Joke {
    private String type;
    private String setup;
    private String punchline;
    private int id;
}
