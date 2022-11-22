public class Student {

    private static int idAuto;
    private int id;
    private String name;
    private int scoreMath;
    private int scorePhysic;
    private int scoreChemistry;
    private double avg;

    public Student(String name, int scoreMath, int scorePhysic, int scoreChemistry, double avg) {
        this.id = idAuto;
        idAuto++;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

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

    public int getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(int scoreMath) {
        this.scoreMath = scoreMath;
    }

    public int getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(int scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public int getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(int scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }
}
