/**
 * Created by nicun on 7/6/2015.
 */
public class TestLiga {
    public static void main(String[] args) {

        //Liga
        Liga Indonesia = new Liga("Indonesia");
        Liga spanyol = new Liga("Spanyol");

        //Divisi
        Divisi divisiA = new Divisi("Divisi B",Indonesia);
        Divisi divisiB = new Divisi("Divisi A",Indonesia);
        Divisi divisi1 = new Divisi("Divisi 1",spanyol);
        Divisi divisi2 = new Divisi("Divisi 2",spanyol);

        //Klub
        Klub arema = new Klub("Arema",divisiA,Indonesia);
        Klub persebaya = new Klub("Persebaya",divisiA,Indonesia);
        Klub persema = new Klub("Persema",divisiB,Indonesia);
        Klub persija = new Klub("Persija",divisiB,Indonesia);

        Klub real = new Klub("Real Madrid",divisi1,spanyol);
        Klub barca = new Klub("Barcelona",divisi1,spanyol);
        Klub villa = new Klub("Villareal",divisi2,spanyol);
        Klub espanyol = new Klub("Espanyol",divisi2,spanyol);

        Indonesia.setDaftarDivisi(divisiA);
        Indonesia.setDaftarDivisi(divisiB);
        spanyol.setDaftarDivisi(divisi1);
        spanyol.setDaftarDivisi(divisi2);

        divisiA.setDaftarKlub(arema);
        divisiA.setDaftarKlub(persebaya);
        divisiB.setDaftarKlub(persema);
        divisiB.setDaftarKlub(persija);
        divisi1.setDaftarKlub(real);
        divisi1.setDaftarKlub(barca);
        divisi2.setDaftarKlub(villa);
        divisi2.setDaftarKlub(espanyol);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga Indonesia : ");
        Indonesia.getDaftarDivisi("Indonesia");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga Indonesia : ");
        divisiA.getDaftarKlubLiga("Indonesia");
        System.out.println("Liga Spanyol : ");
        divisi1.getDaftarKlubLiga("Spanyol");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("Divisi A : ");
        divisiA.getDaftarKlubDivisi("Divisi A");
        System.out.println("Divisi B : ");
        divisiB.getDaftarKlubDivisi("Divisi B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        arema.getDivisi("Arema");
        real.getDivisi("Real Madrid");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        real.getLiga("Real Madrid");
    }

}
