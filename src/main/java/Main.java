import com.google.common.base.Throwables;

public class Main {

    public static void main(String... args) {
        Throwables.throwIfInstanceOf(new Exception(), RuntimeException.class);
    }

}
