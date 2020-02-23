package day52;

public interface KnowledgeBank {

    abstract void takeNote();

    default void showTableOfContent(){
        System.out.println("Index:");
    }
}
