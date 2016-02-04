package comp110;

/*
 * In this class, you'll be constructing all of your emoji face's
 * constituent shapes (face/skin shape, mouth, nose, eyes, etc) to
 * form a complex drawing made up of simpler drawings.
 */
class Baemoji extends Drawing {

  HeadShape _faceShape;
  Nose _nose;
  Mouth _mouth;
  Eye _leftEye;
  Eye _rightEye;

  Baemoji() {
    // Initialize all of your emoji's instance variable "components" here!
  }

  Shapes getShape() {
    Shapes container = new Shapes();

    container.add(_faceShape);

    // Translate, Scale, and/or Rotate the Mouth
    container.add(_mouth);

    // Translate, Scale, and/or Rotate the Nose
    container.add(_nose);

    // Translate, Scale, and/or Rotate the Left Eye
    container.add(_leftEye);

    // Translate, Scale, and/or Rotate the Right Eye
    container.add(_rightEye);

    return container;
  }

}