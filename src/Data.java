public class Data {
    int dzien;
    int miesiac;
    int rok;


    public Data(){
        this.dzien = 27;
        this.miesiac = 10;
        this.rok = 2025;
    }
    public Data(int dzien, int miesiac, int rok){
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
    public String toString(){
        return String.valueOf(dzien) + "." + String.valueOf(miesiac) + "." + String.valueOf(rok);
    }
    public void ustawDate(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    public boolean czyPrzestepny(){
        if(rok % 4 == 0 && rok % 100 == 0 && rok % 400 == 0){
            return true;
        }
        return false;
    }

    public boolean czyPoprawna(){
        if (dzien <= 31 && dzien > 0 && miesiac <= 12 &&  miesiac > 0){
            return true;
        }else return false;
    }


}
