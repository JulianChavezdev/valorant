package valorantAgent;

import java.util.Objects;

public class Duelist extends Agent{
    private Skill skillC;
    private Skill skillQ;
    private Skill skillE;
    private Skill skillX;


    public Duelist(String name, String country, int baseLife, boolean isAlive, Skill skillC, Skill skillQ, Skill skillE, Skill skillX) {
        super(name, country, baseLife, isAlive);
        this.skillC = skillC;
        this.skillQ = skillQ;
        this.skillE = skillE;
        this.skillX = skillX;
    }

    public Duelist(Skill skillC, Skill skillQ, Skill skillE, Skill skillX) {
        this.skillC = skillC;
        this.skillQ = skillQ;
        this.skillE = skillE;
        this.skillX = skillX;
    }

    public Duelist() {
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
        Duelist duelist = (Duelist) o;
        return Objects.equals(skillC, duelist.skillC) && Objects.equals(skillQ, duelist.skillQ) && Objects.equals(skillE, duelist.skillE) && Objects.equals(skillX, duelist.skillX);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skillC, skillQ, skillE, skillX);
    }

    @Override public String toString() {
    return "Duelist{" +
            "skillC=" + skillC +
            ", skillQ=" + skillQ +
            ", skillE=" + skillE +
            ", skillX=" + skillX +
            '}';
}}
