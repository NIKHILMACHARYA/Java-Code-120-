class MethodOverLoad{
    
    int addition(){
        return (10+10);
    }
    int addition(int x,int y){
        return(x+y);
    }
    float addition(float a,float b){
        return(a+b);
    }
    public static void main(String[] args) {
        MethodOverLoad a=new  MethodOverLoad();
        System.out.println("By using default values, Sum is:"+a.addition());
        System.out.println("Sum of two integer values(10 and 20) is:"+a.addition(10,20));
        System.out.println("Sum of two float values(10.5 and 20.5) is:"+a.addition(10.5f,20.5f));
    }
}
