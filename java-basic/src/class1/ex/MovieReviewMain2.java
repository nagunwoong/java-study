package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {

        MovieReview movieReview1 = new MovieReview();

        movieReview1.title = "어바웃 타임";
        movieReview1.review = "인생 영화";

        MovieReview movieReview2 = new MovieReview();

        movieReview2.title = "어밴져스";
        movieReview2.review = "히어로물 중에 최고";


        MovieReview[] movie = {movieReview1, movieReview2};

        for (int i = 0; i < movie.length; i++) {
            System.out.println("영화 제목 : " + movie[i].title + " , " + " 리뷰는 : " + movie[i].review);
        }

        for (MovieReview movieReview : movie) {
            System.out.println("영화 제목 : " + movieReview.title + " , " + " 리뷰는 : " + movieReview.review);
        }
    }

}
