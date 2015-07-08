import static java.lang.System.out;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
 
public class ReadingFile {
    public static void main(String[] args) throws Exception {
	out.println(new String(readAllBytes(get("1.txt"))));
    }
}
