public class MethodOverriding {
    void Sound(){
        System.out.println("Animal makes A Sound");
    }
}
class Dog extends MethodOverriding{
     @Override  // It Is Just A Overriding Notation
    void Sound(){                              /*  In  Methode Overridng when the Object call then the only specific Sub Class Methode Only Call.
                                                    Not Call The Parents Class 'Or' Super Class. 
                                               */
        System.out.println("Dog Barks;");

    }
}
class OverridingDemo{
     public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Sound();
       
     }
}