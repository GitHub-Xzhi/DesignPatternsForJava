package org.xzhi.builder;


import org.xzhi.builder.impl.DecorationPackageMenu;
import org.xzhi.builder.impl.ceiling.LevelOneCeiling;
import org.xzhi.builder.impl.ceiling.LevelTwoCeiling;
import org.xzhi.builder.impl.coat.DuluxCoat;
import org.xzhi.builder.impl.coat.LiBangCoat;
import org.xzhi.builder.impl.floor.ShengXiangFloor;
import org.xzhi.builder.impl.tile.DongPengTile;
import org.xzhi.builder.impl.tile.MarcoPoloTile;

public class DecorationBuilder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }

}
