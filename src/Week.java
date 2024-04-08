public enum Week {
    Monday ("Java Backend"),
    Tuesday("Soft skilz"),
    Wednesday("League English"),
    Thurday("League Russian"),
    Friday("Java skrip"),
    Saturday("Task lesson"),
    Sunday("output");
    String str ;

    Week(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "\n"+ str ;
    }
}
