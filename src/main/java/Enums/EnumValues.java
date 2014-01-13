package Enums;

import java.util.EnumSet;

public class EnumValues {
    public static void main(String[] args) {
        for (Enum enumValue : Enum.values()) {
            System.out.printf("Name: %s Desc: %s and Age: %d\n", enumValue,
                    enumValue.getDesc(), enumValue.getAge());
        }
        EnumValues enumValues = new EnumValues();
        enumValues.enumRanges();
    }

    private void enumRanges() {
        for(Enum enumRange: EnumSet.range(Enum.BEN, Enum.JOYCE)){
            System.out.printf("Print range: %s %d %s\n", enumRange, enumRange.getAge(), enumRange.getDesc());
        }

    }
}
