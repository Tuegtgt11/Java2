package Java2_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args){
        int i=0;
        Scanner scan = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        names.add("Titanic");
        names.add("Crows Zero");
        names.add("Avengers");
        names.add("Spider Man");
        names.add("Iron Man");
        do{
            System.out.println("Danh sách tác vụ:");
            System.out.println("--------------------------------");
            System.out.println("1. Thêm phim mới.");
            System.out.println("2. Chỉnh sửa tên phim.");
            System.out.println("3. Xoá Phim.");
            System.out.println("4. Tìm kiếm phim.");
            System.out.println("5. In ra danh sách tất cả các phim.");
            System.out.println("6. kết thúc");
            System.out.println("-------------------------------");
            System.out.println("Mời bạn chọn:");
            i = Integer.parseInt(scan.nextLine());
            switch (i){
                case 1:
                    System.out.println("Mời bạn nhập tên phim:");
                    String c = scan.nextLine();
                    names.add(c);
                    System.out.println("Phim "+ c + " đã được thêm vào vị trí số: "+ (names.indexOf(c)+1));
                    break;
                case 2:
                    System.out.println("Mời bạn chọn vị trí muốn sửa:");
                    int v = Integer.parseInt(scan.nextLine());
                    System.out.println("Nhập tên phim mới:");
                    String n = scan.nextLine();
                    names.set(v,n);
                    System.out.println("Tên phim đã được sủa thành:");
                    System.out.println(v+"."+names.get(v));
                    break;
                case 3:
                    System.out.println("Nhập vị trí phim muốn xoá:");
                    int x = Integer.parseInt(scan.nextLine());
                    names.remove(x);
                    System.out.println("phim đã được xoá.");
                    break;
                case 4:
                    System.out.println("Nhập tên phim muốn tìm:");
                    String t = scan.nextLine();
                    System.out.println("Vị trí của phim: "+ t + "là: "+ (names.indexOf(t)+1));
                    break;
                case 5:
                    for (int y=0;y<names.size();y++){
                        System.out.println(y+"."+names.get(y));

                    }
                    break;
            }
        }while (i<6);
    }
}
