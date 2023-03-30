package Lab9.Task2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Dublicant {
    public static Collection unique(Collection collection) {
        Set newCollection = new HashSet<>(collection);
        return newCollection;
    }
}
