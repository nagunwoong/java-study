package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {

        MovieReview movieReview1 = new MovieReview();

        movieReview1.title = "어바웃 타임";
        movieReview1.review = "인생 영화";

        MovieReview movieReview2 = new MovieReview();

        movieReview2.title = "어밴져스";
        movieReview2.review = "히어로물 중에 최고";


        System.out.println("영화 제목 : " + movieReview1.title + " , " + " 리뷰는 : " + movieReview1.review);
        System.out.println("영화 제목 : " + movieReview2.title + " , " + " 리뷰는 : " + movieReview2.review);


    }

}
