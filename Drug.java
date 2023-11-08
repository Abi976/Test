
/**
 * Décrivez votre classe Drug ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Drug
{
    
    
    
    
    
    
    
    
    // cc
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    private String name; 
    private String laboratory; 
    private String indication; 
    private String activePrinciple;
    private String therapeuticClass;
    private boolean asthmaticContraIndication;
    private boolean pregnantContraIndication; 
    private int dosage; 
    private int posology;
    private int pillNumber;

    /**
     * Constructeur d'objets de classe Drug
     */
    public Drug(String name, String laboratory, String activePrinciple, String indication, String therapeuticClass, int dosage, int posology)
    {
        this.name= name; 
        this.laboratory = laboratory; 
        this.indication = indication; 
        this.activePrinciple = activePrinciple;
        this.therapeuticClass = therapeuticClass; 
        this.dosage = dosage; 
        this.posology = posology; 
    }
    
    public String getName(){
        return name; 
    }
    
    public String getLaboratory(){
        return laboratory; 
    }
    
    public String getActivePrinciple(){
        return activePrinciple; 
    }
    
    public String getIndication(){
        return indication;
    }
    
    public String getTherapeuticClass(){
        return therapeuticClass;
    }
    
    public int getDosage(){
        return dosage;
    }
    
    public boolean getPregnantContraIndication(){
        return pregnantContraIndication;
    }
    
    public boolean getAsthmaticContraIndication(){
        return asthmaticContraIndication;
    }
    
    public int getPosology(){
        return posology;
    }
    
    public int getPillNumber(){
        return pillNumber;
    }
    
     public void setPregnantContraIndication(boolean pregnant){
        this.pregnantContraIndication = pregnant; 
    }
    
    public void setAsthmaticContraIndication(boolean asthmatic){
        this.asthmaticContraIndication = asthmatic;
    }
    
    public void setPosology(int posology){
        if(posology > 0){
            this.posology = posology; 
        }
    }
    
    public void setPillNumber(int pillnumber){
        if(pillnumber > 0){
            this.pillNumber = pillnumber; 
        }
    }


    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int sampleMethod(int y)
    {
        // Insérez votre code ici
        return x + y;
    }
}
