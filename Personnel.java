import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Personnel {

    private String nom;
    private String prenom;

    private String fonction;
    private java.time.LocalDate date;
    private List<String> telephone;

    public static class Builder {
        private final String nom;
        private final String prenom;

        private String fonction = new String("Membre");
        java.time.LocalDate date  = LocalDate.of(1900,01,01);
        private List<String> telephone = new ArrayList<>();


        public Builder(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        public Builder fonction(String f) {
            fonction = f;
            return this;
        }

        public Builder date(LocalDate d) {
            date = d;
            return this;
        }

        public Builder telephone(List<String> t) {
            telephone = t;
            return this;
        }

        public Personnel build() {
            return new Personnel(this);
        }
    }


    private Personnel(Builder builder) {
        nom    = builder.nom;
        prenom = builder.prenom;

        fonction  = builder.fonction;
        date      = builder.date;
        telephone = builder.telephone;
    }
    
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<String> getTelephone() {
        return telephone;
    }
}