package cloudace.ca.androiduniversityappv1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.card.MaterialCardView

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        view.findViewById<MaterialCardView>(R.id.card_courses).setOnClickListener {
            Toast.makeText(requireContext(), "Courses clicked", Toast.LENGTH_SHORT).show()
            // Navigate to courses list fragment or activity
        }

        view.findViewById<MaterialCardView>(R.id.card_instructors).setOnClickListener {
            Toast.makeText(requireContext(), "Instructors clicked", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<MaterialCardView>(R.id.card_students).setOnClickListener {
            Toast.makeText(requireContext(), "Students clicked", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<MaterialCardView>(R.id.card_markings).setOnClickListener {
            Toast.makeText(requireContext(), "Markings clicked", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<MaterialCardView>(R.id.card_assignments).setOnClickListener {
            Toast.makeText(requireContext(), "Assignments clicked", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<MaterialCardView>(R.id.card_notifications).setOnClickListener {
            Toast.makeText(requireContext(), "Notifications clicked", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
