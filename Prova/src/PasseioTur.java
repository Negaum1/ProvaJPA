import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passeiotur")
public class PasseioTur {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    @Column(name = "nome_passeio", nullable = true)
	    private String passeio;
	    private String descrição;
	    private int gdificuldade;
	    private String Cidade;
		public String getPasseio() {
			return passeio;
		}
		public void setPasseio(String passeio) {
			this.passeio = passeio;
		}
		public String getDescrição() {
			return descrição;
		}
		public void setDescrição(String descrição) {
			this.descrição = descrição;
		}
		public int getGdificuldade() {
			return gdificuldade;
		}
		public void setGdificuldade(int gdificuldade) {
			this.gdificuldade = gdificuldade;
		}
		public String getCidade() {
			return Cidade;
		}
		public void setCidade(String cidade) {
			Cidade = cidade;
		}
	    
	    
	    
	   

}
