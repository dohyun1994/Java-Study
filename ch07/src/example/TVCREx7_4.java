//package example;
//
//class TV {
//	
//	boolean power;		// ��������(on/off)
//	int channel;		// ä��
//	
//	void power() {
//		power = !power;
//	}
//	
//	void channelUp() {
//		++channel;
//	}
//	
//	void channelDown() {
//		--channel;
//	}
//}
//
//class VCR {
//	
//	boolean power;		// ��������(on/off)
//	int counter = 0;
//	
//	void power() {}
//	void play() {}
//	void stop() {}
//	void rew() {}
//	void ff() {}
//}
//
//class TVCREx7_4 extends TV {
//
//		VCR vcr = new VCR();
//		
//		void play() {
//			vcr.play();
//		}
//		
//		void stop() {
//			vcr.stop();
//		}
//		
//		void rew() {
//			vcr.rew();
//		}
//		
//		void ff() {
//			vcr.ff();
//		}
//		
//}
//
//
