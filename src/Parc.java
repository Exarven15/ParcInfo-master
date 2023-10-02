import java.util.ArrayList;

public class Parc {
    private String nomParc ;
    private ArrayList<Materiel> materiels ;


    public Parc(ArrayList<Materiel> materiels) {
        this.materiels = new ArrayList<Materiel>(materiels);
    }
    public Parc(String nom) {
        this.materiels = new ArrayList<Materiel>();
        this.nomParc = new String(nom);
    }

    public void addM(Materiel materiels){
        this.materiels.add(materiels);
    }
    public void suppM(Materiel materiels){
        this.materiels.remove(materiels);
    }
    
    public String getNomParc() {
        return nomParc;
    }
    public void setNomParc(String nomParc) {
        this.nomParc = nomParc;
    }
    public ArrayList<Materiel> getMateriels() {
        return materiels;
    }
    @Override
    public String toString() {
        String res = new String();
        int taille = this.materiels.size();
        res = res + this.nomParc + " = " + taille + " materiel(s) :\n";
        for (Materiel ma : this.materiels){
            res += "->"+ma+"\n";
        }
        return res;
    }
    public void recherche(String nSerie){
        for (Materiel m : this.materiels){
            if(m.Nserie.equals(nSerie)){
                System.out.println(nSerie);
            }
        }
    }
    
}
