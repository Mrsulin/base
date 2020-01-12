package club.sulin.enumc;

/**
 * Title: aclass
 *
 * @author sulin
 * @date 2019-07-31
 */
public enum aclass {
    AAA(1, "欢"),
    BBB(2, "迎"),
    CCC(3, "来"),
    DDD(4, "到"),
    EEE(5, "枚"),
    FFF(6, "举"),
    GGG(7, "类");
    private final int value;
    private final String name;

    private aclass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.value+"<"+this.name+">";
    }
}
