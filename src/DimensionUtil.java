
public class DimensionUtil {
	public enum ScaleType {
		CENTER_CROP, CENTER_INSIDE, FILL
	}

	public static Size getCenterCropScaledSize(int sourceWidth, int sourceHeight, int targetWidth, int targetHeight,
			ScaleType type) {
		Size result = new Size(targetWidth, targetHeight);
		float sourceRatio = (float) sourceWidth / sourceHeight;
		float targetRatio = (float) targetWidth / targetHeight;
		final float widthScaleRatio = (float) targetWidth / sourceWidth;
		float heightScaleRatio = (float) targetHeight / sourceHeight;

		switch (type) {
			case CENTER_CROP:
				if (sourceRatio < targetRatio) {
					// width based
					result.setHeight(sourceHeight * widthScaleRatio);
				} else if (sourceRatio > targetRatio) {
					// height based
					result.setWidth(sourceWidth * heightScaleRatio);
				}
				break;
			case CENTER_INSIDE:
				if (sourceRatio > targetRatio) {
					// width based
					result.setHeight(sourceHeight * widthScaleRatio);
				} else if (sourceRatio < targetRatio) {
					// height based
					result.setWidth(sourceWidth * heightScaleRatio);
				}
				break;
			default:
				// FILL ignore aspect ratio
		}
		
		return result;
	}
}
