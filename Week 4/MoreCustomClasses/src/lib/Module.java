package lib;

public class Module {

    private String code, name;
    private int examWeight, cwkWeight;

    public Module(){
        code = "CTEC0000";
        name = "";
        examWeight = 50;
        cwkWeight = 50;
    }

    public Module(String code, String name){
        this.code = code;
        this.name = name;
        examWeight = 50;
        cwkWeight = 50;
    }

    public Module(String code, String name, int examWeight){
        this.code = code;
        this.name = name;
        this.examWeight = examWeight;
        cwkWeight = 100 - examWeight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExamWeight() {
        return examWeight;
    }

    public void setExamWeight(int examWeight) {
        this.examWeight = examWeight;
        cwkWeight = 100 - examWeight;
    }

    public int getCwkWeight() {
        return cwkWeight;
    }

    public void setCwkWeight(int cwkWeight) {
        this.cwkWeight = cwkWeight;
        examWeight = 100 - cwkWeight;
    }

    @Override
    public String toString(){
        return "Module:[code=" + code + ", name=" + name + ", exam weight=" + examWeight + ", coursework weight=" + cwkWeight + "]";
    }
}
