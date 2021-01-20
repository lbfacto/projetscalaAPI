import swing.
import swing.event.
object MyApp extends SimpleSwingApplicationþ{
  val myButton = new Button {
    action = Action ("Clickþhere"){
      println("Thanks")
    }
  }
    def top =  new MainFrame {
    title = "MyApplicationþ"
      contents = myButton
      
      class Professeur(var idProfesseur: String, var nomProfesseur: String, var prenomProf: String){
        def idProf = idProfesseur
        def nomPro = nomProfesseur
        def prenomProf = prenomProfesseur
        
      class  Etudiant(var idstudent: String, var nomstudent: String, var prenomstudent: String, var niveau: String){
        def idEtudiant = idstudent
        def nomEtudiant = nomstudent
        def prenomEtudiant = prenomstudent
        def niveauEtude = niveau
        
      class Salle(var numeroSalle: Int, var libelleSalle: String){
        def numSalle = numeroSalle
        def libelle_Salle = libelleSalle
      class  Matiere(var codeMatiere: String, var libelleMatiere: String, var coeffMatiere: Int){
        def idMatiere = codeMatiere
        def lib_Matiere = libelleMatiere
        def coeff_Matiere = coeffMatiere

  }
}
