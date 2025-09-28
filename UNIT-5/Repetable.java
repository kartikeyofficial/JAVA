
class RepetableAnnotation {
    String name;
    void setName(String name){
        this.name= name;

    } 
    String getName(){
        return name;
    }  
}
class RepetableAnnotationDemo{
    public static void main(String[] args) {
        RepeatableAnnotation r1= new RepeatableAnnotation();
        r1.setName("Kartikey");
        System.out.println(r1.getName());
    }
}
