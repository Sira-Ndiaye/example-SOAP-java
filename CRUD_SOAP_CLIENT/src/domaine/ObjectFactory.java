
package domaine;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the domaine package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ModifierUtilisateurResponse_QNAME = new QName("http://domaine/", "modifierUtilisateurResponse");
    private final static QName _SupprimerUtilisateurResponse_QNAME = new QName("http://domaine/", "supprimerUtilisateurResponse");
    private final static QName _RecupererUtilisateurs_QNAME = new QName("http://domaine/", "recupererUtilisateurs");
    private final static QName _SeConnecterResponse_QNAME = new QName("http://domaine/", "seConnecterResponse");
    private final static QName _User_QNAME = new QName("http://domaine/", "user");
    private final static QName _AjouterUtilisateur_QNAME = new QName("http://domaine/", "ajouterUtilisateur");
    private final static QName _RecupererUtilisateursResponse_QNAME = new QName("http://domaine/", "recupererUtilisateursResponse");
    private final static QName _ModifierUtilisateur_QNAME = new QName("http://domaine/", "modifierUtilisateur");
    private final static QName _AjouterUtilisateurResponse_QNAME = new QName("http://domaine/", "ajouterUtilisateurResponse");
    private final static QName _SeConnecter_QNAME = new QName("http://domaine/", "seConnecter");
    private final static QName _SupprimerUtilisateur_QNAME = new QName("http://domaine/", "supprimerUtilisateur");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: domaine
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifierUtilisateur }
     * 
     */
    public ModifierUtilisateur createModifierUtilisateur() {
        return new ModifierUtilisateur();
    }

    /**
     * Create an instance of {@link AjouterUtilisateurResponse }
     * 
     */
    public AjouterUtilisateurResponse createAjouterUtilisateurResponse() {
        return new AjouterUtilisateurResponse();
    }

    /**
     * Create an instance of {@link SeConnecter }
     * 
     */
    public SeConnecter createSeConnecter() {
        return new SeConnecter();
    }

    /**
     * Create an instance of {@link SupprimerUtilisateur }
     * 
     */
    public SupprimerUtilisateur createSupprimerUtilisateur() {
        return new SupprimerUtilisateur();
    }

    /**
     * Create an instance of {@link ModifierUtilisateurResponse }
     * 
     */
    public ModifierUtilisateurResponse createModifierUtilisateurResponse() {
        return new ModifierUtilisateurResponse();
    }

    /**
     * Create an instance of {@link SupprimerUtilisateurResponse }
     * 
     */
    public SupprimerUtilisateurResponse createSupprimerUtilisateurResponse() {
        return new SupprimerUtilisateurResponse();
    }

    /**
     * Create an instance of {@link RecupererUtilisateurs }
     * 
     */
    public RecupererUtilisateurs createRecupererUtilisateurs() {
        return new RecupererUtilisateurs();
    }

    /**
     * Create an instance of {@link SeConnecterResponse }
     * 
     */
    public SeConnecterResponse createSeConnecterResponse() {
        return new SeConnecterResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link AjouterUtilisateur }
     * 
     */
    public AjouterUtilisateur createAjouterUtilisateur() {
        return new AjouterUtilisateur();
    }

    /**
     * Create an instance of {@link RecupererUtilisateursResponse }
     * 
     */
    public RecupererUtilisateursResponse createRecupererUtilisateursResponse() {
        return new RecupererUtilisateursResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "modifierUtilisateurResponse")
    public JAXBElement<ModifierUtilisateurResponse> createModifierUtilisateurResponse(ModifierUtilisateurResponse value) {
        return new JAXBElement<ModifierUtilisateurResponse>(_ModifierUtilisateurResponse_QNAME, ModifierUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "supprimerUtilisateurResponse")
    public JAXBElement<SupprimerUtilisateurResponse> createSupprimerUtilisateurResponse(SupprimerUtilisateurResponse value) {
        return new JAXBElement<SupprimerUtilisateurResponse>(_SupprimerUtilisateurResponse_QNAME, SupprimerUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererUtilisateurs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "recupererUtilisateurs")
    public JAXBElement<RecupererUtilisateurs> createRecupererUtilisateurs(RecupererUtilisateurs value) {
        return new JAXBElement<RecupererUtilisateurs>(_RecupererUtilisateurs_QNAME, RecupererUtilisateurs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeConnecterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "seConnecterResponse")
    public JAXBElement<SeConnecterResponse> createSeConnecterResponse(SeConnecterResponse value) {
        return new JAXBElement<SeConnecterResponse>(_SeConnecterResponse_QNAME, SeConnecterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "ajouterUtilisateur")
    public JAXBElement<AjouterUtilisateur> createAjouterUtilisateur(AjouterUtilisateur value) {
        return new JAXBElement<AjouterUtilisateur>(_AjouterUtilisateur_QNAME, AjouterUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererUtilisateursResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "recupererUtilisateursResponse")
    public JAXBElement<RecupererUtilisateursResponse> createRecupererUtilisateursResponse(RecupererUtilisateursResponse value) {
        return new JAXBElement<RecupererUtilisateursResponse>(_RecupererUtilisateursResponse_QNAME, RecupererUtilisateursResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "modifierUtilisateur")
    public JAXBElement<ModifierUtilisateur> createModifierUtilisateur(ModifierUtilisateur value) {
        return new JAXBElement<ModifierUtilisateur>(_ModifierUtilisateur_QNAME, ModifierUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "ajouterUtilisateurResponse")
    public JAXBElement<AjouterUtilisateurResponse> createAjouterUtilisateurResponse(AjouterUtilisateurResponse value) {
        return new JAXBElement<AjouterUtilisateurResponse>(_AjouterUtilisateurResponse_QNAME, AjouterUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeConnecter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "seConnecter")
    public JAXBElement<SeConnecter> createSeConnecter(SeConnecter value) {
        return new JAXBElement<SeConnecter>(_SeConnecter_QNAME, SeConnecter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domaine/", name = "supprimerUtilisateur")
    public JAXBElement<SupprimerUtilisateur> createSupprimerUtilisateur(SupprimerUtilisateur value) {
        return new JAXBElement<SupprimerUtilisateur>(_SupprimerUtilisateur_QNAME, SupprimerUtilisateur.class, null, value);
    }

}
