package SyauqiR;

public class TiketKonser {

    private String notik;
    private String nama;

    //constructor
    public TiketKonser(String notik, String nama) {
        this.notik = notik;
        this.nama = nama;
    }

    //mutator (setter)
    public void setNotik(String notik) {
        this.notik = notik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    //accessor (getter)
        public String getNotik() {
        return notik;
    }

    public String getNama() {
        return nama;
    }
    
    public String displayInfo(){
        return "No Tiket : " +getNotik() + "\nNama : " +getNama();
    }
    
     // polymorphism (overloading)
    public String displayInfo(String hp){
        return displayInfo() + "\nNo.Telpon : "+hp;   
    }
}
