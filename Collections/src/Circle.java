import java.util.List;

public final class Circle {
    public static int lastMan(List<Integer> humans) {
        if (humans != null) {
            List<Integer> worker = humans;
            for (int i = 0; i < worker.size(); i++) {
                if (i == worker.size()) {
                    i = 0;
                }
                worker.remove(i + 1);
                if (worker.size() == 1) {
                    break;
                }
            }
            return worker.get(0);
        }
        return 0;
    }
}
