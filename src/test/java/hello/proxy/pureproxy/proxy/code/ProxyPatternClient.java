package hello.proxy.pureproxy.proxy.code;

public class ProxyPatternClient {

    private Subject subject;

    public ProxyPatternClient(RealSubject realSubject) {
        this.subject = realSubject;
    }

    public void execute() {
        subject.operation();
    }

}
