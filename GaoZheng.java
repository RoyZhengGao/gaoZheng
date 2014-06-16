package gaoZheng;

import java.util.List;

public final class GaoZheng {
	
	public final List<Object> numberOfPotentialGirlfriend = null;
	
	public final boolean isRich = false;
	
	public long weight = 210;
	
	public final int numberOfExGirlfriend = 1;
	
	public final boolean isVirgin = true;
	
	public final byte duration = 1;		//1 second
	
	public final void 找对象() throws GirlfriendCantFindException {
		
		try {
			for (Object DuiXiang : this.numberOfPotentialGirlfriend) {
				System.out.println(DuiXiang.toString());
			}
		} catch (NullPointerException exception) {
			throw new GirlfriendCantFindException();
		}
		
	}
	
	public final void 自我介绍() {
		System.out.println("大家好，我是高正！下面是我的基本信息：");
		System.out.println("身高是秘密，体重" + this.weight);
		System.out.println("我的择偶标准是：有车有房，父母双亡！");
		System.out.println("我心中女神众多，可是");
	}
	
}
