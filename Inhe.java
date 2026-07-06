public class Inhe {
  public String name; 
  public String id;

  public Inhe(String name, String id){
    this.name = name;
    this.id = id;

  }
  @Override 
  public boolean equals(Object obj){
    if(this == obj) return true;
    if(obj == null || getClass() != obj.getClass()) return false;
    Inhe h = (Inhe) obj;
    return id.equals(h.id);
  }
   
}
