package day52;

public class PaperBook extends Book implements Readable{

    int weight;


    public PaperBook(int weight) {
        this.weight = weight;
    }

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    void displayBookInfo() {
        System.out.println("PaperBook info" + toString());
    }

    public void read(){
        System.out.println("Reading PaperBook");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("You can take note");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("index of paper book:");
    }
}
