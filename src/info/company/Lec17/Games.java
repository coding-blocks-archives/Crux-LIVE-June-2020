package info.company.Lec17;

public class Games {

    int exp;

    int lvl;

    String name;

    public Games(){

//        this.exp= 0;
//        this.lvl=0;
//        this.name="game";

        this(0);
    }

    public Games(int exp){
        this(exp,0);
    }

    public Games(Games game){

        this.exp= game.exp;
        this.lvl= game.lvl;
        this.name=game.name;
    }

    public Games(int exp, int lvl){

        this(exp,lvl,"shubham");

//        this.exp= exp;
//        this.lvl=lvl;
    }
    public Games(int exp, int lvl, String name) {

        this.exp=exp;
        this.lvl=lvl;
        this.name=name;
    }
//
   String category= "Action";


   public void experience(){

       exp= exp+10;

       if(exp==150){
           System.out.println("Level up");
           lvl=lvl+1;
       }
   }

   public static void launchevent(){
       System.out.println("Game launch today");
   }
}
