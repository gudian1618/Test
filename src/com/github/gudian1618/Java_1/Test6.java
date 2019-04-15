package com.github.gudian1618.Java_1;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @descript
 * @date 2019/2/22 14:42
 */
public class Test6 {
    
    public static void main(String[] args) {
//        CosmeticManager cm = new CosmeticManager();
//        SortCosmeticManager cm = new SortCosmeticManager();
        ImportCosmeticManager cm = new ImportCosmeticManager();
        cm.add(new Cosmetic("香奈儿", "进口", 1000));
        cm.add(new Cosmetic("圣罗兰", "进口", 800));
        cm.add(new Cosmetic("大宝", "国产", 20));
        cm.add(new Cosmetic("万紫千红", "国产", 15));
        cm.printInfo();
    
    }
    
}
// 可输出进口化妆品的管理类
class ImportCosmeticManager extends CosmeticManager {
    
    @Override
    public void printInfo() {
        
        // 比较两个字符串的值是否相等，不能使用==，使用equals()
        for (int i=0; i<count; i++) {
            if ("进口".equals(cs[i].getType())) {
                System.out.println(cs[i].getInfo());
                
            }
        }
    }
}


// 排序管理
class SortCosmeticManager extends CosmeticManager {
    // 排序输出产品
    @Override
    public void printInfo() {
        Cosmetic[] temp = java.util.Arrays.copyOf(cs, count);
        
        Cosmetic c = null;
        int L = temp.length;
        for (int i=0; i<L-1; i++) {
            for (int j=0; j<L-1; j++) {
                if (temp[j].getPrice()>temp[j+1].getPrice()) {
                    c = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = c;
                }
            }
        }
        
        for (Cosmetic cosmetic: temp) {
            System.out.println(cosmetic.getInfo());
        }
    }
}

// 化妆品管理类
class CosmeticManager {
    
    protected Cosmetic[] cs = new Cosmetic[4];
    protected int count = 0;
    // 进货功能
    public void add(Cosmetic c) {
        int size = cs.length;
        if (count>=size) {
            int newLen = size*2;
            cs = java.util.Arrays.copyOf(cs, newLen);
        }
        cs[count] = c;
        count++;
    }
    
    // 输出所有产品
    public void printInfo() {
        for (int i=0; i<count; i++) {
            System.out.println(cs[i].getInfo());
        }
    }
    
    
    public void setCount(int count) {
        this.count = count;
    }
}

// 化妆品类
class Cosmetic {
    
    private String name;
    private String type;
    private int price;
    
    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String getInfo() {
        return "name:"+name+",type:"+type+",price:"+price;
    }
}
