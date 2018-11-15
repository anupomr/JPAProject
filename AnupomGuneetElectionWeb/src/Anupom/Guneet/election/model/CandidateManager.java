package Anupom.Guneet.election.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import Anupom.Guneet.elcetion.entities.Candidate;
import Anupom.Guneet.election.exceptions.CandidateException;

public class CandidateManager { 
	@PersistenceContext
	EntityManager em=EMFSupplier.getInstance().getEMF().createEntityManager();
    public CandidateManager() {
        super();
    }
    
    // First four methods do not need to be implemented because 
    // they not required in this exercise. However they would be 
    // implemented in a more generic bean used in other situations.
    
    public Anupom.Guneet.election.exceptions.CandidateException getCandidate(String CandidateCode) throws CandidateException {
    	// method not required for this exercise
    	return null;
    }
    
    public Candidate addCandidate(Candidate candidate) throws CandidateException {
    	// method not required for this exercise
    	return null;
    }
    
    public Candidate deleteCandidate(String CandidateCode) throws CandidateException {
    	// method not required for this exercise
    	return null;
    }
    
    public Candidate updateCandidate(Candidate Candidate) throws CandidateException {
    	// method not required for this exercise
    	return null;
    }
    
    // returns candidate information used to generate buttons on the ballot form
	public List<Candidate> getCandidates() {
		// complete this method and modify the next line to 
		TypedQuery< Candidate> tq=em.createNamedQuery("getAllCandidates", Candidate.class);
		List<Candidate> candidates=tq.getResultList();
		// return a list of candidates
		return candidates;
	}
}
