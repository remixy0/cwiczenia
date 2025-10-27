public class Data {
    int dzien;
    int miesiac;
    int rok;

    void Data(){
        this.dzien = 27;
        this.miesiac = 10;
        this.rok = 2025;
    }
    void Data(int dzien, int miesiac, int rok){
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    public int getDzien() {
        return dzien;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public int getRok() {
        return rok;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }
}
