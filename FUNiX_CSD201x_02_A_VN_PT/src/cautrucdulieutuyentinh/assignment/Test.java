package cautrucdulieutuyentinh.assignment;

public class Test {
public static void main(String[] args) {
    System.out.print(func(2));
}
static int func (int n) 
{
    int result;
    if (n == 1)
        return 1;
    result = func (n - 1)*n;
    return result;
}
}
