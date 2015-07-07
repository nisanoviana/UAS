import java.util.ArrayList;

public class Liga {
    private String namaLiga;

    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

    //Constructor
    public Liga(String namaLiga) {

        this.namaLiga = namaLiga;
    }

    //Setter and Getter

    public void setNamaLiga(String namaLiga) {

        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {

        return namaLiga;
    }

    public void setDaftarDivisi(Divisi divisi)
    {

        this.daftarDivisi.add(divisi);
    }

    public ArrayList<Divisi> getDaftarDivisi() {

        return daftarDivisi;
    }

    //test nomer 1
    public void getDaftarDivisi(String liga)
    {
        if (liga == getNamaLiga())
        {
            for (int b = 0; b <daftarDivisi.size() ; b++)
            {
                System.out.println(daftarDivisi.get(b));
            }
        }
        else
        {
            System.out.println("TIDAK ADA DIVISI");
        }

    }

    //toString
    @Override
    public String toString() {
        return "Nama Liga = " + namaLiga +
                "\nDaftar Divisi = " + daftarDivisi ;
    }
}