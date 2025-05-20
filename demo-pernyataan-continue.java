/**
 * Demonstrasi Penggunaan Continue
 * @author luqmanaru
 */
public class HitungNama {
    public static void main(String[] args) {
        String[] names = {"Beah", "Bianca", "Lance", "Beah"};
        int count = 0;
        
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("Beah")) {
                continue; // skip jika bukan "Beah"
            }
            count++;
        } 
        
        System.out.println("There are " + count + " Beahs in the list");
    }
}
