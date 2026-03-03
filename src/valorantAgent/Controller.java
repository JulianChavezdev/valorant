package valorantAgent;

import java.util.Objects;

public class Controller extends Agent {
    private Skill skillC;
    private Skill skillQ;
    private Skill skillE;
    private Skill skillX;

    public Controller(String name, String country, int baseLife, boolean itslive, Skill skillC, Skill skillQ, Skill skillE, Skill skillX) {
        super(name, country, baseLife, itslive);
        this.skillC = skillC;
        this.skillQ = skillQ;
        this.skillE = skillE;
        this.skillX = skillX;
    }

    public Controller(Skill skillC, Skill skillQ, Skill skillE, Skill skillX) {
        this.skillC = skillC;
        this.skillQ = skillQ;
        this.skillE = skillE;
        this.skillX = skillX;
    }

    public Controller() {
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
        Controller that = (Controller) o;
        return Objects.equals(skillC, that.skillC) && Objects.equals(skillQ, that.skillQ) && Objects.equals(skillE, that.skillE) && Objects.equals(skillX, that.skillX);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skillC, skillQ, skillE, skillX);
    }
}
