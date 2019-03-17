package softwaretest;

public class homework1 {
	public static boolean flag = false;
	static int[] cost_tt = {50,20,5,5,1,1,1};
	int[] num_tt = {1,1,2,3};
	
	public static boolean triangle(int x){
		int[] cost = {50,20,5,1};
		int[] num = {1,1,2,3};
		int[] dp = new int[1110];
		int len = cost.length;
		for(int i=1;i< 1110;i++)
		    dp[i] = 0x3f3f3f3f;
		for(int i = 0;i < 4;i++){
			for(int j = x;j >= cost[i];j--){
				for(int k = 0;k <= num[i];k++){
					if(j >= k*cost[i]){
						//System.out.println(j);
						dp[j] = Math.min(dp[j-k*cost[i]]+k, dp[j]);
					}
				}
			}
		}
		if(dp[x] == 0x3f3f3f3f){
			return false;
		}else{
			System.out.println(dp[x]);
			return true;
		}
	}
	
	public static void dfs(int floor,int index,int value,int x){
		if(value == x){
			flag = true;
			return ;
		}else if(index == 7||value > x){
			return ;
		}
		int begin = index;
		if(floor == -1){
			for(int i = 0;i < 7;i++){
				dfs(0,i,cost_tt[i],x);
			}
		}else{
			for(int i = index+1;i < 7;i++){
				dfs(0,i,cost_tt[i]+value,x);
			}
		}
		
	}
	
	public static boolean ss(int x){
		flag = false;
		dfs(-1,0,0,x);
		//System.out.println(flag);
		if(flag == true){
			return true;
		}else{
			return false;
		}
	}
	
//	public static void main(String[] args){
//		System.out.println(ss(100));
//	}
	
}
