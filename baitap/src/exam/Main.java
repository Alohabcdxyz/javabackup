package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> phim = new HashSet<>();
		phim.add("PhimMoi");
		phim.add("Netflix");
		phim.add("MePhim");
		phim.add("ZingTV");
		phim.add("ZingTV");
		System.out.println(phim.toString());
		System.out.println(phim.size());
		int occurrences0 = Collections.frequency(phim, "ZingTV");
		
		List<String> phim1 = new ArrayList<>();
		phim1.add("PhimMoi");
		phim1.add("PhimMoi");
		phim1.add("Netflix");
		phim1.add("Netflix");
		phim1.add("Netflix");
		System.out.println(phim1.toString());
		System.out.println(phim1.size());
		int occurrences = Collections.frequency(phim1, "PhimMoi");
		int occurrences1 = Collections.frequency(phim1, "Netflix");
		System.out.println("PhimMoi xuất hiện " + occurrences + " lần");
		System.out.println("Netflix xuất hiện " + occurrences1 + " lần");
	}

}
