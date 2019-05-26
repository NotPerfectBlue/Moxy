package target;

import io.moxy.MvpPresenter;
import io.moxy.PresenterBinder;
import io.moxy.presenter.PresenterField;

import java.util.ArrayList;
import java.util.List;

import presenter.EmptyViewPresenter;

public class SimpleProvidePresenterTarget$$PresentersBinder extends PresenterBinder<SimpleProvidePresenterTarget> {
	public List<PresenterField<SimpleProvidePresenterTarget>> getPresenterFields() {
		List<PresenterField<SimpleProvidePresenterTarget>> presenters = new ArrayList<>(1);

		presenters.add(new PresenterBinder());

		return presenters;
	}

	public class PresenterBinder extends PresenterField<SimpleProvidePresenterTarget> {
		public PresenterBinder() {
			super("presenter", null, EmptyViewPresenter.class);
		}

		@Override
		public void bind(SimpleProvidePresenterTarget target, MvpPresenter presenter) {
			target.presenter = (EmptyViewPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(SimpleProvidePresenterTarget delegated) {
			return delegated.providePresenter();
		}
	}

}