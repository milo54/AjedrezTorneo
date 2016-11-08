package logica;

public abstract class tiebreak {
      private int torneo;
      private int desempate;
      
      public void tiebreak (int torneo, int desempate) {
          this.torneo=torneo;
          this.desempate=desempate;
   }
}
    
