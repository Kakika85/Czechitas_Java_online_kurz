package cz.test.uceni.czechitas;

public class Kalkulator {
    public int sčítání(int základní, int druhé){
        return základní + druhé;
    }
    public int odečítání(int základní, int druhé){
       if(základní-druhé<0){
           System.out.println("POZOR! Záporný výsledek!");
       }
        return základní - druhé;
    }
    public int dělení(int základní, int druhé){
        if(druhé==0) {
            throw new RuntimeException("POZOR! Dělení nulou není přijatelné!");
        }
        if(základní==0){
            throw new RuntimeException("POZOR! Dělit nulu není přijatelné!");
        }
        return základní / druhé;
    }
    public int násobení(int základní, int druhé){
        if(druhé==0) {
            throw new RuntimeException("POZOR! Násobit nulou není přijatelné!");
        }
        if(základní==0) {
            throw new RuntimeException("POZOR! Násobit nulu není přijatelné!");
        }
        if(základní<0||druhé<0){
            System.out.println("POZOR! Nezapoměl jsi na mínus?");
        }
        return základní * druhé;
    }
    public int druháMocnina(int základní) {
        return základní * základní;
    }

    public int druháOdmocnina(int základní) {
        return (int)Math.sqrt(základní);
    }
}


