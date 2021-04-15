package p08.textbook.exercise.ex4;

public class MySqlDao implements DataAccessobject {
	@Override
	public void delete() {
		System.out.println("MySpl DB에서 삭제");

	}

	@Override
	public void insert() {
		System.out.println("MySpl DB에 삽입");

	}

	@Override
	public void select() {
		System.out.println("MySpl DB에서 검색");

	}

	@Override
	public void update() {
		System.out.println("MySpl DB를 수정");

	}

}
