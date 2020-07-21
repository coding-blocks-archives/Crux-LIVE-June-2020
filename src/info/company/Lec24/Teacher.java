package info.company.Lec24;

public interface Teacher {

    default void study(){
        System.out.println("padhai");
    }
    static void teach(){
        teach();
    }
    void guide();
}
