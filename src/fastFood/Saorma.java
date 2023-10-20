package fastFood;

public class Saorma {

    SaormaStrategy saorma;

    public Saorma(SaormaStrategy saorma) {
        this.saorma = saorma;
    }

    public void PregatesteLipia(){
        System.out.println("Lipia este pregatita");
    }



    public void PregatesteSosuri(){
        System.out.println("Au fost adaugate sosurile");
    }
}
