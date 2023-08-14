class SBDemo{
	public static void main(String[] ar){
		StringBuffer sb =new StringBuffer (100);

		sb.append("ack");
		sb.append("feru");

		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("relu");
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
