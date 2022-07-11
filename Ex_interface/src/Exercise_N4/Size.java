package Exercise_N4;

public enum Size {

    XXS(32){
        public String getDescription() { return "Детский размер";}
    },
    XS(34){
        public String getDescription() { return "Взрослый размер";}
    },
    S(36){
        public String getDescription() { return "Взрослый размер";}
    },
    M(38){
        public String getDescription() { return "Взрослый размер";}
    },
    L(40){
        public String getDescription() { return "Взрослый размер";}
    };
    public abstract String getDescription();

    private int euroSize;
    Size(int euroSize) {

        this.euroSize = euroSize;
    }
}
