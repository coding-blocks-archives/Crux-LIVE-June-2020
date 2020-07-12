package info.company.Lec9;

public class StringBuildereg {

    public static void main(String[] args) {

        String s= "Heelllo";
        StringBuilder builder = new StringBuilder(s);

        StringBuffer buffer = new StringBuffer();
        //
//        for (int i = 0; i <100000000 ; i++) {
//            builder.append("a");
//        }

        builder.reverse();

//        System.out.println(builder.indexOf("s"));

//        System.out.println();
//        System.out.println(builder.lastIndexOf("s"));
//        System.out.println(builder);

//        System.out.println('C'-'A');

        System.out.println(toggle("Bad"));
    }

    public static StringBuilder toggle(String str) {

        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z'){
                ch = (char)('a'+ (ch-'A'));
            }

            else{
                ch = (char)('A'+ (ch-'a'));
            }

            builder.setCharAt(i,ch);
        }

        return builder;
    }


}
