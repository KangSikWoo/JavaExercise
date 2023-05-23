package NestedClassInterface;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect(); //구현 객체의 바로 밑에 있는 중첩 인터페이스 onSelect() 메소드 호출 
	}
	
	static interface OnSelectListener {
		void onSelect();
	}

}
