package transpositionwithkey.vargetters;

import transpositionwithkey.data.types.Pair;

public class PrevIndexGetter implements IVarGetter {
    @Override
    public int get(Pair value) {
        return value.prevIndex;
    }
}
