package Experience_3_1;

public abstract class SearchContext {
    protected SearchContext successtor;

    abstract void handlerRequest(TextBean text);

    public void setSuccesstor(SearchContext successtor) {
        this.successtor = successtor;
    }
}
