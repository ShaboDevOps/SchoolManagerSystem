<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>CKEditor</title>
                <script src="https://cdn.ckeditor.com/4.14.0/standard/ckeditor.js"></script>
        </head>
        <body>
            <form action="#">
                <textarea name="editor1"></textarea>
                <script>
                        CKEDITOR.replace( 'editor1' );
                </script>
              <div class="form-group" style="padding-top: 2%; padding-left:90%;">
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-primary btn-md ">UPLOAD</button>
                </div>
                </form>
        </body>
</html>