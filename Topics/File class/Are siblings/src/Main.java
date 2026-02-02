import java.io.File;
import java.util.Objects;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        if(f1.getParent().equals( f2.getParent())){
            return true;
        }
        return false;
    }
}