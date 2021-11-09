public class student2{
  String name;
  String id;
  int age;
  int joiningYear;
  
  public student2(){
  }
  
  public student2(String name,String id,int age,int joiningYear){
    this.name=name;
    this.id=id;
    this.age=age;
    this.joiningYear=joiningYear;
  }
  
  public void setname(String name){
    this.name=name;
  }
  
  public void getname(){
    System.out.println("Name using student class :"+name);
  }
  
  public void setid(String id){
    this.id=id;
  }
  public String getid(){
    return id;
  }
  
  
  public void setage(int age){
    this.age=age;
  }
  public int getage(){
    return age;
  }
  
  
  public void setjoiningYear(int joiningYear){
    this.joiningYear=joiningYear;
  }
  public int getJoiningYear(){
    return joiningYear;
}
}
