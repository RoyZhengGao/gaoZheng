package gaoZheng;

public class GaoZhengTai {

	public static void main(String[] args) {
		
		GaoZheng 高正 = new GaoZheng();
		
		高正.自我介绍();
		
		try {
			高正.找对象();
		} catch (GirlfriendCantFindException 没有对象) {
			System.out.println(没有对象.getMessage());
		}

	}

}
