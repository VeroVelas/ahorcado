public class Juego {
    private byte numVidas;
    private String palabra;
    private char[] aux;

    public Juego(byte numVidas, String palabra){
        this.numVidas = numVidas;
        this.palabra = palabra;
        aux = new char[palabra.length()];
    }

    public boolean buscarLetra(char letra){
        boolean estado = false;
        for (int i=0; i<palabra.length();i++){
            if(palabra.charAt(i)==letra){
                estado = true;
                aux[i] = letra;
            }
        }
        if (!estado)
            quitarVida();
        return estado;
    }

    private void quitarVida(){
        numVidas--;
    }

    public String getPalabra() {
        return palabra;
    }

    public byte getNumVidas() {
        return numVidas;
    }

    public boolean isLive(){
        boolean estado;
        if (numVidas>0)
            estado = true;
        else
            estado = false;
        return estado;

        /*if (numVidas>0)
            return true;
        else
            return false;*/
    }

    public char[] getAux(){
        return aux;
    }
}
