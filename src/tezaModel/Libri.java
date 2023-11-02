package tezaModel;

public class Libri {
    private String title;
    private String author;
    private int id;

    private static int idCnt;

    public Libri() {
        title = author = "I panjohur";
        id = 0;
    }

    public Libri(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = ++idCnt;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Libri l = (Libri) obj;
        return l.getId() == this.id;
    }

    @Override
    public String toString() {
        return "Titulli: " + this.title + "\n" +
                "Autori: " + this.author + "\n" +
                "ID: " + this.id;
    }

    public String getIniciale() {
        // Emri i pare dhe i fundit po e marre si emer mbiemer Anton Beni Gjoka > A. G.
        // (nuk kontrollohet nqs emri eshte shqiptar)

        if (this.author.equals("I panjohur"))
            return null;

        String[] authorSplit = this.author.split(" ");
        String iniciale = "";

        if (authorSplit.length > 2)
            return iniciale += authorSplit[0].substring(0, 1).toUpperCase() + ". " +
                    authorSplit[authorSplit.length - 1].substring(0, 1).toUpperCase() + ".";
        else
            return null;
    }
}
