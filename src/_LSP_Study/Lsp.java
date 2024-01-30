package _LSP_Study;

import java.util.Collection;
import java.util.HashSet;

public class Lsp {
    public void myData() {
        // Collection data = new LinkedList<>();
        Collection data = new HashSet<>();
        modify(data);
    }

    public void modify(Collection data) {
        data.add(1);
    }
}
