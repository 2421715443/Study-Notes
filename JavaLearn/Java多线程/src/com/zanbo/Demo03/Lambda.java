package com.zanbo.Demo03;

public class Lambda {

    //静态内部类
    static class Like2 implements Like {
        @Override
        public void iLike(int a) {
            System.out.println("学习" + a);
        }
    }

    public static void main(String[] args) {

        //匿名内部类
        Like like = new Like() {
            @Override
            public void iLike(int a) {
                System.out.println("学习" + a);
            }
        };
        like.iLike(1);

        //局部内部类
        class Like3 implements Like {
            @Override
            public void iLike(int a) {
                System.out.println("学习" + a);
            }
        }

        Like like2 = new Like2();
        like2.iLike(2);

        Like like1 = new Like3();
        like1.iLike(3);

        like1 = (int a) -> System.out.println("学习" + a);
        like1.iLike(4);


    }
}


interface Like {
    void iLike(int a);
}

