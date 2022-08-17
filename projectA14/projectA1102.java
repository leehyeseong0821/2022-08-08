package projectA14;

public class projectA1102 {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellphone = new DmbCellPhone("자바폰","검은색",10);
		 
		System.out.println("모델:"+dmbCellphone.modle);
		System.out.println("색상:"+dmbCellphone.color);
		System.out.println("채널:"+dmbCellphone.channel);
		     
        dmbCellphone.PowerOn();
        dmbCellphone.bell();
        dmbCellphone.sendVoice("여보세요");
        dmbCellphone.recevieVoice("누구세요");
        dmbCellphone.sendVoice("접니다.");
        dmbCellphone.hangUp();
        dmbCellphone.PowerOff();
        
        
        dmbCellphone.tunrOnDmb();
        dmbCellphone.changeChannelDmb(20);
        dmbCellphone.turnOFFDmb();
        dmbCellphone.PowerOff();
	}

}
