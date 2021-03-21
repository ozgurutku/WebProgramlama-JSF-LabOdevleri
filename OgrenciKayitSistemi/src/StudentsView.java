import java.util.List;

import javax.persistence.EntityManager;

public class StudentsView {
	
	private Students students = new Students();
	
	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(students);
		en.getTransaction().commit();
		students = new Students();
	}
	
	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(students);
		en.getTransaction().commit();
		students = new Students();
	}
	
	public void guncelle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(students);
		en.getTransaction().commit();
		students = new Students();
	}
	
	public List<Students> kayitlariGetir() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from Students").getResultList();
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}
	
}
