from flask import Flask,render_template,url_for,request,redirect

app = Flask(__name__)

# @app.route("/")
# def hello_world():
#     return "<p>Hello, Nayan</p>"

# @app.route("/welcome.html")
# def mypage():
#     return render_template('index.html')
# @app.route("/about")
# def hello_world2():
#     return "<p>Hello, Nayan</p>"


# @app.route('/<username>')
# def show_user_profile(username=None):
#     # show the user profile for that user
#     return render_template('index.html',username=username)


# @app.route('/<username>/<int:id>')
# def show_user_profile1(username=None,id=None):
#     # show the user profile for that user
#     return render_template('index.html',username=username,id=id)

# @app.route("/")
# def my_portfolio_home():
#     return render_template('index.html')

# @app.route("/index.html")
# def my_portfolio_index():
#     return render_template('index.html')

# @app.route("/works.html")
# def my_portfolio_work():
#     return render_template('works.html')

# @app.route("/about.html")
# def my_portfolio_about():
#     return render_template('about.html')


# @app.route("/contact.html")
# def my_portfolio_contact():
#     return render_template('contact.html')


@app.route("/<string:page_name>")
def my_portfolio_component(page_name=None):
    return render_template(page_name)



@app.route('/submit', methods=['POST', 'GET'])
def submit_form():
    if request.method=="POST":
        data=request.form.to_dict()
        # print(data['email'])

        return redirect("/thankyou.html")
    else:
        return "Something went wrong"



