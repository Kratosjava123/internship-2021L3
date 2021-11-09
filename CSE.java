public class CSEStudent extends student2{
  String languageLearnt; //C++,Python,Java
  int currentSem; //1,2,3,4,5,6,7,8
  
  public CSEStudent(String name,String id,int age,int joiningYear,String languageLearnt,int currentSem){
    
    super(name,id,age,joiningYear);
     this.languageLearnt=languageLearnt;
     this.currentSem=currentSem;
  }   
  public void printLanguageLearnt(){
    System.out.println("LanguageLearnt:"+languageLearnt);
    System.out.println("Student name:"+super.name);
    System.out.println("Student id:"+super.id);
    System.out.println("Student joining year:"+super.joiningYear);
  }
  
  public void printCurrentSem(){
    int currentSem=6;
    int currentSem1=this.currentSem;
  System.out.println("currentSem:"+currentSem1);
  }
  
  public void getname(){
    System.out.println("Name using cse :"+name);
    super.getname();
  }
  
}
