package progFuncional.LambdasDevDojo.classes;

@FunctionalInterface //disse que essa interface ter� apenas um met abstrato e usarei ela usando Lambda!!
public interface CarroPredicate {
	
	boolean test(Carro carro);
}
