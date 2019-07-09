import com.tugas.LList;

public class TambahDariDepan {
    public static void main(String[] args){
        LList list = new LList();
        for (int i = 0; i < 5; i++){
            list.addFirst(i);
        }
        list.tampilkan();
    }
}
