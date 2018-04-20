package action.concert;

public class PerformanceImpl implements Performance {
    @Override
    public void perform(int num) {
        System.out.println("开始表演!" + num);
    }
}
