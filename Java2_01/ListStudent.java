package Java2_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListStudent {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ABC");
        names.add("GHJ");
        names.add("ASDF");
        names.add("TRTYU");
        names.add("LFGH");
        names.add("HRTY");
        names.add("MUYT");
        names.add("HCV");
        names.add("TOFGH");
        names.add("DRTYU");
        System.out.println("Danh sach lop: " + names);

        names.remove(3);
        System.out.println("sau khi xoa name(3): "+ names);

        names.set(6,"DGHJ");
        System.out.println("Danh sach lop sau khi sua: "+ names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });
        names.sort((name1,name2) -> name1.compareTo(name2));
        names.sort(Comparator.naturalOrder());
        System.out.println("Danh sach lop theo Ab: "+ names);
    }
}
