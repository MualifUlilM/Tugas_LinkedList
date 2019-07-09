import com.tugas.LList;

public class TambahDariBelakang {
    public static void main(String[] args){
        LList list = new LList();
        for (int i = 0; i < 5; i++){
            list.addLast(i);
        }
        list.tampilkan();
    }
}
