package Exercise_N3;

public enum Season {

    WINTER(-17.0){
        public String getDescription(){ return "Холоное время года";}
    },
    SPRING(+16){
        public String getDescription() { return "Теплое время года";}
    },
    SUMMER(+29){
        public String getDescription() { return "Жаркое время года";}
    },
    AUTUMN(+7){
        public String getDescription() { return "Холодное время года";}
    };
    public abstract String getDescription();

    private double avgTemp;
    Season(double avgTemp) {

        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }
}
