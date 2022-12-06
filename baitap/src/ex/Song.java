	package ex;
	
	import java.util.Date;
	
	public class Song {
		private String name;
		private int listens;
		private String rewards;
		private Date born;
		private Singer singer;
		
		public Song(String name, int listens, String rewards, Date born, Singer singer) {
			super();
			this.name = name;
			this.listens = listens;
			this.rewards = rewards;
			this.born = born;
			this.singer = singer;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public int getListens() {
			return listens;
		}
	
		public void setListens(int listens) {
			this.listens = listens;
		}
	
		public String getRewards() {
			return rewards;
		}
	
		public void setRewards(String rewards) {
			this.rewards = rewards;
		}
	
		public Date getBorn() {
			return born;
		}
	
		public void setBorn(Date born) {
			this.born = born;
		}
	
		public Singer getSinger() {
			return singer;
		}
	
		public void setSinger(Singer singer) {
			this.singer = singer;
		}
	
		@Override
		public String toString() {
			return "Song [name=" + name + ", listens=" + listens + ", rewards=" + rewards + ", born=" + born + ", singer="
					+ singer + "]";
		}
		
		
		
	
	}
