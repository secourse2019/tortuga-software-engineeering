package transpositionwithkey.vargetters;

import transpositionwithkey.data.types.Pair;

public class SymbolCodeGetter implements IVarGetter {
    @Override
    public int get(Pair value) {
        return value.symbolCode;
    }
}
