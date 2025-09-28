@interface ClassAnno{
    int noFields() default 0;
    int noMethods();
}

@ClassAnno(noFields = 1,noMethods = 2)
class CustomAnnotation{
    int attr;
    public CustomAnnotation(int attr){
        this.attr= attr;
    }
    public int getAttr(){
        return attr;
    }
}