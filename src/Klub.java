public class Klub {
    private String namaKlub;
    private Divisi divisi;
    private Liga liga;

    //Constructor

    public Klub(String namaKlub, Divisi divisi, Liga liga) {
        this.namaKlub = namaKlub;
        this.divisi = divisi;
        this.liga = liga;
    }

    //Setter and Getter
    public void setNamaKlub(String namaKlub) {

        this.namaKlub = namaKlub;
    }

    public String getNamaKlub() {

        return namaKlub;
    }

    public void setDivisi(Divisi divisi) {

        this.divisi = divisi;
    }

    //test nomer 4
    public void getDivisi(String Klub){
        for (int v = 0; v < liga.daftarDivisi.size(); v++){
            Divisi b = liga.daftarDivisi.get(v);
            for (int c = 0; c < divisi.daftarKlub.size(); c++){
                b.daftarKlub.get(c);
                Klub l = b.daftarKlub.get(c);
                if (Klub == l.getNamaKlub()){
                    System.out.println(b.getNamaDivisi());
                }
            }
        }
    }

    public void setLiga(Liga liga) {

        this.liga = liga;
    }

    //test nomer 5
    public void getLiga (String club){
        for (int v = 0; v < liga.daftarDivisi.size(); v++){
            Divisi b = liga.daftarDivisi.get(v);
            for (int c = 0; c < divisi.daftarKlub.size(); c++){
                b.daftarKlub.get(c);
                Klub l = b.daftarKlub.get(c);
                if (club == l.getNamaKlub()){
                    System.out.println(liga.getNamaLiga());
                }
            }
        }
    }

    //toString
    @Override
    public String toString() {
        return "Nama Klub = " + namaKlub;
    }
}
