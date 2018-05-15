package builder;

/**
 * 汉堡饮食Item实现类
 */
public abstract  class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;
}
