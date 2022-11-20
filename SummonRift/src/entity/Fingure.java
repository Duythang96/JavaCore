package entity;

public class Fingure {
   private int id;
   private String name;
   private String possition;
   private static int autoId=1;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPossition() {
      return possition;
   }

   public void setPossition(String possition) {
      this.possition = possition;
   }

   @Override
   public String toString() {
      return "Fingure{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", possition='" + possition + '\'' +
              '}';
   }

   public Fingure(String name, String possition) {
      this.id = autoId;
      autoId++;
      this.name = name;
      this.possition = possition;
   }
}
