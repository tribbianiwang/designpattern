package designpattern.prototype.deepclone;

public class TestDeepProto {
    public static void main(String[] args) {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("宋江");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("吃红糖","嚯芝麻酱"));

        //重写clone方法
//        DeepProtoType deepProtoTypeClone1 = (DeepProtoType) deepProtoType.clone();
//        DeepProtoType deepProtoTypeClone2 = (DeepProtoType) deepProtoType.clone();
//        DeepProtoType deepProtoTypeClone3 = (DeepProtoType) deepProtoType.clone();

        //序列化
        DeepProtoType deepProtoTypeClone1 = (DeepProtoType) deepProtoType.clone();
        DeepProtoType deepProtoTypeClone2 = (DeepProtoType) deepProtoType.clone();
        DeepProtoType deepProtoTypeClone3 = (DeepProtoType) deepProtoType.clone();

        System.out.println(deepProtoType);
        System.out.println(deepProtoTypeClone1);
        System.out.println(deepProtoTypeClone2);
        System.out.println(deepProtoTypeClone3);

    }
}
