package com.eoi.modelo;
public class Animales {
    private String AnimalNombre;
    private String AnimalTipo;
    private String AnimalEdad;
    private int AnimalId;
    private String AnimalRaza;
    private String AnimalSexo;
    private int AnimalAlta;
    private String AnimalPath;

    public Animales() {
        super();

    }
    public Animales(String AnimalNombre, String AnimalTipo, String AnimalEdad, int AnimalId,  String AnimalRaza,
            String AnimalSexo, int AnimalAlta, String AnimalPath) {
        super();
        this.AnimalNombre = AnimalNombre;
        this.AnimalTipo = AnimalTipo;
        this.AnimalEdad = AnimalEdad;
        this.AnimalId = AnimalId;
        this.AnimalRaza = AnimalRaza;
        this.AnimalSexo = AnimalSexo;
        this.AnimalAlta = AnimalAlta;
        this.AnimalPath = AnimalPath;
    }
    public String getAnimalNombre() {
        return AnimalNombre;
    }
    public void setAnimalNombre(String AnimalNombre) {
        AnimalNombre = AnimalNombre;
    }
    public String getAnimalTipo() {
        return AnimalTipo;
    }
    public void setAnimalTipo(String AnimalTipo) {
        AnimalTipo = AnimalTipo;
    }
    public String getAnimalEdad() {
        return AnimalEdad;
    }
    public void setAnimalEdad(String AnimalEdad) {
        AnimalEdad = AnimalEdad;
    }
    public int getAnimalId() {
        return AnimalId;
    }
    public void setAnimalId(int AnimalId) {
        AnimalId = AnimalId;
    }
    public String getAnimalRaza() {
        return AnimalRaza;
    }
    public void setAnimalRaza(String AnimalRaza) {
        AnimalRaza = AnimalRaza;
    }
    public String getAnimalSexo() {
        return AnimalSexo;
    }
    public void setAnimalSexo(String animalSexo) {
        AnimalSexo = animalSexo;
    }
    public int getAnimalAlta() {
		return AnimalAlta;
	}
	public void setAnimalAlta(int AnimalAlta) {
		AnimalAlta = AnimalAlta;
	}
	public String getAnimalPath() {
		return AnimalPath;
	}
	public void setAnimalPath(String AnimalPath) {
		AnimalPath = AnimalPath;
	}
	@Override
	public String toString() {
		return "Animales [AnimalNombre=" + AnimalNombre + ", AnimalTipo=" + AnimalTipo + ", AnimalEdad=" + AnimalEdad
				+ ", AnimalId=" + ", AnimalRaza=" + AnimalRaza + ", AnimalSexo=" + AnimalSexo
				+ ", AnimalAlta=" + AnimalAlta + ", AnimalPath=" + AnimalPath + "]";
	}
	
}
