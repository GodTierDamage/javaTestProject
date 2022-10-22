import java.io.IOException;
import java.util.List;

public interface ImportEmployees<T> {

    List<T> load(String path) throws IOException;
}
