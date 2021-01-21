import factory.Furniture;
import factory.impl.ModernFurniture;
import factory.impl.VictorianFurniture;
import product.Chair;
import product.Desk;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {

		Furniture modernFurniture = getFurniture(FurnitureStyle.MODERN);

		Desk modernDesk = modernFurniture.createDesk();
		Chair modernChair = modernFurniture.createChair();
		modernDesk.info();
		modernChair.info();

		Furniture victorianFurniture = getFurniture(FurnitureStyle.VICTORIAN);

		Desk victorianDesk = victorianFurniture.createDesk();
		Chair victorianChair = victorianFurniture.createChair();
		victorianDesk.info();
		victorianChair.info();

	}

	public static Furniture getFurniture(FurnitureStyle style) {
		switch (style) {
			case MODERN: return new ModernFurniture();
			case VICTORIAN: return new VictorianFurniture();
		}
		return null;
	}
}
