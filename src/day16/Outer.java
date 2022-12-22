package day16;

class Outer {

    public int outerVal = 20;

   // public Inner getInnerClassObject (){
     //   return new Inner();
   // }

    public class Inner {
        public int innerVal = 10;

        public void increaseOuterVal(){
            outerVal++;
        }

    }
}
