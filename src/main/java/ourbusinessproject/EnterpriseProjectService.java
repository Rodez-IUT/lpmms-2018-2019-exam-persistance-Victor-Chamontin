package ourbusinessproject;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.TransactionalException;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

@Service
@Transactional
public class EnterpriseProjectService {

    @PersistenceContext
    private EntityManager entityManager;

    public Project saveProjectForEnterprise(Project project, Enterprise enterprise) {
        saveEnterprise(enterprise);
        project.setEnterprise(enterprise);
        enterprise.addProject(project);
        ((Session)entityManager.getDelegate()).saveOrUpdate(project);
        //entityManager.persist(project);
        entityManager.flush();
        return project;
    }

    public Enterprise saveEnterprise(Enterprise enterprise) {
    	((Session)entityManager.getDelegate()).saveOrUpdate(enterprise);

    	/*Collection<Project> collectionProject = enterprise.getProjects();
    	if (collectionProject != null) {
	    	for (Project pro : collectionProject) {
	    		Project p = entityManager.merge(pro);
	    		enterprise.addProject(p);
	    	}
    	}*/
    	/*if(entityManager.find(Enterprise.class, enterprise.getId()) == enterprise) {
    		Enterprise e = entityManager.merge(enterprise);
    		enterprise = e;
    	} else {*/
    		
    	//}
    	//entityManager.persist(enterprise);
    	entityManager.flush();
        return enterprise;
    }

    public Project findProjectById(Long id) {
        return entityManager.find(Project.class, id);
    }

    public Enterprise findEnterpriseById(Long id) {
        return entityManager.find(Enterprise.class, id);
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Project> findAllProjects() {
        TypedQuery<Project> query = entityManager.createQuery("select p from Project p join fetch p.enterprise order by p.title", Project.class);
        return query.getResultList();
    }
}
