package info.company.Lec24;

public interface Student {

   int a =6;

    default void study(){
        System.out.println("hello");
    }

    default void fun(){
        System.out.println("Aur launde kesa he");
    }

    void bunk();
    void playpubg();
}
