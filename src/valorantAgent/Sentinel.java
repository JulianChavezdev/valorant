package valorantAgent;

import java.util.Objects;

;

public class Sentinel extends Agent{
    private Skill skillC;
    private Skill skillQ;
    private Skill skillE;
    private Skill skillX;


    public Sentinel(String name, String country, int baseLife, boolean itslive, Skill skillC, Skill skillQ, Skill skillE, Skill skillX) {
        super(name, country, baseLife, itslive);
        this.skillC = skillC;
        this.skillQ = skillQ;
        this.skillE = skillE;
        this.skillX = skillX;
    }

    public Sentinel(Skill skillC, Skill skillQ, Skill skillE, Skill skillX) {
        this.skillC = skillC;
        this.skillQ = skillQ;
        this.skillE = skillE;
        this.skillX = skillX;
    }

    public Sentinel() {
    }

    public Skill getSkillC() {
        return skillC;
    }

    public void setSkillC(Skill skillC) {
        this.skillC = skillC;
    }

    public Skill getSkillQ() {
        return skillQ;
    }

    public void setSkillQ(Skill skillQ) {
        this.skillQ = skillQ;
    }

    public Skill getSkillE() {
        return skillE;
    }

    public void setSkillE(Skill skillE) {
        this.skillE = skillE;
    }

    public Skill getSkillX() {
        return skillX;
    }

    public void setSkillX(Skill skillX) {
        this.skillX = skillX;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sentinel sentinel = (Sentinel) o;
        return Objects.equals(skillC, sentinel.skillC) && Objects.equals(skillQ, sentinel.skillQ) && Objects.equals(skillE, sentinel.skillE) && Objects.equals(skillX, sentinel.skillX);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skillC, skillQ, skillE, skillX);
    }

    @Override
    public String toString() {
        return "Sentinel{" +
                "skillC=" + skillC +
                ", skillQ=" + skillQ +
                ", skillE=" + skillE +
                ", skillX=" + skillX +
                '}';
    }
}
