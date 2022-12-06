package iterator;

public class DanhSachNguoiChoi implements Iterable {
	public String danhSachNguoiChoi[] = {"Nguyen Van A","Nguyen Van B",
	        "Nguyen Van C","Nguyen Van D","Nguyen Van E"};
	@Override
	public Iterator getIterator() {
		return new DanhSach();
	}
	private class DanhSach implements Iterator {
	    int index;
	    @Override
	    public boolean hasNext() {
	        if(index < danhSachNguoiChoi.length){
	            return true;
	        }
	        return false;
	    }
	    @Override
	    public Object next() {
	        if(this.hasNext()){
	            return danhSachNguoiChoi[index++];
	        }
	        return null;
	}
	}
}
