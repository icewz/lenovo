import javax.swing.JFrame;
//写一个类继承于 JFrame 
public class Frame extends JFrame{
    //构造方法
    public Frame(){
        //设置窗体的标题  来源于JFrame setTitle(标题);
        setTitle("图形化界面");
        //设置窗体的大小    setSize(宽度,高度);
        setSize(512,726);
        //设置窗体的位置 设置位置居中显示  setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        //如果不想改变窗口的大小 setResizable(false);
        setResizable(false);
        //窗口关闭后所打开的程序并没有关闭,会大大影响运行内存,所以我们可以每次关闭的时候关闭程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //运行

    }
    public static void main(String args[]){
        //创建Frame的对象
        Frame frame = new Frame();
        //显示窗口    true 是显示窗口,false 是隐藏窗口
        frame.setVisible(true);
    }
}