package Thread;






public class ThreadsData extends Thread {
//thread: multiprogrammation au sein d'un meme programme
	//soit par Thread ou soit par Runnable
	
	public String texte=" bonjour";
	public int nb;
	public long attente;
	
	public ThreadsData(String texte, int nb, long attente)  throws InterruptedException{
		
		this.texte=texte;
		this.nb=nb;
		this.attente=attente;
	}
	
	public void run() {
		
		
		try
		{for(int i=0; i<nb; i++) {
			System.out.print(texte);
			sleep(attente);
		}}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally { System.out.println(" ici on teste les threads");}
		
	}
}
