public class Main {

	public static void main(String[] args) {
		int width = 300;
		int height = 960;
		int frameWidth = 1080;
		int frameHeight = 1920;

		Size result = DimensionUtil.getCenterCropScaledSize(width, height, frameWidth, frameHeight,
				DimensionUtil.ScaleType.CENTER_CROP);
		System.out.println(DimensionUtil.ScaleType.CENTER_CROP.name() + " : " + result);

		result = DimensionUtil.getCenterCropScaledSize(width, height, frameWidth, frameHeight,
				DimensionUtil.ScaleType.CENTER_INSIDE);
		System.out.println(DimensionUtil.ScaleType.CENTER_INSIDE.name() + " : " + result);

		result = DimensionUtil.getCenterCropScaledSize(width, height, frameWidth, frameHeight,
				DimensionUtil.ScaleType.FILL);
		System.out.println(DimensionUtil.ScaleType.FILL.name() + " : " + result);
	}

}
