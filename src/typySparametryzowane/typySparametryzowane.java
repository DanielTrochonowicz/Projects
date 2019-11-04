package typySparametryzowane;

public class typySparametryzowane {
    public static void main(String[] args) {

        TypGen<Integer> tg = new TypGen<Integer>(10);
        int x = tg.getObj();
        System.out.println(x);
        tg.pokazTyp();

        TypGen<String> tg2 = new TypGen<String>("Test");
        String str = tg2.getObj();

        System.out.println(str);
        tg2.pokazTyp();
    }
}

class TypGen<T>{
   T obj;
   TypGen(T obj){
       this.obj = obj;
    }

    void pokazTyp(){
        System.out.println(obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}