package day52;

public class AudioBook extends Book{
    double duration;

    public AudioBook(double duration) {
        this.duration = duration;
    }

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    void displayBookInfo() {
        System.out.println("AudioBook info " + toString());
    }
void listen(){
    System.out.println("Listening AudioBook");
}
    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {

    }

    @Override
    public void showTableOfContent() {

    }
}
