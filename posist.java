
public class posist {
	
		public class Node {
			public String hash;
			public String previousHash;
			private long timestamp;;
			private String data;
			int node_num ;
			String node_id;
			ArrayList<Node> childref;
			String genesisref;
			String parentref;
			
			Node(String data,String previousHash){
				this.data = data;
				this.previousHash = previousHash;
				//this.timestamp = new Date().getTime();
				childref=new ArrayList<>();
				this.hash = calculateHash(); 
			}
		
			public String calculateHash() {
		    		String calculatedhash = StringUtil.applySha256( 
		    				previousHash +
		    				Long.toString(timestamp) +
		    				data + node_id+ childref+ parentref+ genesisref
		    				);
		    		return calculatedhash;
		    	}
			 
		
			
			
		
		
		}
       static Node Gnode;
       
       
       
       private static void hashcode(Date timestamp,String data,int node_num,String node_id,String[] childref,String genesisref){
    	   
       }
  	 
       public static class StringUtil {
 		//Applies Sha256 to a string and returns the result. 
 		public static String applySha256(String input){		
 			try {
 				MessageDigest digest = MessageDigest.getInstance("SHA-256");	        
 				//Applies sha256 to our input, 
 				byte[] hash = digest.digest(input.getBytes("UTF-8"));	        
 				StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
 				for (int i = 0; i < hash.length; i++) {
 					String hex = Integer.toHexString(0xff & hash[i]);
 					if(hex.length() == 1) hexString.append('0');
 					hexString.append(hex);
 				}
 				return hexString.toString();
 			}
 			catch(Exception e) {
 				throw new RuntimeException(e);
 			}
 		}	
 	}

	
}
