// Context, iteration 4
class Context {
    ContextType _isReverse;

    public Context(ContextType isReverse) {
        _isReverse = isReverse; // Default mode is normal
    }

    public Context() {
        this(ContextType.NORMAL);
    }

    public ContextType isReverse() {
        return _isReverse;
    }

    // public int interpretInteger(int value) {
    // return reverseMode ? -value : value;
    // }

    // public boolean interpretBoolean(boolean value) {
    // return reverseMode ? !value : value;
    // }
}
