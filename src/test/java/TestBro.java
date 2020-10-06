import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Comparator;
import java.util.List;

@T
public class TestBro {

    private List<Bro> bros = List.of(
            new Bro(1, "Bro", "jump"),
            new Bro(2, "Bro", "brain"),
            new Bro(2, "MA", "box"),
            new Bro(3, "Bro", "brain"),
            new Bro(3, "Ma", "jump")
    );

    @Test
    void contextLoads() {
        bros.stream().sorted(Comparator.comparing(Bro::getName_bro));

//        System.out.println(String.format("name_bro : %s",bros.get(0).getName_bro()));

    }

}
