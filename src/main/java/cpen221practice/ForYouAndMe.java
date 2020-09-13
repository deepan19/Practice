package cpen221practice;


public class ForYouAndMe {
    public String youandme(String name) {
        String str = new String("One for you, one for me.");

        if(name==null){
            return str;
        }
        else{
            str=str.replace("you",name);
            return str;



        }
    }
}
