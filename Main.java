import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> telephone = new ArrayList<>();
        telephone.add("0102030405");
        telephone.add("0607080900");
        Personnel p = new Personnel.Builder("Romain", "Guichard")
        .date(LocalDate.of(1970,1,12))
        .telephone(telephone)
        .build();
        System.err.println(p.getNom());
        System.err.println(p.getPrenom());
        System.err.println(p.getFonction());
        System.err.println(p.getDate());
        System.err.println(p.getTelephone());
    }
}
