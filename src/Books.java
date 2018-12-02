public class Books {
    private String autor;
    private String tytul;
    private String opis;
    private int iloscStron;

    public Books() {}

    public Books(String autor, String tytul, String opis, int iloscStron) {
        this.autor = autor;
        this.tytul = tytul;
        this.opis = opis;
        this.iloscStron = iloscStron;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setIloscStron(int iloscStron) {
        this.iloscStron = iloscStron;
    }

    @Override
    public String toString() {
        return "Books{" +
                "autor = '" + autor + '\'' +
                ", tytul = '" + tytul + '\'' +
                ", opis = '" + opis + '\'' +
                ", iloscStron = " + iloscStron +
                '}';
    }
}
