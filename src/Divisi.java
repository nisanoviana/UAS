import java.util.ArrayList;

public class Divisi {
    private String namaDivisi;
    private Liga liga;
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();

    //Constructor
    public Divisi(String namaDivisi, Liga liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    //Setter and Getter
    public void setNamaDivisi(String namaDivisi) {

        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {

        return namaDivisi;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Liga getLiga(){
        return liga;
    }

    public void setDaftarKlub(Klub klub) {

        this.daftarKlub.add(klub);
    }

    public ArrayList<Klub> getDaftarKlub() {

        return daftarKlub;
    }

    //test nomer 2

    public void getDaftarKlubLiga(String cariLiga)
    {
        if (cariLiga == liga.getNamaLiga())
        {
            for (int l = 0; l < liga.daftarDivisi.size() ; l++)
            {
                Divisi z = liga.daftarDivisi.get(l);
                System.out.println(z.getNamaDivisi());
                for (int s = 0; s <daftarKlub.size() ; s++)
                {
                    System.out.println(z.daftarKlub.get(s));
                }
            }
        }
        else
        {
            System.out.println("TIDAK ADA KLUB");
        }
    }

    //test nomer 3
    public void getDaftarKlubDivisi(String divisiCari)
    {
        for (int l = 0; l < liga.daftarDivisi.size() ; l++)
        {
            Divisi z = liga.daftarDivisi.get(l);
            if (divisiCari == z.getNamaDivisi())
            {
                for (int s = 0; s <daftarKlub.size() ; s++)
                {
                    System.out.println(z.daftarKlub.get(s));
                }
            }
        }
        for (int l = 0; l < liga.daftarDivisi.size() ; l++)
        {
            Divisi p = liga.daftarDivisi.get(0);
            Divisi h = liga.daftarDivisi.get(1);
            if (divisiCari != h.getNamaDivisi())
            {
                if (divisiCari != p.getNamaDivisi())
                {
                    System.out.println("TIDAK ADA KLUB");
                    break;
                }
            }
        }

    }

    //toString
    @Override
    public String toString() {
        return
                "Nama Divisi = " + namaDivisi;
    }

}