package designpattern.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public Object deepClone() {
//创建流对象
ByteArrayOutputStream bos = null;
ObjectOutputStream oos = null;
ByteArrayInputStream bis = null;
ObjectInputStream ois = null;


        try {
            //序列化
            bos = new ByteArrayOutputStream(); oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray()); ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();
            return copyObj;
            } catch (Exception e) {
             return null;
            } finally {
            //关闭流
        try {
        bos.close();
        oos.close();
        bis.close();
        ois.close();
    } catch (Exception e2) {

    }
        }
}










@Override
    protected Object clone() {
        //方式1使用clone方法
        DeepProtoType targetDeepProtoType = null;
        try{
            targetDeepProtoType = (DeepProtoType) super.clone();
            targetDeepProtoType.setDeepCloneableTarget((DeepCloneableTarget) deepCloneableTarget.clone());
        }catch (Exception e){
            System.out.println(e);
        }

        return targetDeepProtoType;


    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ",hashCode="+hashCode()+'\''+
                ", deepCloneableTarget=" + deepCloneableTarget.toString() +
                '}';
    }
}
